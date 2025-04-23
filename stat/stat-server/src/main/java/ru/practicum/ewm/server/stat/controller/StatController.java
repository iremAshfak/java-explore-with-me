package ru.practicum.ewm.server.stat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.ewm.dto.stat.EndpointHitCreateDto;
import ru.practicum.ewm.dto.stat.ViewStatsResponseDto;
import ru.practicum.ewm.server.stat.service.StatService;

import java.time.LocalDateTime;
import java.util.List;

import static ru.practicum.ewm.server.stat.ConstantDate.DATE;


@RestController
@RequiredArgsConstructor
public class StatController {
    private final StatService statService;

    @PostMapping("/hit")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveHit(@RequestBody EndpointHitCreateDto endpointHitCreateDto) {
        statService.saveHit(endpointHitCreateDto);
    }

    @GetMapping("/stats")
    public List<ViewStatsResponseDto> getStats(@DateTimeFormat(pattern = DATE) @RequestParam LocalDateTime start,
                                               @DateTimeFormat(pattern = DATE) @RequestParam LocalDateTime end,
                                               @RequestParam(required = false) List<String> uris,
                                               @RequestParam(required = false, defaultValue = "false") Boolean unique) {
        return statService.getStats(start, end, uris, unique);
    }
}