package pro.sky.CourseWork2.service;

import pro.sky.CourseWork2.Question;

import java.util.Collection;

public interface ExaminerService {
//    Сделать интерфейс ExaminerService с одним методом getQuestions.
//    Этот интерфейс должен содержать один метод, который вернет список вопросов.

//    Его задача:
//    создать коллекцию и заполнить её с помощью вызова getRandomQuestion у QuestionService случайными вопросами.

    public Collection<Question> getQuestions(int amount);
}
