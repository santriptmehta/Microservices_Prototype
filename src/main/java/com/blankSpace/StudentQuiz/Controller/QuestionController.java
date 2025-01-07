package com.blankSpace.StudentQuiz.Controller;

import com.blankSpace.StudentQuiz.Entity.Question;
import com.blankSpace.StudentQuiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/getQuestion")
    public ResponseEntity<List<Question>> getAllQuestion() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/postQuestion")
    public ResponseEntity<Question> postQuestion(@RequestBody Question question) {
        return questionService.postQuestion(question);
    }

    @DeleteMapping("/deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable String id) {
        return questionService.deleteQuestion(id);
    }
}
