package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Questionnaire {
    private int id;
    private String title;
    private String code;
    private String totalQuestion;
    private Date startTime;
    private Date endTime;
    private Collection<QuestionnaireAndUser> questionnaireAndUsersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 45)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "total_question", nullable = true, length = 45)
    public String getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(String totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questionnaire that = (Questionnaire) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (totalQuestion != null ? !totalQuestion.equals(that.totalQuestion) : that.totalQuestion != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (totalQuestion != null ? totalQuestion.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "questionnaireByQuestionnaireId")
    public Collection<QuestionnaireAndUser> getQuestionnaireAndUsersById() {
        return questionnaireAndUsersById;
    }

    public void setQuestionnaireAndUsersById(Collection<QuestionnaireAndUser> questionnaireAndUsersById) {
        this.questionnaireAndUsersById = questionnaireAndUsersById;
    }
}
