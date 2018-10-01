package com.offliners.userservice.controller;

import com.offliners.userservice.controller.dto.UserDto;
import com.offliners.userservice.controller.request.UserCreateRequest;
import com.offliners.userservice.model.User;
import com.offliners.userservice.service.UserService;
import com.offliners.userservice.transformer.UserTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private final UserService userService;
    private final UserTransformer userTransformer;
    
    @PostMapping
    public UserDto createUser(@Validated @RequestBody UserCreateRequest request) {
        User user = userService.createUser(request);
        return userTransformer.toDto(user);
    }
    
}
