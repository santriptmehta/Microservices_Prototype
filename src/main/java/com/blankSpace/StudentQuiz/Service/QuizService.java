package com.blankSpace.StudentQuiz.Service;

import com.blankSpace.StudentQuiz.DAO.QuestionDAO;
import com.blankSpace.StudentQuiz.DAO.QuizDao;
import com.blankSpace.StudentQuiz.Entity.Question;
import com.blankSpace.StudentQuiz.Entity.QuestionWrapper;
import com.blankSpace.StudentQuiz.Entity.Quiz;
import com.blankSpace.StudentQuiz.Entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuestionDAO questionDAO;

    @Autowired
    QuizDao quizDao;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDAO.findRandomQuestionByCategory(category, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionList(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer quizId) {
        Optional<Quiz> quiz = quizDao.findById(quizId);
        List<Question> questionsFromDB = quiz.get().getQuestionList();
        List<QuestionWrapper> questionForUser = new ArrayList<>();

        for(Question question : questionsFromDB) {
            QuestionWrapper qw = new QuestionWrapper(question.getId(), question.getQuestion_title(), question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4());
            questionForUser.add(qw);
        }
        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateScore(Integer id, List<Response> response) {
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestionList();
        int i = 0;
        int score = 0;
        for(Response re : response) {
            if(re.getAnswer().equals(questions.get(i).getRight_answer())) {
                score++;
            }
            i++;
        }
        return new ResponseEntity<>(score, HttpStatus.OK);
    }
}
