package com.sinobest.framework.base.service.impl;


import com.sinobest.framework.base.dao.BaseDao;
import com.sinobest.framework.base.domain.DataTablesEntity;
import com.sinobest.framework.base.service.BaseService;
import com.sinobest.framework.util.StringUtil;
import com.sinobest.framework.utils.BeanUtil;
import com.sinobest.framework.utils.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/5 0005.
 *
 * BaseServiceImpl
 */
@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T>
{
    @Qualifier("baseDao")
    @Autowired
    public BaseDao<T> baseDao;

    @Qualifier("appJdbcService")
    @Autowired
    private JdbcService jdbcService;

    /**
     * 保存实体类对象
     * @param entity 实体类
     */
    @Override
    public void save(T entity) {
         baseDao.save(entity);
    }

    @Override
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public void delete(Serializable id) {
        baseDao.delete(id);
    }

    @Override
    public void delete(T entity) {
        baseDao.delete(entity);
    }

    /**
     * 根据ID 获取实体类对象
     * @param id  select查询对应的字段
     * @return 实体类对象
     */
    @Override
    public T getById(Serializable id){
        return baseDao.getById(id);
    }

    /**
     * 根据Hibernate的表名（注意是Hibernate映射的实体）、字段数组、字段数组值、其他子句 等进行条件查询
     */
    @Override
    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue, boolean like,  String clause){
        return baseDao.findByFields(tableName, fields, fieldsValue, like, clause);
    }

    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue, String clause){
        return baseDao.findByFields(tableName, fields, fieldsValue, false, clause);
    }

    @Override
    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue){
        return baseDao.findByFields(tableName, fields, fieldsValue, false, "");
    }

    /**
     * 根据Hibernate的表名（注意是Hibernate映射的实体）、单个字段、单个字段值、其他子句 等进行条件查询
     */
    public List<T> getByField(String tableName, String field, String fieldValue, boolean like, String clause){
        return baseDao.findByField(tableName, field, fieldValue, like, clause);
    }

    public List<T> getByField(String tableName, String field, String fieldValue, String clause){
        return baseDao.findByField(tableName, field, fieldValue, false, clause);
    }

    public List<T> getByField(String tableName, String field, String fieldValue){
        return baseDao.findByField(tableName, field, fieldValue, false, "");
    }

    @Override
    public List<T> getByHQL(String hql, Object... params) {
        return baseDao.findByHQL(hql, params);
    }

    @Override
    public List<T> findByHQLNative(String hql, Class<T> entityType, Object... params) {
        return baseDao.findByHQLNative(hql, entityType, params);
    }

    public List<T> getByHQLLimit(String hql, int limit, Object... params){
        return baseDao.findByHQLLimit(hql, limit, params);
    }

    public List<T> getByHQLLimit1(String hql, int start, int max, Object... params){
        return baseDao.findByHQLLimit(hql, start, max, params);
    }


    /**
     * 获取所有的实体类对象T
     *
     * @return list<T>
     */
    @Override
    public List<T> getAllEntity(String tableName) {
        return baseDao.getAllEntity(tableName);
    }

    public List<T> getAllEntityPage(String tableName, Integer startNum, Integer endNum){
        return baseDao.getAllEntityPage(tableName, startNum, endNum);
    }

    public List<T> getAllEntityPageParams(String tableName, Integer startNum, Integer endNum, String params){
        return baseDao.getAllEntityPageParams(tableName, startNum, endNum, params);
    }

    public Map<String, Object> queryByDataTablesBase(DataTablesEntity dtEntity,
                                                     String tableOrSql,
                                                     Class<T> entityClass) {
        //获取请求次数
        Integer draw = dtEntity.getDraw();
        //数据起始位置 组装后的数据，默认为start
        Integer start = dtEntity.getStartIndex();
        //数据长度, 默认为length
        Integer length = dtEntity.getPageSize();

        //总记录数
        String total;

        //过滤后记录数
        String recordsFiltered;

        //定义列名,根据log.js组装的列名
        String[] cols = BeanUtil.getFiledName(entityClass, false);
        //获取客户端需要那一列排序
        String orderColumn = dtEntity.getOrderColumn();
        //获取排序方式 默认为asc
        String orderDir = dtEntity.getOrderDir();
        if (orderDir == null) {
            orderDir = "desc";
        }

        //获取用户过滤框里的字符
        List<String> sArray = new ArrayList<>();

        String fuzzy = dtEntity.getFuzzySearch();
        String searchValue = dtEntity.getFuzzy();
        System.out.println("fuzzy = " + fuzzy + ", searchValue = " + searchValue);

        //全部字段模糊查询
        if ("true".equals(fuzzy)) {
            if (searchValue != null && !searchValue.equals("")) {
                for (String field : cols) {
                    StringBuilder sb = new StringBuilder();
                    if (field.equals("")) continue;
                    field = StringUtil.tranFieldName(field);
                    sb.append(" ").append(field).append(" like '%").append(searchValue).append("%'");
                    sArray.add(sb.toString());
                }
            }
            //查询字段模糊查询
        } else {
            for (String field : cols) {
                Object fieldValue = null;
                StringBuilder sb = new StringBuilder();
                try {
                    fieldValue =  BeanUtil.getFieldValueByName(field, dtEntity);
                } catch (Exception e) {
                    e.getMessage();
                }
                if (fieldValue == null || fieldValue.equals("")) {
                    continue;
                }
                sb.append(" ").append(StringUtil.tranFieldName(field)).append(" like '%").append(fieldValue).append("%'");
                sArray.add(sb.toString());
            }
        }

        //where字段查询条件
        StringBuilder individualSearch = new StringBuilder();
        if (sArray.size() == 1) {
            individualSearch = new StringBuilder(sArray.get(0));
        } else if (sArray.size() > 1) {
            for (int i = 0; i < sArray.size() - 1; i++) {
                if ("true".equals(fuzzy)) {
                    individualSearch.append(sArray.get(i)).append(" or ");
                } else {
                    individualSearch.append(sArray.get(i)).append(" and ");
                }
            }
            individualSearch.append(sArray.get(sArray.size() - 1));
        }

        //获取数据库总记录数
        String recordsTotalSql = "select count(1) as recordsTotal from " + tableOrSql;
        Map<String, Object> lm = (Map<String, Object>) jdbcService.queryForList(recordsTotalSql).get(0);
        /*Object totalQ = logDao.getCountBySQl(tableOrSql, entityClass);*/
        total = String.valueOf(lm.get("recordsTotal"));

        //条件查询，过滤查询总数SQL
        String recordsFilteredSql = "select count(1) as recordsFiltered from " + tableOrSql;
        String searchSQL = "";
        String sql = "SELECT * FROM " + tableOrSql;
        if (!individualSearch.toString().equals("")) {
            searchSQL = " where " + individualSearch;
        }
        sql += searchSQL;
        recordsFilteredSql += searchSQL;

        int isDateField = dtEntity.getIsDateField();
        if(orderColumn != null){
            orderColumn = StringUtil.tranFieldName(orderColumn);
            if(isDateField == 1) {
                sql += " order by " + orderColumn + " " + orderDir;
                recordsFilteredSql += " order by " + orderColumn + " " + orderDir;
            }else {
                sql += " order by " + " NVL(" + orderColumn + ", '0') " + " " + orderDir;
                recordsFilteredSql += " order by " + " NVL(" + orderColumn + ", '0') " + orderDir;
            }
        }
       /* sql += " limit " + start + ", " + length;*/
        String paginationSQL = " SELECT * " +
                "FROM ( " + " SELECT temp.* ,ROWNUM num " +
                "FROM ( " + sql + "　) temp " +
                "where ROWNUM <= " + (start + length) + " ) " +
                "WHERE　num > " + start;
        List<T> logs = baseDao.findByHQLNative(paginationSQL, entityClass);

        System.out.println(paginationSQL);

        //条件过滤的总记录数
        /*Long sqlRC = logDao.getCountByHQLNative(recordsFilteredSql);*/
        Map<String, Object> lmr = (Map<String, Object>) jdbcService.queryForList(recordsFilteredSql).get(0);
        /*Object totalQ = logDao.getCountBySQl(tableOrSql, entityClass);*/
        recordsFiltered = String.valueOf(lmr.get("recordsFiltered"));

        Map<String, Object> info = new HashMap<>();
        info.put("pageData", logs);
        info.put("total", total);
        info.put("recordsFiltered", recordsFiltered);
        info.put("draw", draw);

        return info;
    }
}
