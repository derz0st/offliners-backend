package com.offliners.eventservice.controller;

import com.offliners.eventservice.controller.dto.EventDto;
import com.offliners.eventservice.controller.request.EventCreateRequest;
import com.offliners.eventservice.service.EventService;
import com.offliners.eventservice.transformer.EventTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/api/events")
@RequiredArgsConstructor
public class EventController {
    
    private final EventService postService;
    private final EventTransformer transformer;
    
    @GetMapping
    public Flux<EventDto> getAllPosts() {
        return postService.getAllPosts()
                .map(transformer::toDto);
    }
    
    @PostMapping
    public Mono<EventDto> createPost(@Validated @RequestBody EventCreateRequest request) {
        return postService
                .createPost(transformer.toEntity(request))
                .map(transformer::toDto);
    }
}
