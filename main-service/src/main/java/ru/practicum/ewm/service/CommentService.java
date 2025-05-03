package ru.practicum.ewm.service;

import ru.practicum.ewm.dto.create.CommentCreateDto;
import ru.practicum.ewm.dto.update.CommentUpdateDto;
import ru.practicum.ewm.entity.Comment;
import java.util.List;

public interface CommentService {

    Comment createComment(CommentCreateDto createDto);

    Comment patchCommentByUser(long userId, long commentId, CommentUpdateDto updateDto);

    Comment getCommentById(long commentId);

    List<Comment> getEventComments(long eventId, String state, String end, int from, int size);

    void deleteComment(long userId, long commentId);
}
