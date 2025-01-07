package com.blankSpace.StudentQuiz.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "question_bank")
public class Question {
    @Id
    private String id;
    private String category;
    private String difficultyLevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;

    public Question(String id, String category, String difficultyLevel, String option1, String option2, String option3, String option4, String questionTitle, String rightAnswer) {
        this.id = id;
        this.category = category;
        this.difficultyLevel = difficultyLevel;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
        this.rightAnswer = rightAnswer;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
}
