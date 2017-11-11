package com.ucai.onlineclass.pojo;

import javax.persistence.*;

@Entity
@Table(name = "user_and_section_note", schema = "online_class", catalog = "")
public class UserAndSectionNote {
    private int id;
    private User userByUserId;
    private Section sectionBySectionId;

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

        UserAndSectionNote that = (UserAndSectionNote) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "section_id", referencedColumnName = "id", nullable = false)
    public Section getSectionBySectionId() {
        return sectionBySectionId;
    }

    public void setSectionBySectionId(Section sectionBySectionId) {
        this.sectionBySectionId = sectionBySectionId;
    }
}
