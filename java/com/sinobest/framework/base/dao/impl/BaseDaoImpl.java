package com.sinobest.framework.base.dao.impl;

import com.sinobest.framework.base.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Created by Administrator on 2016/11/5 0005.
 *
 * BaseDao基本数据库操作Hibernate的基本操作实现类
 */
@Transactional(value = "transactionManagerOracle")
@Repository(value = "baseDao")
public class BaseDaoImpl<T> implements BaseDao<T>
{
    private Class<T> entityClass;

    //注入sessionFactory
    /**
     * 来自与Spring-hibernate.xml 的bing
     */
    @Autowired
    protected SessionFactory sessionFactoryOracle;


    public BaseDaoImpl(){
        this.entityClass = null;
        Type genType = getClass().getGenericSuperclass();
        if(genType instanceof ParameterizedType){
            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
            entityClass = (Class) params[0];
        }
    }

   /* public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        entityClass = (Class<T>) type.getActualTypeArguments()[0];
        System.out.println("DAO的真实实现类是：" + this.entityClass.getName());
    }*/

   private static SessionFactory getSessionFactory()
    {
        SessionFactory sessionFactory = null;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try
        {
            sessionFactory = new MetadataSources(registry).buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e)
        {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return sessionFactory;
    }

    protected Session getSession(){
        return sessionFactoryOracle.getCurrentSession();
    }

    /**
     * 根据实例对象保存实例，返回保存实例对象的ID
     *
     * @param entity 实体类对象
     */
    @Override
    public void save(T entity) {
        this.getSession().save(entity);
    }

    /**
     * update entity
     * @param entity entity
     */
    @Override
    public void update(T entity) {
        this.getSession().update(entity);
    }

    /**
     * delete entity by id
     * @param id zj
     */
    @Override
    public void delete(Serializable id) {
        this.getSession().delete(this.getById(id));
    }

    /**
     * delete entity by id
     * @param entity zj
     */
    @Override
    public void delete(T entity) {
        this.getSession().delete(entity);
    }

    @Override
    public T getById(Serializable id) {
        return this.getSession().get(this.entityClass, id);
    }

    @Override
    public T getById(Class<T> entityType, Serializable id) {
        return this.getSession().get(entityType, id);
    }

    @Override
    public List<T> findByField(String tableName, String field, String fieldValue, boolean like, String clause){
        String hql = "from " + tableName + " where " + field;
        if(like){
            hql = hql + " like ? " + clause ;
        }else {
            hql = hql + " = ? " + clause ;
        }
        Query query = getSession().createQuery(hql);
        if(like){
            fieldValue = "%" + fieldValue + "%";
        }
        query.setParameter(0, fieldValue);
        return (List<T>)query.list();
    }

    @Override
    public List<T> findByFields(String tableName, String[] fields, String[] fieldsValue, boolean like, String clause){

        StringBuilder hqlSB = new StringBuilder();
        hqlSB.append("from ").append(tableName).append(" where ");
        for(int i = 0; i < fields.length; i++){
            if(i == 0) {
                hqlSB.append(fields[i]);
                if(like){
                    hqlSB.append(" like ? ");
                }else {
                    hqlSB.append(" = ? ");
                }
            }else {
                hqlSB.append(" and ").append(fields[i]);
                if(like){
                    hqlSB.append(" like ? ");
                }else {
                    hqlSB.append(" like ? ");
                }
            }
            hqlSB.append(clause);
        }
        String hql = hqlSB.toString();
        Query query = getSession().createQuery(hql);
        for(int i = 0; i < fields.length; i++){
            String fieldValue = fieldsValue[i];
            if(like){
                fieldValue = "%" + fieldValue + "%";
            }
            query.setParameter(i, fieldValue);
        }
        return (List<T>)query.list();
    }

    public List<T> findByHQL(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        if(params.length >= 1)
        for(int i = 0; i < params.length; i++){
            query.setParameter(i, params[i]);
        }
        List<T> queryList = (List<T>) query.list();
        return queryList;
    }

    /**
     * 获取所有实体类实例list集合
     *
     * @return 所有实体类对象的list集合
     */
    @SuppressWarnings("JpaQlInspection")
    @Override
    public List<T> getAllEntity(String tableName) {
        String hql = "from " + tableName;
        Query query = getSession().createQuery(hql);
        return (List<T>)query.list();
    }


}
