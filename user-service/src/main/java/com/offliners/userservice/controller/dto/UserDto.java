package com.offliners.userservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("fist_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birthday_date")
    private LocalDate birthday;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("facebook")
    private String facebook;
}
