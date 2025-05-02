package ru.practicum.ewm.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record CommentUpdateDto(
        Long id,
        @NotBlank
        String text,
        String created,
        Long commenterId,
        @NotNull
        Long eventId,
        LocalDateTime updatedAt,
        Long updatedById
) {
}
