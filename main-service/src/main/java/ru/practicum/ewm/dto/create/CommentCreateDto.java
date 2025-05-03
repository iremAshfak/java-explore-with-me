package ru.practicum.ewm.dto.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CommentCreateDto(
        @NotBlank
        String text,
        String created,
        @NotNull
        Long commenterId,
        Long eventId
) {
}