package constructors;

public class Quiz {
    String subject;
    int totalQuestions;
    double timeLimit;

    Quiz(){
        this("java");
    }
    Quiz(String subject){
        this(subject, 50);
    }

    Quiz(String subject, int totalQuestions){
        this(subject, totalQuestions, 1);
    }

    Quiz(String subject, int totalQuestions, double timeLimit){
        this.subject = subject;
        this.totalQuestions = totalQuestions;
        this.timeLimit = timeLimit;
    }

    public void quizInfo(){
        System.out.println("Quiz Details");
        System.out.println("--------------------");
        System.out.println("Subject          : " + subject);
        System.out.println("Total Questions  : " + totalQuestions);
        System.out.println("Time Limit       : " + timeLimit + " " + "hour(s)");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.quizInfo();

        Quiz quiz2 = new Quiz("python", 70);
        quiz2.quizInfo();

        Quiz quiz3 = new Quiz("SQL", 40, 1.5);
        quiz3.quizInfo();
    }
}
