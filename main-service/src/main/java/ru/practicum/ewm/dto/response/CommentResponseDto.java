package ru.practicum.ewm.dto.response;

import jakarta.validation.constraints.NotBlank;
import ru.practicum.ewm.dto.info.UserInfoDto;

public record CommentResponseDto(
        long id,
        @NotBlank
        String text,
        String created,
        UserInfoDto commenter,
        EventResponseDto event
) {
}