package com.blankSpace.StudentQuiz.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToMany
    private List<Question> questionList;

    public Quiz() {
    }

    public Quiz(Integer id, String title, List<Question> questionList) {
        this.id = id;
        this.title = title;
        this.questionList = questionList;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
