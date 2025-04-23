package ru.practicum.ewm.server.stat.mapper;

import org.mapstruct.Mapper;
import ru.practicum.ewm.dto.stat.ViewStatsResponseDto;
import ru.practicum.ewm.server.stat.entity.ViewStats;

@Mapper(componentModel = "spring")
public interface ViewStatsMapper {
    ViewStatsResponseDto toViewStatsDto(ViewStats viewStats);
}