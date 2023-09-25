package pro.sky.CourseWork2.repositories;

import pro.sky.CourseWork2.Question;

import java.util.Collection;

public interface QuestionRepository {
    public Question add(String question, String answer);
    public Question add(Question question);
    public Question remove(Question question);
    public Collection<Question> getAll();
}
