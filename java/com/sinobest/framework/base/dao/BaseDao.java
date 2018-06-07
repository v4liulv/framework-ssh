package com.sinobest.framework.base.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/11/5 0005.
 *
 * Dao接口，Dao基础接口
 */
public interface BaseDao<T> {

    /**
     * 根据实例对象保存实例，返回保存实例对象的ID
     * @param entity et
     */
    public void save(T entity);

    /**
     * update entity
     * @param entity entity
     */
    public void update(T entity);

    /**
     * delete entity by id
     * @param id zj
     */
    public void delete(Serializable id);

    /**
     * delete entity by id
     * @param entity zj
     */
    public void delete(T entity);

    /**
     * @param hql hibernate hql
     * @param params cs
     * @return Lists<entity>
     */
    public List<T> findByHQL(String hql, Object... params);

    /**
     * find entity by id
     * @param id zj
     * @return entity
     *
     * 特别注意如果要使用此方法，获取实体的class不能直接使用BaseDao注入调用getById，
     * 需要自定义interface EntityDao extends BaseDao<Entity>,才可以调用
     */
    public T getById(Serializable id);

    /**
     * @param id 主键
     * @param entityType 实体类Class
     * @return 实体类
     */
    public T getById(Class<T> entityType, Serializable id);

    /**
     * find entity by 条件字段
     * @param field 条件字段
     * @return entity
     */
    public List<T> findByField(String tableName, String field, String fieldValue, boolean like, String clause);

    /**
     * find entity by 条件字段 多个
     * @param fields 条件字段 多个
     * @return entity
     */
    public List<T> findByFields(String tableName, String[] fields, String[] fieldsValue, boolean like, String clause);

    /**
     * 获取所有实体类实例list集合
     * @return  所有实体类对象的list集合
     */
    public List<T> getAllEntity(String tableName);



}
