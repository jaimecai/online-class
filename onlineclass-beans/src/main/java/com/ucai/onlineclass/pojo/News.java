package com.ucai.onlineclass.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * News entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="news"
    ,catalog="online_class"
)

public class News  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private NewsType newsType;
     private String title;
     private String picture;
     private Date postTime;
     private String content;
     private String author;


    // Constructors

    /** default constructor */
    public News() {
    }

    
    /** full constructor */
    public News(NewsType newsType, String title, String picture, Date postTime, String content, String author) {
        this.newsType = newsType;
        this.title = title;
        this.picture = picture;
        this.postTime = postTime;
        this.content = content;
        this.author = author;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.EAGER)
        @JoinColumn(name="news_type_id")

    public NewsType getNewsType() {
        return this.newsType;
    }
    
    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }
    
    @Column(name="title", length=45)

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="picture", length=45)

    public String getPicture() {
        return this.picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="post_time", length=10)

    public Date getPostTime() {
        return this.postTime;
    }
    
    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
    
    @Column(name="content", length=45)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="author", length=45)

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }


	@Override
	public String toString() {
		return "News [id=" + id + ", newsType=" + newsType + ", title=" + title + ", picture=" + picture + ", postTime="
				+ postTime + ", content=" + content + ", author=" + author + "]";
	}
}
