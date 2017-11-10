package com.ucai.onlineclass.pojo;

import javax.persistence.*;

@Entity
@Table(name = "question_answer", schema = "online_class", catalog = "")
public class QuestionAnswer {
    private int id;
    private String answer;
    private Question questionByQuestionId;
    private User userByUserId1;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "answer", nullable = true, length = 45)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionAnswer that = (QuestionAnswer) o;

        if (id != that.id) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id", nullable = false)
    public Question getQuestionByQuestionId() {
        return questionByQuestionId;
    }

    public void setQuestionByQuestionId(Question questionByQuestionId) {
        this.questionByQuestionId = questionByQuestionId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id1", referencedColumnName = "id", nullable = false)
    public User getUserByUserId1() {
        return userByUserId1;
    }

    public void setUserByUserId1(User userByUserId1) {
        this.userByUserId1 = userByUserId1;
    }
}
