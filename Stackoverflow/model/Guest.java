package stackoverflow.model;

import stackoverflow.dao.StackOverflowDao;

import java.util.List;

public class Guest {
    public List<Question> searchQuestions(StackOverflowDao stackOverflowDao) {
        return stackOverflowDao.getAllQuestions();
    }

    public Question getQuestion(StackOverflowDao stackOverflowDao, String questionId) {
        return stackOverflowDao.getQuestion(questionId);
    }
}
