package com.exam.architecturefinal.listexams.services;

import com.exam.architecturefinal.listexams.daos.ExamsRepository;
import com.exam.architecturefinal.listexams.models.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ListExamsService {

    @Autowired
    ExamsRepository examsRepository;

    public List<Exam> getAllExams() {
        return (List<Exam>) examsRepository.findAll();
    }

    public List<Exam> getAllExamsByCode(String code) {
        return examsRepository.findExamsByExamCode(code);
    }


    public List<Exam> getAllExamsInAsc() {
        return examsRepository.findAllByOrderByExamDateAsc();
    }


    public List<Exam> getAllExamsInDesc() {
        return examsRepository.findAllByOrderByExamDateDesc();
    }


    public List<Exam> getAllExamsBetweenDates(Date startDate, Date endDate) {
        return examsRepository.findAllByExamDateBetween(startDate, endDate);
    }
}
