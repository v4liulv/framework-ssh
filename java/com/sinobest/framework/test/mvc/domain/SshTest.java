package com.sinobest.framework.test.mvc.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author liulv
 * @date 2018/6/7
 */
@Entity
@Table(name = "SSH_TEST")
public class SshTest {
    private String id;
    private String name;
    private Long age;
    private String sex;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", nullable = false, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AGE", nullable = true, precision = 0)
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SshTest sshTest = (SshTest) o;

        if (id != null ? !id.equals(sshTest.id) : sshTest.id != null) return false;
        if (name != null ? !name.equals(sshTest.name) : sshTest.name != null) return false;
        if (age != null ? !age.equals(sshTest.age) : sshTest.age != null) return false;
        if (sex != null ? !sex.equals(sshTest.sex) : sshTest.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
