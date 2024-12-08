package com.whyjoin.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "comment")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentID;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_updated")
    private Date dateUpdated;

    @Column(name = "comment_title")
    private String commentTitle;

    @Column(name = "comment_body")
    private String commentBody;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post parentPost;

    public Comments() {
    }

    public Comments(Long commentID, Date dateCreated, Date dateUpdated, String commentTitle, String commentBody,
            User createdBy, Post parentPost) {
        this.commentID = commentID;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.commentTitle = commentTitle;
        this.commentBody = commentBody;
        this.createdBy = createdBy;
        this.parentPost = parentPost;
    }

    public Long getCommentID() {
        return this.commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
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

    public String getCommentTitle() {
        return this.commentTitle;
    }

    public void setCommentTitle(String commentTitle) {
        this.commentTitle = commentTitle;
    }

    public String getCommentBody() {
        return this.commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Post getParentPost() {
        return this.parentPost;
    }

    public void setParentPost(Post parentPost) {
        this.parentPost = parentPost;
    }

    public Comments commentID(Long commentID) {
        setCommentID(commentID);
        return this;
    }

    public Comments dateCreated(Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    public Comments dateUpdated(Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    public Comments commentTitle(String commentTitle) {
        setCommentTitle(commentTitle);
        return this;
    }

    public Comments commentBody(String commentBody) {
        setCommentBody(commentBody);
        return this;
    }

    public Comments createdBy(User createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Comments parentPost(Post parentPost) {
        setParentPost(parentPost);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comments)) {
            return false;
        }
        Comments comments = (Comments) o;
        return Objects.equals(commentID, comments.commentID) && Objects.equals(dateCreated, comments.dateCreated)
                && Objects.equals(dateUpdated, comments.dateUpdated)
                && Objects.equals(commentTitle, comments.commentTitle)
                && Objects.equals(commentBody, comments.commentBody) && Objects.equals(createdBy, comments.createdBy)
                && Objects.equals(parentPost, comments.parentPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentID, dateCreated, dateUpdated, commentTitle, commentBody, createdBy, parentPost);
    }

    @Override
    public String toString() {
        return "{" +
                " commentID='" + getCommentID() + "'" +
                ", dateCreated='" + getDateCreated() + "'" +
                ", dateUpdated='" + getDateUpdated() + "'" +
                ", commentTitle='" + getCommentTitle() + "'" +
                ", commentBody='" + getCommentBody() + "'" +
                ", createdBy='" + getCreatedBy() + "'" +
                ", parentPost='" + getParentPost() + "'" +
                "}";
    }

}
