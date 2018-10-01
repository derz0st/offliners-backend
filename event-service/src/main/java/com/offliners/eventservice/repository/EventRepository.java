package com.offliners.eventservice.repository;

import com.offliners.eventservice.model.Event;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EventRepository extends ReactiveMongoRepository<Event, String> {
}
