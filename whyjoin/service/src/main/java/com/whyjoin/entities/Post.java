package com.whyjoin.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postID;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_updated")
    private Date dateUpdated;

    @Column(name = "post_title")
    private String postTitle;

    @Column(name = "post_body")
    private String postBody;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User createdBy;

    @Column(name = "comments")
    @OneToMany(mappedBy = "parentPost", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comments> comments;

    public Post() {
    }

    public Post(Long postID, Date dateCreated, Date dateUpdated, String postTitle, String postBody, User createdBy) {
        this.postID = postID;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.createdBy = createdBy;
    }

    public Long getPostID() {
        return this.postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getPostTitle() {
        return this.postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostBody() {
        return this.postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Post postID(Long postID) {
        setPostID(postID);
        return this;
    }

    public Post dateCreated(Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    public Post dateUpdated(Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    public Post postTitle(String postTitle) {
        setPostTitle(postTitle);
        return this;
    }

    public Post postBody(String postBody) {
        setPostBody(postBody);
        return this;
    }

    public Post createdBy(User createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Post)) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(postID, post.postID) && Objects.equals(dateCreated, post.dateCreated)
                && Objects.equals(dateUpdated, post.dateUpdated) && Objects.equals(postTitle, post.postTitle)
                && Objects.equals(postBody, post.postBody) && Objects.equals(createdBy, post.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postID, dateCreated, dateUpdated, postTitle, postBody, createdBy);
    }

    @Override
    public String toString() {
        return "{" +
                " postID='" + getPostID() + "'" +
                ", dateCreated='" + getDateCreated() + "'" +
                ", dateUpdated='" + getDateUpdated() + "'" +
                ", postTitle='" + getPostTitle() + "'" +
                ", postBody='" + getPostBody() + "'" +
                ", createdBy='" + getCreatedBy() + "'" +
                "}";
    }

}
