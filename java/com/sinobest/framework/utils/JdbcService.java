package com.sinobest.framework.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.lob.LobHandler;

import java.util.List;
import java.util.Map;

/**
 * Created by liulv on 2017/7/13 0013.
 *
 *  JDBC服务类
 */
public class JdbcService<T> extends JdbcDaoSupport implements IJdbcService {
    private LobHandler lobHandler;

    /**
     * 分页查询
     */
    @Override
    public List pagedQuery(String sql, Object[] args, int[] argsType,
                           int pageNum, int pageSize) {
        if(0>=pageNum){
            throw new RuntimeException("pageNum start from 1.");
        }
        int startIndex = (pageNum - 1) * pageSize;
        int lastIndex = startIndex + pageSize;
        StringBuffer paginationSQL = new StringBuffer(" SELECT * FROM ( ");
        paginationSQL.append(" SELECT temp.* ,ROWNUM num FROM ( ");
        paginationSQL.append(sql);
        paginationSQL.append("　) temp where ROWNUM <= " + lastIndex);
        paginationSQL.append(" ) WHERE　num >= " + startIndex);
        return getJdbcTemplate().queryForList(paginationSQL.toString(), args,
                argsType);
    }

    /**
     * 支持大对象更新
     */
    @Override
    public int update(String sql,Object[] args, int[] argsType){
        return getJdbcTemplate().update(sql, new LobCreatorPreparedStatementSetter(
                args, argsType, lobHandler.getLobCreator()));
    }

    /**
     * 重写上方法，对于分页传入的是当前页的最开始数据量，以及结束数据量
     * @param sql
     * @param args
     * @param argsType
     * @param startIndex
     * @param lastIndex
     * @return
     */
    @Override
    public List queryPage(String sql, Object[] args, int[] argsType,
                          int startIndex, int lastIndex) {
        StringBuffer paginationSQL = new StringBuffer(" SELECT * FROM ( ");
        paginationSQL.append(" SELECT temp.* ,ROWNUM num FROM ( ");
        paginationSQL.append(sql);
        paginationSQL.append("　) temp where ROWNUM <= " + lastIndex);
        paginationSQL.append(" ) WHERE　num >= " + startIndex);
        return getJdbcTemplate().queryForList(paginationSQL.toString(), args,
                argsType);
    }

    /**
     * 用于返回所有数据量的操作
     * @param sql：sql语句
     * @param args：参数
     * @param argsType：参数类型
     * @return
     */
    @Override
    public int getCntQuery(String sql, Object[] args, int[] argsType) {
        return getJdbcTemplate().queryForObject(sql, args,Integer.class);
    }

    /**
     * 找单个对象
     */
    @Override
    public Map<String, Object> queryForSingle(String sql,Object[] args, int[] argsType){
        Map<String, Object> map = null;
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql, args, argsType);
        if(list.size()>0){
            map = list.get(0);
        }
        return map;
    }

    /**
     * 找单个对象，无参
     */
    @Override
    public Map<String, Object> queryForSingle(String sql){
        List<Map<String, Object>> list = getJdbcTemplate().queryForList(sql);
        Map<String, Object> map = null;
        if(list.size()>0){
            map = list.get(0);
        }
        return map;
    }

    /**
     * 按列表返回查找结果
     */
    @Override
    public List<Map<String, Object>> queryForList(String sql,Object[] args, int[] argsType){
        return getJdbcTemplate().queryForList(sql, args, argsType);
    }

    /**
     *  按照表返回查询结果
     */
    @Override
    public List<Map<String, Object>> queryForList(String sql){
        return getJdbcTemplate().queryForList(sql);
    }

    /**
     * 返回表查询结果的List实体
     */
    @Override
    public List<T> queryForListObject(String sql, Object[] args, Object entity) {
        return getJdbcTemplate().query(sql, args, new BeanPropertyRowMapper<>((Class<T>) entity.getClass()));
    }

    /**
     * 返回查询结果的List实体,无参
     */
    @Override
    public List<T> queryForListObject(String sql, Object entity){
        return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<>((Class<T>) entity.getClass()));
    }

    /**
     * 返回查询结果的实体
     */
    @Override
    public T queryForObject(String sql, Object[] args, Object entity){
        List<T> list = getJdbcTemplate().query(sql, args, new BeanPropertyRowMapper<>((Class<T>) entity.getClass()));
        T t  = (T) entity;
        if(list.size()>0){
            t = (T) list.get(0);
        }
        return t;
    }

    /**
     *  返回查询结果的实体,无参
     */
    @Override
    public T queryForObject(String sql, Object entity){
        List<T> list = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<>((Class<T>) entity.getClass()));
        T t = (T) entity;
        if(list.size()>0){
            t = list.get(0);
        }
        return t;
    }

    @Override
    public LobHandler getLobHandler() {
        return lobHandler;
    }

    public void setLobHandler(LobHandler lobHandler) {
        this.lobHandler = lobHandler;
    }

    public JdbcService<T> getInstance(){
        ApplicationContext context = ApplicationContextManagement.getApplicationContext();
        if(context==null){
            String paths[] = {"spring-jdbc-service.xml"};
            //这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
            context =  new ClassPathXmlApplicationContext(paths);
        }
        return (JdbcService<T>)context.getBean("appJdbcService");
    }

    public JdbcService<T> getInstance(ApplicationContext context){
        return (JdbcService<T>)context.getBean("appJdbcService");
    }
}
