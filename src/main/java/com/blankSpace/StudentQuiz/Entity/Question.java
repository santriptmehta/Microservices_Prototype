package com.blankSpace.StudentQuiz.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "question_bank")
public class Question {

    @Id
    @Column(name = "id") // Assuming the ID is in your table
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name = "difficultylevel")
    private String difficultyLevel;

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "right_answer")
    private String rightAnswer;
}
