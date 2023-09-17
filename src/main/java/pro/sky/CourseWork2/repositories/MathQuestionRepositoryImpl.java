package pro.sky.CourseWork2.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import pro.sky.CourseWork2.Question;

import java.util.*;
@Repository
@Qualifier("math")
public class MathQuestionRepositoryImpl implements QuestionRepository{
    Set<Question> MathQuestion = new HashSet<>();

    public MathQuestionRepositoryImpl() {
        MathQuestion.add(new Question("1 + 5 = ?", "ответ: 6"));
        MathQuestion.add(new Question("2 + 5 = ?", "ответ: 7"));
        MathQuestion.add(new Question("3 + 5 = ?", "ответ: 8"));
        MathQuestion.add(new Question("4 + 5 = ?", "ответ: 9"));
        MathQuestion.add(new Question("5 + 5 = ?", "ответ: 10"));
    }


    public Question add(String question, String answer) {
        Question value = new Question(question, answer);
        MathQuestion.add(value);
        return value;
    }

    public Question add(Question question) {
        MathQuestion.add(question);
        return question;
    }


    public Question remove(Question question) {
        MathQuestion.remove(question);
        return question;
    }



    public Collection<Question> getAll() {
        return MathQuestion;
    }

}
