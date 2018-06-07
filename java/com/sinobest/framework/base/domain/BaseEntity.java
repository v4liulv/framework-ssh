package com.sinobest.framework.base.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/5 0005.
 *
 * 实体类基类
 *  @MappedSuperclass
 * 的类将不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    /**
     *  ID
     */
    private String systemid;

    /**
     *创建日期
     */
    private String createPersonName;

    /**
     *创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;


    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Id
    @Column(length = 32, nullable = true)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getSystemid() {
        return systemid;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(updatable = false)
    public String getCreatePersonName() {
        return createPersonName;
    }

    public void setCreatePersonName(String createPersonName) {
        this.createPersonName = createPersonName;
    }

    @Column(updatable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    @Override
    public int hashCode() {
        return systemid == null ? System.identityHashCode(this) : systemid.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntity that = (BaseEntity) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        return modifyDate != null ? modifyDate.equals(that.modifyDate) : that.modifyDate == null;

    }


}
