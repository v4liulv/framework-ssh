package com.sinobest.framework.utils;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.lob.LobHandler;

/**
 * Created by liulv on 2017/7/13 0013.
 *
 */
public interface IJdbcService<T> {
    public static final String	BEAN_NAME_OF_DEFAULT_IMPL	= "appJdbcService";

    public JdbcTemplate getJdbcTemplate();

    public LobHandler getLobHandler();
    /**
     * 分页查询
     */
    public List pagedQuery(String sql, Object[] args, int[] argsType, int pageNum, int pageSize);

    /**
     * 支持大对象更新
     */
    public int update(String sql, Object[] args, int[] argsType);

    /**
     * 对于分页传入的是当前页的最开始数据量，以及结束数据量
     *
     * @param sql sql
     * @param args args
     * @param argsType
     * @param startIndex
     * @param lastIndex
     * @return
     */
    public List queryPage(String sql, Object[] args, int[] argsType, int startIndex, int lastIndex);

    /**
     * 用于返回所有数据量的操作
     *
     * @param sql
     *            ：sql语句
     * @param args
     *            ：参数
     * @param argsType
     *            ：参数类型
     * @return
     */
    public int getCntQuery(String sql, Object[] args, int[] argsType);

    /**
     * 找单个对象
     */
    public Map<String, Object> queryForSingle(String sql, Object[] args, int[] argsType);

    /**
     *查询单个对象
     */
    public Map<String, Object> queryForSingle(String sql);

    /**
     * 按列表返回查找结果
     */
    public List<Map<String, Object>>  queryForList(String sql, Object[] args, int[] argsType);

    /**
     * 按列表返回查找结果
     */
    public List<Map<String, Object>> queryForList(String sql);

    /**
     * 返回表查询结果的List实体
     */
    public List<T> queryForListObject(String sql, Object[] args, T entity);
    /**
     * 返回表查询结果的List实体
     */
    public List<T> queryForListObject(String sql, T entity);

    /**
     * 返回表查询结果的实体
     */
    public T queryForObject(String sql, Object[] args, T entity);

    /**
     * 返回表查询结果的实体
     */
    public T queryForObject(String sql, T entity);
}
