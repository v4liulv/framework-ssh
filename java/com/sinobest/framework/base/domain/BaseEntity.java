package com.sinobest.framework.base.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Administrator on 2016/11/5 0005.
 *
 * 实体类基类
 *  @MappedSuperclass
 * 的类将不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中
 * 标注为@MappedSuperclass的类不能再标注@Entity或@Table注解，也无需实现序列化接口
 *
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 定义继承的策略,每个子类都成为一个新表
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity{
//public class BaseEntity implements Serializable{

    /**
     *  @Id 系统主键
     *
     */
    private String systemid;

    /**
     *创建人
     */
    private String createUser;

    /**
     *创建日期
     */
    private LocalDateTime createTime;

    /**
     * 修改日期
     */
    private LocalDateTime updateTime;

    /**
     * 删除标准
     */
    private long scbz;


    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Id
    @Column(length = 32, nullable = false, updatable = false, insertable = false)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getSystemid() {
        return systemid;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CREATE_USER", updatable = false, length = 50)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Column(name = "CREATE_TIME", updatable = false)
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Column(name = "UPDATE_TIME", insertable = false)
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setScbz(long scbz) {
        this.scbz = scbz;
    }

    @Column(name = "SCBZ", length = 2)
    public long getScbz() {
        return scbz;
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

        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return updateTime != null ? updateTime.equals(that.updateTime) : that.updateTime == null;
    }


}
