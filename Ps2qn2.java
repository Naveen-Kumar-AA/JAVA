import java.util.*;

class Ps2qn2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student logun = new Student("LoguN");
        logun.addQuiz(87);
        logun.addQuiz(89);
        logun.addQuiz(93);
        System.out.println("Student's name : "+logun.getName());
        System.out.println("Student's total score : "+logun.getTotScore());
        System.out.println("Student's average score : "+logun.getAvgScore());
    }
}