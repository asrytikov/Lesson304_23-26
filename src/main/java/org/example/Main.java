package org.example;

import org.example.model.Comment;
import org.example.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setAuthor("Alex");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.sendComment(comment);
        commentService.sendComment(comment);


    }
}