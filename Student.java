public class Student {
    String name;
    float totScore;
    int n;
    Student(String name){
        this.name = name;
        totScore = 0;
        n = 0;
    }
    public String getName(){
        return name;
    }
    public void addQuiz(int score){
        totScore += score;
        n += 1;
    }
    public float getTotScore(){
        return totScore;
    }
    public float getAvgScore(){
        return totScore/n;
    }
}
