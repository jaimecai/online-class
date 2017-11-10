package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "course_type", schema = "online_class", catalog = "")
public class CourseType {
    private int id;
    private String type;
    private Collection<Course> coursesById;

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

        CourseType that = (CourseType) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "courseTypeByCourseTypeId")
    public Collection<Course> getCoursesById() {
        return coursesById;
    }

    public void setCoursesById(Collection<Course> coursesById) {
        this.coursesById = coursesById;
    }
}
