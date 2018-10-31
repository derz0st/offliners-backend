package com.offliners.commentservice.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.offliners.commentservice.model.Comment;
import com.offliners.commentservice.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
    private final CommentRepository commentRepository;
    public List<Comment> getComments() {
        return commentRepository.findAll();
    }
}
