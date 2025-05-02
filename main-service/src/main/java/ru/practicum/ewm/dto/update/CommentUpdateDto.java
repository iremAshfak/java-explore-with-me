package ru.practicum.ewm.dto.update;

import jakarta.validation.constraints.NotBlank;

public record CommentUpdateDto(
        @NotBlank
        String text,
        String created,
        Long commenterId,
        @NotBlank
        Long eventId
) {
}
