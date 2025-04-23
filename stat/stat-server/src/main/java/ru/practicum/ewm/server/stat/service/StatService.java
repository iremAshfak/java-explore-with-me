package ru.practicum.ewm.server.stat.service;

import ru.practicum.ewm.dto.stat.EndpointHitCreateDto;
import ru.practicum.ewm.dto.stat.ViewStatsResponseDto;

import java.time.LocalDateTime;
import java.util.List;

public interface StatService {
    void saveHit(EndpointHitCreateDto endpointHitCreateDto);

    List<ViewStatsResponseDto> getStats(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique);
}
