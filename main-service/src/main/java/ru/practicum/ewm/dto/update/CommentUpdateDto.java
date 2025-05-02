package ru.practicum.ewm.dto.update;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record CommentUpdateDto(
        Long id,
        @NotBlank
        String text,
        String created,
        Long commenterId,
        Long eventId,
        LocalDateTime updatedAt,
        Long updatedById
) {
}
