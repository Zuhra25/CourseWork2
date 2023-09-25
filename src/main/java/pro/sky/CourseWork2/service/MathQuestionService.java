package pro.sky.CourseWork2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.CourseWork2.Question;
import pro.sky.CourseWork2.repositories.MathQuestionRepositoryImpl;

import java.util.*;

@Service
@Qualifier("math")
public class MathQuestionService implements QuestionService {
    private final MathQuestionRepositoryImpl mathQuestionRepository;

    public MathQuestionService(MathQuestionRepositoryImpl mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return mathQuestionRepository.add(question, answer);
    }

    @Override
    public Question add(Question question) {
        return mathQuestionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return mathQuestionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> listQuestion = new ArrayList<>(mathQuestionRepository.getAll());
        Random random = new Random();
        int r = random.nextInt(mathQuestionRepository.getAll().size());
        return listQuestion.get(r);
    }
}
