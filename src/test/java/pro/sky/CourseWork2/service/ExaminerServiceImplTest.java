package pro.sky.CourseWork2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.exception.BAD_REQUEST;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    private JavaQuestionService javaQuestionServiceMock;
    @Mock
    private MathQuestionService mathQuestionServiceMock;
    @InjectMocks
    private ExaminerServiceImpl examinerServiceMock;

    List<Question> testCollection = new ArrayList<>();

    @BeforeEach
    void addTestJavaQuestion() {
        testCollection.add(new Question("Вопрос6", "ответ6"));
        testCollection.add(new Question("Вопрос7", "ответ7"));
        testCollection.add(new Question("Вопрос8", "ответ8"));
    }
    @BeforeEach
    void addTestJMathQuestion() {
        testCollection.add(new Question("1 + 5 = ?", "ответ: 6"));
        testCollection.add(new Question("2 + 5 = ?", "ответ: 7"));
        testCollection.add(new Question("3 + 5 = ?", "ответ: 8"));
    }

    @Test
    void ejectionException() {
        assertEquals("в каталоге меньше вопросов",
                assertThrows(BAD_REQUEST.class, () -> examinerServiceMock.getQuestions(javaQuestionServiceMock.getAll().size()+1)).getMessage());
        assertEquals("в каталоге меньше вопросов",
                assertThrows(BAD_REQUEST.class, () -> examinerServiceMock.getQuestions(mathQuestionServiceMock.getAll().size()+1)).getMessage());
    }

    @Test
    void getQuestions() {
        int actualSize = 3;
        int resultSize = 3;
        Random random = new Random();
        Set<Question> setRandomQuestionTest = new HashSet<>();
        while (setRandomQuestionTest.size() < resultSize) {
            int r = random.nextInt(testCollection.size());
            setRandomQuestionTest.add(testCollection.get(r));
        }
        assertEquals(actualSize, setRandomQuestionTest.size());
    }
}
