package com.exam.architecturefinal.listexams.daos;

import com.exam.architecturefinal.listexams.models.Exam;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


public interface ExamsRepository extends CrudRepository<Exam, Integer> {

    List<Exam> findExamsByExamCode(String code);
    List<Exam> findAllByOrderByExamDateAsc();
    List<Exam> findAllByOrderByExamDateDesc();

    List<Exam> findAllByExamDateBetween(Date startDate, Date endDate);

}
