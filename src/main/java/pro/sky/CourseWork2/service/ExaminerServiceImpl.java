package pro.sky.CourseWork2.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Question;

import java.util.Collection;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService, QuestionService questionService1) {
        this.questionService = questionService1;
    }
//    Его задача:
//    создать коллекцию и заполнить её с помощью вызова getRandomQuestion у QuestionService случайными вопросами.

    public Collection<Question> getQuestions(int amount) {
        return questionService.getAll();
    }
}
