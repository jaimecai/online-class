package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    private int id;
    private String username;
    private String password;
    private String age;
    private String gender;
    private String avatar;
    private String nickname;
    private Collection<CourseAndUser> courseAndUsersById;
    private Collection<Question> questionsById;
    private Collection<QuestionAnswer> questionAnswersById;
    private Collection<QuestionnaireAndUser> questionnaireAndUsersById;
    private Collection<Review> reviewsById;
    private Collection<UserAndCourse> userAndCoursesById;
    private Collection<UserAndRole> userAndRolesById;
    private Collection<UserAndSectionNote> userAndSectionNotesById;
    private Collection<UserAndTest> userAndTestsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "age", nullable = true, length = 45)
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
    @Column(name = "avatar", nullable = true, length = 45)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 45)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        if (avatar != null ? !avatar.equals(user.avatar) : user.avatar != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<CourseAndUser> getCourseAndUsersById() {
        return courseAndUsersById;
    }

    public void setCourseAndUsersById(Collection<CourseAndUser> courseAndUsersById) {
        this.courseAndUsersById = courseAndUsersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Question> getQuestionsById() {
        return questionsById;
    }

    public void setQuestionsById(Collection<Question> questionsById) {
        this.questionsById = questionsById;
    }

    @OneToMany(mappedBy = "userByUserId1")
    public Collection<QuestionAnswer> getQuestionAnswersById() {
        return questionAnswersById;
    }

    public void setQuestionAnswersById(Collection<QuestionAnswer> questionAnswersById) {
        this.questionAnswersById = questionAnswersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<QuestionnaireAndUser> getQuestionnaireAndUsersById() {
        return questionnaireAndUsersById;
    }

    public void setQuestionnaireAndUsersById(Collection<QuestionnaireAndUser> questionnaireAndUsersById) {
        this.questionnaireAndUsersById = questionnaireAndUsersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<Review> getReviewsById() {
        return reviewsById;
    }

    public void setReviewsById(Collection<Review> reviewsById) {
        this.reviewsById = reviewsById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserAndCourse> getUserAndCoursesById() {
        return userAndCoursesById;
    }

    public void setUserAndCoursesById(Collection<UserAndCourse> userAndCoursesById) {
        this.userAndCoursesById = userAndCoursesById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserAndRole> getUserAndRolesById() {
        return userAndRolesById;
    }

    public void setUserAndRolesById(Collection<UserAndRole> userAndRolesById) {
        this.userAndRolesById = userAndRolesById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserAndSectionNote> getUserAndSectionNotesById() {
        return userAndSectionNotesById;
    }

    public void setUserAndSectionNotesById(Collection<UserAndSectionNote> userAndSectionNotesById) {
        this.userAndSectionNotesById = userAndSectionNotesById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserAndTest> getUserAndTestsById() {
        return userAndTestsById;
    }

    public void setUserAndTestsById(Collection<UserAndTest> userAndTestsById) {
        this.userAndTestsById = userAndTestsById;
    }
}
