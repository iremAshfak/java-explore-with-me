package ru.practicum.ewm.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CommentUpdateDto(
        @NotBlank
        String text,
        String created,
        Long updatedById,
        Long eventId
) {
}
