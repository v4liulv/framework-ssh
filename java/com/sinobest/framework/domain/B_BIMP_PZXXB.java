package com.sinobest.framework.domain;

import com.sinobest.framework.util.date.DateUtil;

import java.util.Date;
import java.util.UUID;

/**
 * BatchImportCsv的Node的创建CSV的标题配置表
 * @author liulv
 * @version 1.0
 * @created 27-九月-2017 15:47:40
 */
public class B_BIMP_PZXXB {

    public String SYSTEMID = String.valueOf(UUID.randomUUID());
    /**
     * Neo4j的Label的类型，唯一标识，sh的入口参数
     */
    private static String TYPE;
    /**
     * TYPE详情
     */
    private String TYPE_DET;
    /**
     * 图数据库的NODE的标签
     */
    private String LABEL;
    /**
     * 删除标志 0代表未删除，1代表已删除
     */
    private int SCBZ = 0;
    /**
     * 创建时间
     */
    private Date CREATE_TIME = DateUtil.nowDate();
    /**
     * 更新时间
     */
    private Date UPDATE_TIME;

    /**
     * 来源表名
     */
    private String SOURCE_TABLE;

    public B_BIMP_PZXXB(){

    }

    public String getSYSTEMID() {
        return SYSTEMID;
    }

    public void setSYSTEMID(String SYSTEMID) {
        this.SYSTEMID = SYSTEMID;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static void setTYPE(String TYPE) {
        B_BIMP_PZXXB.TYPE = TYPE;
    }

    public String getTYPE_DET() {
        return TYPE_DET;
    }

    public void setTYPE_DET(String TYPE_DET) {
        this.TYPE_DET = TYPE_DET;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

    public int getSCBZ() {
        return SCBZ;
    }

    public void setSCBZ(int SCBZ) {
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

    public String getSOURCE_TABLE() {
        return SOURCE_TABLE;
    }

    public void setSOURCE_TABLE(String SOURCE_TABLE) {
        this.SOURCE_TABLE = SOURCE_TABLE;
    }
}