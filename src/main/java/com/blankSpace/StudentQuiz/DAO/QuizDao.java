package com.blankSpace.StudentQuiz.DAO;

import com.blankSpace.StudentQuiz.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
