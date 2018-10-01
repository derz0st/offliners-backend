package com.offliners.userservice.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
public class UserCreateRequest {
    @NotEmpty
    @JsonProperty("fist_name")
    private String firstName;
    @NotEmpty
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("birthday_date")
    private LocalDate birthday;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("facebook")
    private String facebook;
}
