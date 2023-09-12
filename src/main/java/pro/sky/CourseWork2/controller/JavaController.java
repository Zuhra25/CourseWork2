package pro.sky.CourseWork2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.service.QuestionService;

@RestController
@RequestMapping("/exam/java")
public class JavaController {
private final QuestionService questionService;

    public JavaController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question add(@RequestParam String question, @RequestParam String answer){
        return questionService.add(question,answer);
    }
//    Question add(Question question);
//    Question remove(Question question);
//    Collection<Question> getAll();
//    Question getRandomQuestion();

}
