package pro.sky.CourseWork2.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.exception.BAD_REQUEST;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService, QuestionService questionService1) {
        this.questionService = questionService1;
    }

    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new BAD_REQUEST("в каталоге меньше вопросов");
        }
        Set<Question> setRandomQuestion = new HashSet<>();
        while (setRandomQuestion.size() < amount) {
            setRandomQuestion.add(questionService.getRandomQuestion());
        }
        return setRandomQuestion;
    }
}
