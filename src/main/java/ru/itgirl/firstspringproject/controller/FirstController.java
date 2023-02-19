package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "dayOfWeekEn", defaultValue = "MONDAY") DayOfWeekEn dayOfWeekEn) {
        String dayOfWeekRu = "";
        switch (dayOfWeekEn) {
            case MONDAY:
                dayOfWeekRu = "Понедельник";
                break;
            case TUESDAY:
                dayOfWeekRu = "Вторник";
                break;
            case WEDNESDAY:
                dayOfWeekRu = "Среда";
                break;
            case THURSDAY:
                dayOfWeekRu = "Четверг";
                break;
            case FRIDAY:
                dayOfWeekRu = "Пятница";
                break;
            case SATURDAY:
                dayOfWeekRu = "Суббота";
                break;
            case SUNDAY:
                dayOfWeekRu = "Воскресенье";
                break;
        }
        return String.format("Сегодня %s!", dayOfWeekRu);
    }

    public enum DayOfWeekEn {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}