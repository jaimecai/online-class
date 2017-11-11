package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Teacher {
    private int id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String position;
    private String avatar;
    private String info;
    private Collection<TeacherAndCourse> teacherAndCoursesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 45)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 45)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "avatar", nullable = true, length = 45)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "info", nullable = true, length = 45)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != teacher.id) return false;
        if (username != null ? !username.equals(teacher.username) : teacher.username != null) return false;
        if (password != null ? !password.equals(teacher.password) : teacher.password != null) return false;
        if (age != null ? !age.equals(teacher.age) : teacher.age != null) return false;
        if (gender != null ? !gender.equals(teacher.gender) : teacher.gender != null) return false;
        if (position != null ? !position.equals(teacher.position) : teacher.position != null) return false;
        if (avatar != null ? !avatar.equals(teacher.avatar) : teacher.avatar != null) return false;
        if (info != null ? !info.equals(teacher.info) : teacher.info != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "teacherByTeacherId")
    public Collection<TeacherAndCourse> getTeacherAndCoursesById() {
        return teacherAndCoursesById;
    }

    public void setTeacherAndCoursesById(Collection<TeacherAndCourse> teacherAndCoursesById) {
        this.teacherAndCoursesById = teacherAndCoursesById;
    }
}
