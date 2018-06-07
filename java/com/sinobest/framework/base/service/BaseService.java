package com.sinobest.framework.base.service;


import java.io.Serializable;
import java.util.List;

/**
 * Created by liulv on 2016/11/5 0005.
 *
 */
public interface BaseService<T> {

    /**
     * 根据ID 获取实体类对象
     * @param id Serializable 主键
     * @return  实体类对象
     */
    public T getById(Serializable id);

    /**
     * 根据Hibernate的表名（注意是Hibernate映射的实体）、字段数组、字段数组值、其他子句 等进行条件查询
     *
     * 返回List<T> 实体集合
     */
    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue, boolean like, String clause);

    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue, String clause);

    public List<T> getByFields(String tableName, String[] fields, String[] fieldsValue);

    /**
     * 根据Hibernate的表名（注意是Hibernate映射的实体）、单个字段、单个字段值、其他子句 等进行条件查询
     *
     * 返回List<T> 实体集合
     */
    public List<T> getByField(String tableName, String field, String fieldValue, boolean like, String clause);

    public List<T> getByField(String tableName, String field, String fieldValue, String clause);

    public List<T> getByField(String tableName, String field, String fieldValue);

    /**
     * 保存实体类对象
     * @param entity entity
     */
    public void save(T entity);

    /**
     * 更新实体，实体必须包含需要更新的主键值
     *
     * @param entity entity
     */
    public void update(T entity);

    /**
     * 更新实体，实体必须包含需要更新的主键值
     *
     * @param id Serializable 主键值
     */
    public void delete(Serializable id);

    public void delete(T entity);

    /**
     * Hql 语句查询
     */
    public List<T> getByHQL(String hql, Object... params);

    /**
     *  获取所有的实体类对象T
     *
     * @return  list<T>
     */
    public List<T> getAllEntity(String tableName);

}
