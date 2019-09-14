package com.sinobest.framework.base.service;


import com.sinobest.framework.base.domain.DataTablesEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

    public List<T> findByHQLNative(String hql,Class<T> entityType, Object... params);

    /**
     * Hql 语句查询 limit
     */
    public List<T> getByHQLLimit(String hql,int limit, Object... params);

    public List<T> getByHQLLimit1(String hql,int first, int max, Object... params);

    /**
     *  获取所有的实体类对象T
     *
     * @return  list<T>
     */
    public List<T> getAllEntity(String tableName);

    public List<T> getAllEntityPage(String tableName, Integer startNum, Integer endNum);

    public List<T> getAllEntityPageParams(String tableName, Integer startNum, Integer endNum, String params);

    /**
     * 根据DataTables前端传递封装成dtEntity对象，查询请求后端数据，并返回封装好的数据给到dt前端
     *
     * @param dtEntity 实体类继承DataTablesEntity
     * @param tableOrSql 表名或查询SQL,不能为空
     * @param entityClass 解析实体类对象Class
     * @return 返回封装好的数据给到dt前端
     */
    public Map<String, Object> queryByDataTablesBase(DataTablesEntity dtEntity,
                                                     String tableOrSql,
                                                     Class<T> entityClass);

}
