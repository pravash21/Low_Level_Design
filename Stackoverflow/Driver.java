package stackoverflow;

import stackoverflow.dao.StackOverflowDao;
import stackoverflow.model.*;


public class Driver {
    public static void main(String[] args) {
        StackOverflowDao stackOverflowDao = new StackOverflowDao();
        Guest guest = new Guest();
        Thread thread = new Thread();

        Account account = new Account("Pravash", "xyxsf@gmail.com");
        Member member = new Member(account);

        Account account2 = new Account("Pravash2", "dhdcx@gmail.com");
        Member member2 = new Member(account2);

        Question question = new Question("Hi how are you?", member);
        member.addQuestion(stackOverflowDao, question);
        getAllQuestions(guest, stackOverflowDao);

        Comment comment = new Comment("Comment on question", member2);
        member2.addCommentToQuestion(stackOverflowDao, question.getEntityId(), comment);
        getAllQuestions(guest, stackOverflowDao);

        Answer answer = new Answer("I am good", member2);
        member2.addAnswer(stackOverflowDao, question.getEntityId(), answer);
        getAllQuestions(guest, stackOverflowDao);

        Comment comment1 = new Comment("Comment on answer", member2);
        member2.addCommentToAnswer(stackOverflowDao, answer.getEntityId(), comment1);
        getAllQuestions(guest, stackOverflowDao);

    }

    private static void getAllQuestions(Guest guest, StackOverflowDao stackOverflowDao) {
        System.out.println(guest.searchQuestions(stackOverflowDao));
        System.out.println();
    }
}
