package ru.practicum.ewm.server.stat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.practicum.ewm.dto.stat.EndpointHitCreateDto;
import ru.practicum.ewm.dto.stat.ViewStatsResponseDto;
import ru.practicum.ewm.server.stat.mapper.EndpointHitMapper;
import ru.practicum.ewm.server.stat.mapper.ViewStatsMapper;
import ru.practicum.ewm.server.stat.repository.StatRepository;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StatServiceImpl implements StatService {
    private final StatRepository statsServerRepository;
    private final EndpointHitMapper endpointHitMapper;
    private final ViewStatsMapper viewStatsMapper;

    @Override
    public void saveHit(EndpointHitCreateDto endpointHitCreateDto) {
        statsServerRepository.save(endpointHitMapper.toEntity(endpointHitCreateDto));
    }

    @Override
    public List<ViewStatsResponseDto> getStats(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique) {
        if (unique) {
            return statsServerRepository.findDistinctViews(start, end, uris).stream().map(viewStatsMapper::toViewStatsDto).toList();
        } else {
            return statsServerRepository.findViews(start, end, uris).stream().map(viewStatsMapper::toViewStatsDto).toList();
        }
    }
}
