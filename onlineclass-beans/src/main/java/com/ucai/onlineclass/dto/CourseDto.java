package com.ucai.onlineclass.dto;
/**
 * @author:jaimecai
 * @date:17-11-18
 * @description:
 */
public class CourseDto {
    private int id;
    private String subject;
    private Integer credit;
    private String type;
    private int favorite;
    private int studentCount;
    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", credit=" + credit +
                ", type='" + type + '\'' +
                ", favorite=" + favorite +
                ", studentCount=" + studentCount +
                ", pageInfo=" + pageInfo +
                '}';
    }
}
