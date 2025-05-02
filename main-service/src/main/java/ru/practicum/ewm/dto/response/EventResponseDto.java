package ru.practicum.ewm.dto.response;

import ru.practicum.ewm.dto.info.UserInfoDto;
import ru.practicum.ewm.entity.Comment;
import ru.practicum.ewm.entity.EventState;
import ru.practicum.ewm.entity.Location;
import java.util.Set;

public record EventResponseDto(
        long id,
        String title,
        String annotation,
        CategoryResponseDto category,
        boolean paid,
        String eventDate,
        UserInfoDto initiator,
        long views,
        int confirmedRequests,
        String description,
        int participantLimit,
        EventState state,
        String createdOn,
        String publishedOn,
        Location location,
        boolean requestModeration,
        Set<Comment> longComments
){
}
