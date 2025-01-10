package com.blankSpace.StudentQuiz.Entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;

    public Integer getQuestionId() {
        return id;
    }

    public String getAnswer() {
        return response;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
