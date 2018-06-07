package com.sinobest.framework.base.service.impl;


import com.sinobest.framework.base.dao.BaseDao;
import com.sinobest.framework.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

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

    /**
     * 获取所有的实体类对象T
     *
     * @return list<T>
     */
    @Override
    public List<T> getAllEntity(String tableName) {
        return baseDao.getAllEntity(tableName);
    }
}
