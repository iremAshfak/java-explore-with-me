package ru.practicum.ewm.dto.update;


public record CommentUpdateDto(
        String text,
        String created,
        Long updatedById,
        Long eventId
) {
}
