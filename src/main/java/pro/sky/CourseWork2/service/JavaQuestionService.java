package pro.sky.CourseWork2.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Question;

import java.util.*;
@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> setQuestion = new HashSet<>();

    public void JavaQuestionService() {
        setQuestion.add(new Question("Вопрос1", "ответ1"));
        setQuestion.add(new Question("Вопрос2", "ответ2"));
        setQuestion.add(new Question("Вопрос3", "ответ3"));
        setQuestion.add(new Question("Вопрос4", "ответ4"));
        setQuestion.add(new Question("Вопрос5", "ответ5"));
    }

    @Override
    public Question add(String question, String answer) {
        Question value = new Question(question,answer);
        setQuestion.add(value);
        return value;
    }

    @Override
    public Question add(Question question) {
        setQuestion.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        setQuestion.remove(question);
        return question;
    }


    @Override
    public Collection<Question> getAll() {
        return setQuestion;
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> listQuestion = new ArrayList<>(setQuestion);
        Random random = new Random();
        int r = random.nextInt(setQuestion.size());
        return listQuestion.get(r);
    }
}
