package pro.sky.CourseWork2.service;

import org.junit.jupiter.api.Test;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.repositories.QuestionRepository;
import pro.sky.CourseWork2.repositories.QuestionRepositoryImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    private final QuestionRepository questionRepository =new QuestionRepositoryImpl();
    JavaQuestionService javaQuestionService = new JavaQuestionService(questionRepository);
    Question temp = new Question("Вопрос6", "ответ6");

    @Test
    void addStringParametrs() {
        Question actual = javaQuestionService.add("Вопрос6", "ответ6");
        assertEquals(true, javaQuestionService.getAll().contains(temp));
    }

    @Test
    void addQuestion() {
        Question actual = javaQuestionService.add(new Question("Вопрос6", "ответ6"));
        assertEquals(true, javaQuestionService.getAll().contains(temp));
    }

    @Test
    void remove() {
        addQuestion();
        javaQuestionService.remove(temp);
        assertEquals(false, javaQuestionService.getAll().contains(temp));
    }
}