package pro.sky.CourseWork2.service;

import pro.sky.CourseWork2.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
