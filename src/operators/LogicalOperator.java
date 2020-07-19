package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int grade=10;
        if(!(grade==10||grade==12)){
            System.out.println("You cannot give board exams");
        }
    }
}
