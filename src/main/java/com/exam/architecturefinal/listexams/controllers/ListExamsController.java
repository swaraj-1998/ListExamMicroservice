package com.exam.architecturefinal.listexams.controllers;

import com.exam.architecturefinal.listexams.models.Exam;
import com.exam.architecturefinal.listexams.services.ListExamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@CrossOrigin("*")
public class ListExamsController {

    @Autowired
    ListExamsService listExamsService;

    @GetMapping("/getExams")
    List<Exam> getAllExams() {
        return listExamsService.getAllExams();
    }

    @GetMapping("/getExams/{examCode}")
    List<Exam> getAllExamsByCode(@PathVariable String examCode) {
        return listExamsService.getAllExamsByCode(examCode);
    }

    @GetMapping("/getExamsInAsc")
    List<Exam> getAllExamsInAsc() {
        return listExamsService.getAllExamsInAsc();
    }


    @GetMapping("/getExamsInDesc")
    List<Exam> getAllExamsInDesc() {
        return listExamsService.getAllExamsInDesc();
    }

    @GetMapping("/getExamsBetween")
    List<Exam> getAllExamsBetweenDate(
            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate
    ) {
        return listExamsService.getAllExamsBetweenDates(startDate, endDate);
    }

}
