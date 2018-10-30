package com.offliners.commentservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "comments")
public class Comment {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "text")
    private String text;
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "created_date")
    private ZonedDateTime createdDate;
}
