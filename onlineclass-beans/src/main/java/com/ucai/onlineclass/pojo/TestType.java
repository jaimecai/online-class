package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "test_type", schema = "online_class", catalog = "")
public class TestType {
    private int id;
    private String type;
    private Collection<Test> testsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestType testType = (TestType) o;

        if (id != testType.id) return false;
        if (type != null ? !type.equals(testType.type) : testType.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "testTypeByTestTypeId")
    public Collection<Test> getTestsById() {
        return testsById;
    }

    public void setTestsById(Collection<Test> testsById) {
        this.testsById = testsById;
    }
}
