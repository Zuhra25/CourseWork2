package pro.sky.CourseWork2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")

public class MathQuestionController {
    private final QuestionService questionService;

    public MathQuestionController(@Qualifier("math") QuestionService mathQuestionService) {
        this.questionService = mathQuestionService;
    }

    //Добавить: /exam/math/add?question=QuestionText&answer=QuestionAnswer
    @GetMapping("/add")
    public Question add(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    //Удалить: /exam/math/remove?question=QuestionText&answer=QuestionAnswer
    @GetMapping("/remove")
    public Question remove(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(new Question(question, answer));
    }

    //Получить все вопросы: /exam/math
    @GetMapping()
    public Collection<Question> getAll() {
        return questionService.getAll();
    }


}
