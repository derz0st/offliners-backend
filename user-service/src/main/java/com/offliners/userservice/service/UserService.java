package com.offliners.userservice.service;

import com.offliners.userservice.controller.request.UserCreateRequest;
import com.offliners.userservice.model.User;
import com.offliners.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    
    public User createUser(UserCreateRequest request) {
        return userRepository.save(toUser(request));
    }
    
    private User toUser(UserCreateRequest request) {
        return User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .birthday(request.getBirthday())
                .bio(request.getBio())
                .facebook(request.getFacebook())
                .build();
    }
}
