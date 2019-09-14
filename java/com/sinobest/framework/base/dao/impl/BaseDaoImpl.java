package com.sinobest.framework.base.dao.impl;

import com.sinobest.framework.base.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


/**
 * Created by Administrator on 2016/11/5 0005.
 * <p>
 * BaseDao基本数据库操作Hibernate的基本操作实现类
 */
@Transactional(value = "transactionManagerJdbc")
@Repository(value = "baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
    private Class<T> entityClass;

    //注入sessionFactory
    /**
     * 来自与Spring-hibernate.xml 的bing
     */
    @Autowired
    protected SessionFactory sessionFactoryJdbc;


    public BaseDaoImpl() {
        this.entityClass = null;
        Type genType = getClass().getGenericSuperclass();
        if (genType instanceof ParameterizedType) {
            Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
            entityClass = (Class) params[0];
        }
    }

    private static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = null;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return sessionFactory;
    }

    protected Session getSession() {
        return sessionFactoryJdbc.getCurrentSession();
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
     *
     * @param entity entity
     */
    @Override
    public void update(T entity) {
        this.getSession().update(entity);
    }

    /**
     * delete entity by id
     *
     * @param id zj
     */
    @Override
    public void delete(Serializable id) {
        this.getSession().delete(this.getById(id));
    }

    /**
     * delete entity by id
     *
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
    public List<T> findByField(String tableName, String field, String fieldValue, boolean like, String clause) {
        String hql = "from " + tableName + " where " + field;
        if (like) {
            hql = hql + " like ? " + clause;
        } else {
            hql = hql + " = ? " + clause;
        }
        Query query = getSession().createQuery(hql);
        if (like) {
            fieldValue = "%" + fieldValue + "%";
        }
        query.setParameter(0, fieldValue);
        return (List<T>) query.list();
    }

    @Override
    public List<T> findByFields(String tableName, String[] fields, String[] fieldsValue, boolean like, String clause) {

        StringBuilder hqlSB = new StringBuilder();
        hqlSB.append("from ").append(tableName).append(" where ");
        for (int i = 0; i < fields.length; i++) {
            if (i == 0) {
                hqlSB.append(fields[i]);
                if (like) {
                    hqlSB.append(" like ? ");
                } else {
                    hqlSB.append(" = ? ");
                }
            } else {
                hqlSB.append(" and ").append(fields[i]);
                if (like) {
                    hqlSB.append(" like ? ");
                } else {
                    hqlSB.append(" like ? ");
                }
            }
            hqlSB.append(clause);
        }
        String hql = hqlSB.toString();
        Query query = getSession().createQuery(hql);
        for (int i = 0; i < fields.length; i++) {
            String fieldValue = fieldsValue[i];
            if (like) {
                fieldValue = "%" + fieldValue + "%";
            }
            query.setParameter(i, fieldValue);
        }
        return (List<T>) query.list();
    }

    public List<T> findByHQL(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        if (params.length >= 1) for (int i = 0; i < params.length; i++) {
            query.setParameter(i, params[i]);
        }
        List<T> queryList = (List<T>) query.list();
        return queryList;
    }

    public List<T> findByHQLNative(String hql, Class<T> entityType, Object... params) {
        org.hibernate.query.Query query = this.getSession().createNativeQuery(hql, entityType);
        if (params.length >= 1) for (int i = 0; i < params.length; i++) {
            query.setParameter(i, params[i]);
        }
        return (List<T>) query.list();
    }

    public List<T> findByHQLLimit(String hql, int limit, Object... params) {
        return findByHQLLimit(hql, 0, limit, params);
    }

    public List<T> findByHQLLimit(String hql, int start, int numSize, Object... params) {
        org.hibernate.query.Query query = this.getSession().createQuery(hql);
        if (params.length >= 1) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i, params[i]);
            }
        }
        query.setFirstResult(start);
        query.setMaxResults(numSize);
        return (List<T>) query.list();
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
        return (List<T>) query.list();
    }

    public List<T> getAllEntityPage(String tableName, Integer startNum, Integer endNum) {
        String hql = "from " + tableName;
        org.hibernate.query.Query query = getSession().createQuery(hql);
        query.setFirstResult(startNum);
        query.setMaxResults(endNum);
        return (List<T>) query.list();
    }

    public List<T> getAllEntityPageParams(String tableName, Integer startNum, Integer pageNum, String oHql, Object... params) {
        String hql = "from " + tableName + oHql;
        System.out.println("hql ============================== " + hql + "str:" + startNum + ", pageNum" + pageNum);
        org.hibernate.query.Query query = getSession().createQuery(hql);
        if (params.length >= 1) {
            int index = 0;
            for (int i = 0; i < params.length; i++) {
                if (params[i] != null && !params[i].equals("")) {
                    query.setParameter(index, params[i]);
                    index++;
                }
            }
        }
        query.setFirstResult(startNum);
        query.setMaxResults(pageNum);
        return (List<T>) query.list();
    }


}
