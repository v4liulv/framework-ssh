package com.sinobest.framework.domain;

import java.util.UUID;

/**
 * B_BIMP_MR_HBASE Neo4j全量MR-HBase的配置信息表
 *
 * @author liulv
 * @version 1.0
 * @created 27-九月-2017 15:51:27
 */
public class B_BIMP_MR_HBASE {

    private String SYSTEMID = String.valueOf(UUID.randomUUID());
    /**
     * 关联的TYPE表的主键
     */
    private String TYPE_ID;
    /**
     * MR运行的Jar包名称
     */
    private String JAR_NAME = "gxksh.Jar";
    /**
     * MR运行的作业的名称
     */
    private String TASK_NAME;
    /**
     * 输入源表英文名
     */
    private String SOURCE_TABLE;
    /**
     * 输入源表的列族，只有在DB为HBASE时候有效
     */
    private String SOURCE_TABLE_FAMILY = "CF";
    /**
     * HBASE的SCAN每次rpc的请求记录数,默认为1000
     */
    private int SCAN_CACHE = 1000;
    /**
     * HBASE的SCAN的每次取的列数，默认100列
     */
    private int SCAN_BATCH = 100;
    /**
     * MR的输出的HDFS路径
     */
    private String OUTPUT_DIR;
    /**
     * MR执行的Reduce的并发数
     */
    private int NUM_REDUCE_TASKS = 1;
    /**
     * 是否启用Reduce输出压缩，KIND=IS_MR_OUTPUT_COMPRESS,0代码不启动压缩，1代表启动
     */
    private int IS_MR_OUTPUT_COMPRESS = 0;
    /**
     * 压缩类型，kind=MR_OUTPUT_COMPRESS_TYPE,
     * BZIP2,DEFAULT,SNAPP
     */
    private String MR_OUTPUT_COMPRESS_TYPE;
    /**
     * scan的所有数据是否放在缓存中，默认为0不放在缓存中，1代表放在缓存中
     */
    private int SCAN_CACHEBLOCKS = 0;
    /**
     * 是否开启mr的map备用任务机制，默认0 不开启，1代表开启
     */
    private int MAP_TASKS_SPECULATIVE_EXECUTION = 0;
    /**
     * 删除标志
     */
    private int SCBZ = 0;

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

    public String getJAR_NAME() {
        return JAR_NAME;
    }

    public void setJAR_NAME(String JAR_NAME) {
        this.JAR_NAME = JAR_NAME;
    }

    public String getTASK_NAME() {
        return TASK_NAME;
    }

    public void setTASK_NAME(String TASK_NAME) {
        this.TASK_NAME = TASK_NAME;
    }

    public String getSOURCE_TABLE() {
        return SOURCE_TABLE;
    }

    public void setSOURCE_TABLE(String SOURCE_TABLE) {
        this.SOURCE_TABLE = SOURCE_TABLE;
    }

    public String getSOURCE_TABLE_FAMILY() {
        return SOURCE_TABLE_FAMILY;
    }

    public void setSOURCE_TABLE_FAMILY(String SOURCE_TABLE_FAMILY) {
        this.SOURCE_TABLE_FAMILY = SOURCE_TABLE_FAMILY;
    }

    public int getSCAN_CACHE() {
        return SCAN_CACHE;
    }

    public void setSCAN_CACHE(int SCAN_CACHE) {
        this.SCAN_CACHE = SCAN_CACHE;
    }

    public int getSCAN_BATCH() {
        return SCAN_BATCH;
    }

    public void setSCAN_BATCH(int SCAN_BATCH) {
        this.SCAN_BATCH = SCAN_BATCH;
    }

    public String getOUTPUT_DIR() {
        return OUTPUT_DIR;
    }

    public void setOUTPUT_DIR(String OUTPUT_DIR) {
        this.OUTPUT_DIR = OUTPUT_DIR;
    }

    public int getNUM_REDUCE_TASKS() {
        return NUM_REDUCE_TASKS;
    }

    public void setNUM_REDUCE_TASKS(int NUM_REDUCE_TASKS) {
        this.NUM_REDUCE_TASKS = NUM_REDUCE_TASKS;
    }

    public int getIS_MR_OUTPUT_COMPRESS() {
        return IS_MR_OUTPUT_COMPRESS;
    }

    public void setIS_MR_OUTPUT_COMPRESS(int IS_MR_OUTPUT_COMPRESS) {
        this.IS_MR_OUTPUT_COMPRESS = IS_MR_OUTPUT_COMPRESS;
    }

    public String getMR_OUTPUT_COMPRESS_TYPE() {
        return MR_OUTPUT_COMPRESS_TYPE;
    }

    public void setMR_OUTPUT_COMPRESS_TYPE(String MR_OUTPUT_COMPRESS_TYPE) {
        this.MR_OUTPUT_COMPRESS_TYPE = MR_OUTPUT_COMPRESS_TYPE;
    }

    public int getSCAN_CACHEBLOCKS() {
        return SCAN_CACHEBLOCKS;
    }

    public void setSCAN_CACHEBLOCKS(int SCAN_CACHEBLOCKS) {
        this.SCAN_CACHEBLOCKS = SCAN_CACHEBLOCKS;
    }

    public int getMAP_TASKS_SPECULATIVE_EXECUTION() {
        return MAP_TASKS_SPECULATIVE_EXECUTION;
    }

    public void setMAP_TASKS_SPECULATIVE_EXECUTION(int MAP_TASKS_SPECULATIVE_EXECUTION) {
        this.MAP_TASKS_SPECULATIVE_EXECUTION = MAP_TASKS_SPECULATIVE_EXECUTION;
    }

    public int getSCBZ() {
        return SCBZ;
    }

    public void setSCBZ(int SCBZ) {
        this.SCBZ = SCBZ;
    }
}