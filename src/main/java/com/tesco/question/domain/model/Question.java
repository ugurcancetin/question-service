package com.tesco.question.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "questions")
public class Question {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private UUID id;

  private String userId;
  private String title;
  private String body;
  private String tags;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private int viewCount;
  private int upvoteCount;
  private int downvoteCount;
  private String acceptedAnswerId;
  private String status;

  // Default constructor required by JPA
  public Question() {
  }

  // Constructor for setting fields
  public Question(UUID id, String userId, String title, String body, String tags, LocalDateTime createdAt,
      LocalDateTime updatedAt, int viewCount, int upvoteCount, int downvoteCount,
      String acceptedAnswerId, String status) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.body = body;
    this.tags = tags;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.viewCount = viewCount;
    this.upvoteCount = upvoteCount;
    this.downvoteCount = downvoteCount;
    this.acceptedAnswerId = acceptedAnswerId;
    this.status = status;
  }

  // Getters and setters

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public int getUpvoteCount() {
    return upvoteCount;
  }

  public void setUpvoteCount(int upvoteCount) {
    this.upvoteCount = upvoteCount;
  }

  public int getDownvoteCount() {
    return downvoteCount;
  }

  public void setDownvoteCount(int downvoteCount) {
    this.downvoteCount = downvoteCount;
  }

  public String getAcceptedAnswerId() {
    return acceptedAnswerId;
  }

  public void setAcceptedAnswerId(String acceptedAnswerId) {
    this.acceptedAnswerId = acceptedAnswerId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}