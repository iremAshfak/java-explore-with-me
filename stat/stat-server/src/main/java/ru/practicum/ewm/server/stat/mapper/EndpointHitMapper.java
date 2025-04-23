package ru.practicum.ewm.server.stat.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.practicum.ewm.dto.stat.EndpointHitCreateDto;
import ru.practicum.ewm.server.stat.entity.EndpointHit;

import static ru.practicum.ewm.server.stat.ConstantDate.DATE;

@Mapper(componentModel = "spring")
public interface EndpointHitMapper {
    @Mapping(target = "timestamp", source = "timestamp", dateFormat = DATE)
    EndpointHit toEntity(EndpointHitCreateDto endpointHitCreateDto);
}