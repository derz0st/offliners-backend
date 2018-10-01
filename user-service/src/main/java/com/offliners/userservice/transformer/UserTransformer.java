package com.offliners.userservice.transformer;

import com.offliners.userservice.controller.dto.UserDto;
import com.offliners.userservice.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserTransformer {
    
    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .birthday(user.getBirthday())
                .bio(user.getBio())
                .facebook(user.getFacebook())
                .build();
    } 
}
