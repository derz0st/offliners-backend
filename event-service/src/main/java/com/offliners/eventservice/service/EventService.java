package com.offliners.eventservice.service;

import com.offliners.eventservice.model.Event;
import com.offliners.eventservice.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository postRepository;
    
    public Mono<Event> createPost(Event post) {
        return postRepository.save(post);
    }
    
    public Flux<Event> getAllPosts() {
        return postRepository.findAll();
    }
}
