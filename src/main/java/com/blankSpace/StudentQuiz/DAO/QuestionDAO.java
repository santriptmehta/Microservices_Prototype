package com.blankSpace.StudentQuiz.DAO;

import com.blankSpace.StudentQuiz.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionDAO extends JpaRepository<Question, Long> {

}
