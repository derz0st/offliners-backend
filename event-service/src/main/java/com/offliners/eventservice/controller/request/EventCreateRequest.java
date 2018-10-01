package com.offliners.eventservice.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class EventCreateRequest {
    @JsonProperty("id")
    private String id;
    @NotEmpty
    @JsonProperty("description")
    private String description;
    @JsonProperty("author_id")
    private Long authorId;
    @JsonProperty("image_id")
    private String imageId;
}
