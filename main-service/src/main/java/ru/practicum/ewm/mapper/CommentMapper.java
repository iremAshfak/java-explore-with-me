package ru.practicum.ewm.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.practicum.ewm.dto.create.CommentCreateDto;
import ru.practicum.ewm.dto.response.CommentResponseDto;
import ru.practicum.ewm.dto.update.CommentUpdateDto;
import ru.practicum.ewm.entity.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    Comment toEntity(CommentCreateDto commentCreateDto);

    CommentResponseDto toResponse(Comment comment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Comment toEntity(CommentUpdateDto commentUpdateDto, @MappingTarget Comment comment);
}
