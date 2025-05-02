package ru.practicum.ewm.dto.update;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record CommentUpdateDto(
        @NotBlank
        String text,
        String created,
        Long commenterId,
        @NotBlank
        Long eventId,
        LocalDateTime updatedAt,
        Long updatedById
) {
}
