package com.offliners.eventservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
@Data
@Builder
@ToString
public class Event {
    @Id
    private String id;
    private Long authorId;
    private String imageId;
    private String description;
//    @CreatedDate
//    private LocalDateTime created;
}
