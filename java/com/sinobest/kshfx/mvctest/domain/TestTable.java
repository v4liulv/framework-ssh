package com.sinobest.kshfx.mvctest.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by liulv on 2017/7/10 0010.
 *
 */
@Entity(name = "Test")
public class TestTable {
    private String id;
    private String name;

    @Id
    @Column(name = "ID", nullable = false, length = 100)
   /* @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestTable test = (TestTable) o;

        if (id != null ? !id.equals(test.id) : test.id != null) return false;
        if (name != null ? !name.equals(test.name) : test.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
