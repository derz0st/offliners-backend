package com.offliners.eventservice.transformer;

import com.offliners.eventservice.controller.dto.EventDto;
import com.offliners.eventservice.controller.request.EventCreateRequest;
import com.offliners.eventservice.model.Event;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventTransformer {
    
    private final ModelMapper mapper;
    
    public EventDto toDto(Event from) {
        return mapper.map(from, EventDto.class);
    }
    
    public Event toEntity(EventCreateRequest from) {
        return mapper.map(from, Event.class);
    }
}
