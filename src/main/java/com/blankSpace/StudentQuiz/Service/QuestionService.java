package com.blankSpace.StudentQuiz.Service;

import com.blankSpace.StudentQuiz.DAO.QuestionDAO;
import com.blankSpace.StudentQuiz.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDAO questionDAO;

    public List<Question> getAllQuestion() {
        return questionDAO.findAll();
    }
}
