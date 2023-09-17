package pro.sky.CourseWork2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.repositories.QuestionRepository;

import java.util.*;
@Service
//@Qualifier("java")
@Primary
public class JavaQuestionService implements QuestionService {
  private final QuestionRepository questionRepository;

    public JavaQuestionService( QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
    @Override
    public Question add(String question, String answer) {
        return questionRepository.add(question,answer);
    }

    @Override
    public Question add(Question question) {
        return questionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return questionRepository.remove(question);
    }


    @Override
    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> listQuestion = new ArrayList<>(questionRepository.getAll());
        Random random = new Random();
        int r = random.nextInt(questionRepository.getAll().size());
        return listQuestion.get(r);
    }
}
