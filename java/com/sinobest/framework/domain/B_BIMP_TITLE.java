package com.sinobest.framework.domain;

import java.util.Date;

/**
 * Created by liulv on 2017/9/27.
 *
 * Neo4j全量增量的配置信息表 实体类
 */
public class B_BIMP_TITLE {
    /**
     * 主键 默认UUID
     */
    private String SYSTEMID;
    /**
     * Neo4j类型外键 关联B_BIMP_PZXXB的主键
     */
    private String TYPE_ID;
    /**
     * 图库的标题的类型，KIND=NEO4J_IMPORT_CSV_TITLE_TYPE, 01代表NODE,02代表RELS
     */
    private String T_TYPE;
    /**
     * 标题的值
     */
    private String TITLE_VALUE;
    /**
     * CSV标题排序 0 1 2
     */
    private int SORT_NUM;
    /**
     * 关联字段源字段是否是Date类型，0代表是毫秒，1代表date类型，2代表其他类型
     */
    private int GLZD_TYPE;
    /**
     * 关联字段标准，用于SparkStreaming的建模
     */
    private String GLZD_BZ;
    /**
     * 关联的字段名
     */
    private String GLZD_NAME;
    /**
     * 关联字段是否是日期类型 0代表否，1代表是，多个字段用0|1..表示
     */
    private String GLZD_ISTIME;
    /**
     * 关联字段是否是Date类型，0代表毫秒，1代表Date,2代表2012010101类型，多个字段用0|1..表示
     */
    private String GLZD_ISDate;
    /**
     * 删除标志
     */
    private String SCBZ;
    /**
     * 创建时间
     */
    private Date CREATE_TIME;
    /**
     * 更新时间
     */
    private Date UPDATE_TIME;


    public String getSYSTEMID() {
        return SYSTEMID;
    }

    public void setSYSTEMID(String SYSTEMID) {
        this.SYSTEMID = SYSTEMID;
    }

    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public String getT_TYPE() {
        return T_TYPE;
    }

    public void setT_TYPE(String t_TYPE) {
        T_TYPE = t_TYPE;
    }

    public String getTITLE_VALUE() {
        return TITLE_VALUE;
    }

    public void setTITLE_VALUE(String TITLE_VALUE) {
        this.TITLE_VALUE = TITLE_VALUE;
    }

    public int getSORT_NUM() {
        return SORT_NUM;
    }

    public void setSORT_NUM(int SORT_NUM) {
        this.SORT_NUM = SORT_NUM;
    }

    public int getGLZD_TYPE() {
        return GLZD_TYPE;
    }

    public void setGLZD_TYPE(int GLZD_TYPE) {
        this.GLZD_TYPE = GLZD_TYPE;
    }

    public String getGLZD_BZ() {
        return GLZD_BZ;
    }

    public void setGLZD_BZ(String GLZD_BZ) {
        this.GLZD_BZ = GLZD_BZ;
    }

    public String getGLZD_NAME() {
        return GLZD_NAME;
    }

    public void setGLZD_NAME(String GLZD_NAME) {
        this.GLZD_NAME = GLZD_NAME;
    }

    public String getGLZD_ISTIME() {
        return GLZD_ISTIME;
    }

    public void setGLZD_ISTIME(String GLZD_ISTIME) {
        this.GLZD_ISTIME = GLZD_ISTIME;
    }

    public String getGLZD_ISDate() {
        return GLZD_ISDate;
    }

    public void setGLZD_ISDate(String GLZD_ISDate) {
        this.GLZD_ISDate = GLZD_ISDate;
    }

    public String getSCBZ() {
        return SCBZ;
    }

    public void setSCBZ(String SCBZ) {
        this.SCBZ = SCBZ;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }
}
