package com.blankSpace.StudentQuiz.DAO;

import com.blankSpace.StudentQuiz.Entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends MongoRepository<Question, String> {

    List<Question> findByCategory(String category);
}
