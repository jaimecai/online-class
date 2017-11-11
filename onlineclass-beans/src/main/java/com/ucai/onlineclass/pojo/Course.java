package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Collection;

@Entity
public class Course {
    private int id;
    private String subject;
    private Integer credit;
    private Time timeTotal;
    private String info;
    private String picture;
    private String content;
    private Collection<Chapter> chaptersById;
    private CourseType courseTypeByCourseTypeId;
    private Collection<CourseAndUser> courseAndUsersById;
    private Collection<Question> questionsById;
    private Collection<Review> reviewsById;
    private Collection<TeacherAndCourse> teacherAndCoursesById;
    private Collection<UserAndCourse> userAndCoursesById;

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subject", nullable = true, length = 45)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "credit", nullable = true)
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "time_total", nullable = true)
    public Time getTimeTotal() {
        return timeTotal;
    }

    public void setTimeTotal(Time timeTotal) {
        this.timeTotal = timeTotal;
    }

    @Basic
    @Column(name = "info", nullable = true, length = -1)
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

        Course course = (Course) o;

        if (id != course.id) return false;
        if (subject != null ? !subject.equals(course.subject) : course.subject != null) return false;
        if (credit != null ? !credit.equals(course.credit) : course.credit != null) return false;
        if (timeTotal != null ? !timeTotal.equals(course.timeTotal) : course.timeTotal != null) return false;
        if (info != null ? !info.equals(course.info) : course.info != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (timeTotal != null ? timeTotal.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<Chapter> getChaptersById() {
        return chaptersById;
    }

    public void setChaptersById(Collection<Chapter> chaptersById) {
        this.chaptersById = chaptersById;
    }

    @ManyToOne
    @JoinColumn(name = "course_type_id", referencedColumnName = "id", nullable = false)
    public CourseType getCourseTypeByCourseTypeId() {
        return courseTypeByCourseTypeId;
    }

    public void setCourseTypeByCourseTypeId(CourseType courseTypeByCourseTypeId) {
        this.courseTypeByCourseTypeId = courseTypeByCourseTypeId;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<CourseAndUser> getCourseAndUsersById() {
        return courseAndUsersById;
    }

    public void setCourseAndUsersById(Collection<CourseAndUser> courseAndUsersById) {
        this.courseAndUsersById = courseAndUsersById;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<Question> getQuestionsById() {
        return questionsById;
    }

    public void setQuestionsById(Collection<Question> questionsById) {
        this.questionsById = questionsById;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<Review> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Review> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<TeacherAndCourse> getTeacherAndCoursesById() {
        return teacherAndCoursesById;
    }

    public void setTeacherAndCoursesById(Collection<TeacherAndCourse> teacherAndCoursesById) {
        this.teacherAndCoursesById = teacherAndCoursesById;
    }

    @OneToMany(mappedBy = "courseByCourseId")
    public Collection<UserAndCourse> getUserAndCoursesById() {
        return userAndCoursesById;
    }

    public void setUserAndCoursesById(Collection<UserAndCourse> userAndCoursesById) {
        this.userAndCoursesById = userAndCoursesById;
    }
}
