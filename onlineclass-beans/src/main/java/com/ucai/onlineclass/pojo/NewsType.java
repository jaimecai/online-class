package com.ucai.onlineclass.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NewsType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "news_type", catalog = "online_class")

public class NewsType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Set<News> newses = new HashSet<News>(0);

	// Constructors

	/** default constructor */
	public NewsType() {
	}

	/** full constructor */
	public NewsType(String type, Set<News> newses) {
		this.type = type;
		this.newses = newses;
	}

	// Property accessors
	@Id
	@GeneratedValue

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type")

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "newsType")

	public Set<News> getNewses() {
		return this.newses;
	}

	public void setNewses(Set<News> newses) {
		this.newses = newses;
	}

}