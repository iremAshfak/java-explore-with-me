package ru.practicum.ewm.dto.create;

import jakarta.validation.constraints.NotBlank;

public record CommentCreateDto(
        @NotBlank
        String text,
        String created,
        @NotBlank
        Long commenterId,
        @NotBlank
        Long eventId
) {
}