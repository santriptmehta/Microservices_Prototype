package com.blankSpace.StudentQuiz.Controller;

import com.blankSpace.StudentQuiz.Entity.Question;
import com.blankSpace.StudentQuiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/getQuestion")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }
}
