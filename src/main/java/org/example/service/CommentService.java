package org.example.service;

import org.example.model.Comment;
import org.example.processor.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment){
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);
        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);

        System.out.println("CommentService: " + comment.getText());
    }

}
