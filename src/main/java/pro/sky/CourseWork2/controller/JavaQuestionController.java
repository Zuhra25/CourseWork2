package pro.sky.CourseWork2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
@Primary
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //Добавить: /exam/java/add?question=QuestionText&answer=QuestionAnswer
    @GetMapping("/add")
    public Question add(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    //Удалить: /exam/java/remove?question=QuestionText&answer=QuestionAnswer
    @GetMapping("/remove")
    public Question remove(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(new Question(question, answer));
    }

    //Получить все вопросы: /exam/java
    @GetMapping()
    public Collection<Question> getAll() {
        return questionService.getAll();
    }
}
