package pro.sky.CourseWork2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.repositories.QuestionRepository;
import pro.sky.CourseWork2.repositories.QuestionRepositoryImpl;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    private final QuestionRepository questionRepository =new QuestionRepositoryImpl();
    @InjectMocks
    JavaQuestionService javaQuestionService = new JavaQuestionService(questionRepository);
    List<Question> testCollection = new ArrayList<>();
    @BeforeEach
    void addTestSet() {
        testCollection.add(new Question("Вопрос6", "ответ6"));
        testCollection.add(new Question("Вопрос7", "ответ7"));
        testCollection.add(new Question("Вопрос8", "ответ8"));
    }

    @Test
    void addQuestion() {
        Question actual = new Question("Вопрос6", "ответ6");
        testCollection.contains(actual);
    }

    @Test
    void remove() {
        Question actual = new Question("Вопрос6", "ответ6");
        testCollection.remove(actual);
        assertEquals(false, testCollection.contains(actual));
    }
    @Test
    void gatAll(){
        Question q1 = new Question("Вопрос6", "ответ6");
        Question q2 = new Question("Вопрос7", "ответ7");
        Question q3 = new Question("Вопрос8", "ответ8");
        List<Question> actual = new ArrayList(Arrays.asList(q1,q2,q3));
        assertEquals(testCollection,actual);
    }
}