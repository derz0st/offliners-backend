package com.offliners.eventservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("author_id")
    private Long authorId;
    @JsonProperty("image_id")
    private String imageId;
    @JsonProperty("description")
    private String description;
}
