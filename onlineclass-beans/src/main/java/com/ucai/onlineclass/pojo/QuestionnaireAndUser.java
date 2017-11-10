package com.ucai.onlineclass.pojo;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire_and_user", schema = "online_class", catalog = "")
public class QuestionnaireAndUser {
    private int id;
    private Questionnaire questionnaireByQuestionnaireId;
    private User userByUserId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionnaireAndUser that = (QuestionnaireAndUser) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "questionnaire_id", referencedColumnName = "id")
    public Questionnaire getQuestionnaireByQuestionnaireId() {
        return questionnaireByQuestionnaireId;
    }

    public void setQuestionnaireByQuestionnaireId(Questionnaire questionnaireByQuestionnaireId) {
        this.questionnaireByQuestionnaireId = questionnaireByQuestionnaireId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
