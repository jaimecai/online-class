package com.ucai.onlineclass.pojo;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Chapter {
    private int id;
    private String title;
    private Course courseByCourseId;
    private Collection<Section> sectionsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chapter chapter = (Chapter) o;

        if (id != chapter.id) return false;
        if (title != null ? !title.equals(chapter.title) : chapter.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id", nullable = false)
    public Course getCourseByCourseId() {
        return courseByCourseId;
    }

    public void setCourseByCourseId(Course courseByCourseId) {
        this.courseByCourseId = courseByCourseId;
    }

    @OneToMany(mappedBy = "chapterByChapterId")
    public Collection<Section> getSectionsById() {
        return sectionsById;
    }

    public void setSectionsById(Collection<Section> sectionsById) {
        this.sectionsById = sectionsById;
    }
}
