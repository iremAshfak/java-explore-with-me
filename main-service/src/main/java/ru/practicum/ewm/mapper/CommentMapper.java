package ru.practicum.ewm.mapper;

import org.mapstruct.*;
import ru.practicum.ewm.dto.create.CommentCreateDto;
import ru.practicum.ewm.dto.response.CommentResponseDto;
import ru.practicum.ewm.dto.update.CommentUpdateDto;
import ru.practicum.ewm.entity.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "commenter", ignore = true)
    @Mapping(target = "event", ignore = true)
    Comment toEntity(CommentCreateDto commentCreateDto);

    CommentResponseDto toResponse(Comment comment);

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Comment toEntity(CommentUpdateDto commentUpdateDto, @MappingTarget Comment comment);
}
