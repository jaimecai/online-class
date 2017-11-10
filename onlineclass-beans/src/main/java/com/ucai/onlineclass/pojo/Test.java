package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Test {
    private int id;
    private String subject;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer passScore;
    private Integer allowedTimes;
    private TestType testTypeByTestTypeId;
    private Collection<TestContent> testContentsById;
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
    @Column(name = "subject", nullable = true, length = 45)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "pass_score", nullable = true)
    public Integer getPassScore() {
        return passScore;
    }

    public void setPassScore(Integer passScore) {
        this.passScore = passScore;
    }

    @Basic
    @Column(name = "allowed_times", nullable = true)
    public Integer getAllowedTimes() {
        return allowedTimes;
    }

    public void setAllowedTimes(Integer allowedTimes) {
        this.allowedTimes = allowedTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (id != test.id) return false;
        if (subject != null ? !subject.equals(test.subject) : test.subject != null) return false;
        if (startTime != null ? !startTime.equals(test.startTime) : test.startTime != null) return false;
        if (endTime != null ? !endTime.equals(test.endTime) : test.endTime != null) return false;
        if (passScore != null ? !passScore.equals(test.passScore) : test.passScore != null) return false;
        if (allowedTimes != null ? !allowedTimes.equals(test.allowedTimes) : test.allowedTimes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (passScore != null ? passScore.hashCode() : 0);
        result = 31 * result + (allowedTimes != null ? allowedTimes.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "test_type_id", referencedColumnName = "id")
    public TestType getTestTypeByTestTypeId() {
        return testTypeByTestTypeId;
    }

    public void setTestTypeByTestTypeId(TestType testTypeByTestTypeId) {
        this.testTypeByTestTypeId = testTypeByTestTypeId;
    }

    @OneToMany(mappedBy = "testByTestId")
    public Collection<TestContent> getTestContentsById() {
        return testContentsById;
    }

    public void setTestContentsById(Collection<TestContent> testContentsById) {
        this.testContentsById = testContentsById;
    }

    @OneToMany(mappedBy = "testByTestId")
    public Collection<UserAndTest> getUserAndTestsById() {
        return userAndTestsById;
    }

    public void setUserAndTestsById(Collection<UserAndTest> userAndTestsById) {
        this.userAndTestsById = userAndTestsById;
    }
}
