package com.sinobest.framework.dictionaries.mvc.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author liulv
 * @date 2018/1/3
 *
 * 注意以下几点：
 * 1、UUID自动主键（需要手动添加）
 *  @GeneratedValue(generator = "uuid")
 *  @GenericGenerator(name = "uuid", strategy = "uuid")
 *
 *  2、数据库Date类型，对应使用Java8的LocalDateTime类型（需要手动修改）
 *
 *  3、schema = "YY_GXKSH_ZSB"必须去掉，在集成库不是使用此用户
 *
 *  4、columnDefinition 在Hibernate添加实体时候默认值不起作用
 *  需要手动添加其值，进行实体保存，可能是工程那里配置不正确。后续版本会跟进处理此BUG
 *
 */
@Entity
@Table(name = "Dictionaries")
public class Dictionaries {
    private String systemid;
    private String kind;
    private String kindDel;
    private String code;
    private String value;
    private String codeDel;
    private long scbz;
    private String createUser;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "SYSTEMID", nullable = false, length = 32)
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "KIND", nullable = false, length = 50)
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Basic
    @Column(name = "KIND_DEL", nullable = true, length = 1000)
    public String getKindDel() {
        return kindDel;
    }

    public void setKindDel(String kindDel) {
        this.kindDel = kindDel;
    }

    @Basic
    @Column(name = "CODE", nullable = false, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "VALUE", nullable = false, length = 200)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "CODE_DEL", nullable = true, length = 1000)
    public String getCodeDel() {
        return codeDel;
    }

    public void setCodeDel(String codeDel) {
        this.codeDel = codeDel;
    }

    @Basic
    @Column(name = "SCBZ", nullable = false, precision = 0)
    public long getScbz() {
        return scbz;
    }

    public void setScbz(long scbz) {
        this.scbz = scbz;
    }

    @Basic
    @Column(name = "CREATE_USER", nullable = false, length = 50)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = false)
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = true)
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dictionaries that = (Dictionaries) o;

        if (scbz != that.scbz) return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (kindDel != null ? !kindDel.equals(that.kindDel) : that.kindDel != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (codeDel != null ? !codeDel.equals(that.codeDel) : that.codeDel != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (kindDel != null ? kindDel.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (codeDel != null ? codeDel.hashCode() : 0);
        result = 31 * result + (int) (scbz ^ (scbz >>> 32));
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
