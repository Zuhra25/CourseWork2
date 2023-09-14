package pro.sky.CourseWork2.service;

import org.junit.jupiter.api.Test;
import pro.sky.CourseWork2.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    JavaQuestionService javaQuestionService = new JavaQuestionService();
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