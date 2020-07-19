package arrays;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of student");
        int n=s.nextInt();
        int average=0;
        int marks[]=new int[n];
        for (int i=0;i<marks.length;i++){
            System.out.println("Enter the marks of student "+i);
            marks[i]=s.nextInt();
            average+=marks[i];
        }


        average=average/marks.length;
        System.out.println("Average Marks are: "+average);

    }
}
