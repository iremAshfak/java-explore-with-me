package ru.practicum.ewm.dto.stat;

public record ViewStatsResponseDto(
        String app,
        String uri,
        Long hits
) {
}
