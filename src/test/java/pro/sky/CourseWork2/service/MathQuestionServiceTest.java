package pro.sky.CourseWork2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.repositories.MathQuestionRepositoryImpl;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {
    @Mock
    private final MathQuestionRepositoryImpl mathQuestionRepository = new MathQuestionRepositoryImpl();

    @InjectMocks
    MathQuestionService mathQuestionService = new MathQuestionService(mathQuestionRepository);
    Set<Question> testCollection = new HashSet<>();
    @BeforeEach
    void addTestSet() {
        testCollection.add(new Question("1 + 5 = ?", "ответ: 6"));
        testCollection.add(new Question("2 + 5 = ?", "ответ: 7"));
        testCollection.add(new Question("3 + 5 = ?", "ответ: 8"));
    }
    @Test
    void add() {
        Question actual = new Question("1 + 5 = ?", "ответ: 6");
        testCollection.contains(actual);
    }

    @Test
    void remove() {
        Question actual = new Question("1 + 5 = ?", "ответ: 6");
        testCollection.remove(actual);
        assertEquals(false, testCollection.contains(actual));
    }

    @Test
    void getAll() {
        Question q1 = new Question("1 + 5 = ?", "ответ: 6");
        Question q2 = new Question("2 + 5 = ?", "ответ: 7");
        Question q3 = new Question("3 + 5 = ?", "ответ: 8");
        Set<Question> actual = new HashSet<>(Arrays.asList(q1,q2,q3));
        assertEquals(testCollection,actual);
    }
}