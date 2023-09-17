package pro.sky.CourseWork2.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pro.sky.CourseWork2.Question;

import java.util.*;
@Repository
@Primary
public class QuestionRepositoryImpl implements QuestionRepository {
    private Set<Question> setQuestion = new HashSet<>();

    public QuestionRepositoryImpl() {
        setQuestion.add(new Question("Вопрос1", "ответ1"));
        setQuestion.add(new Question("Вопрос2", "ответ2"));
        setQuestion.add(new Question("Вопрос3", "ответ3"));
        setQuestion.add(new Question("Вопрос4", "ответ4"));
        setQuestion.add(new Question("Вопрос5", "ответ5"));
    }

    public Question add(String question, String answer) {
        Question value = new Question(question, answer);
        setQuestion.add(value);
        return value;
    }


    public Question add(Question question) {
        setQuestion.add(question);
        return question;
    }


    public Question remove(Question question) {
        setQuestion.remove(question);
        return question;
    }



    public Collection<Question> getAll() {
        return setQuestion;
    }

}
