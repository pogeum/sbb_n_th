package com.korea.second.answer;

import com.korea.second.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
    //텍게에서 했던거처럼, 답변을 등록할 해당질문이랑 연결하려고 참조?
    //질문 엔티티와 연결된 속성이란것을 명시적으로 표현한것.



}
