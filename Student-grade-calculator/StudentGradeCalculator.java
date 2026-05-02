 //!                               Project 
 //todo                    Student Grade Calculator
import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("---------------------------------");
       System.out.println("    Student Grade Calculator  ");
       System.out.println("---------------------------------");

       System.out.print(" Enter the Number of Subjects : ");
       int input = sc.nextInt();

       int Marks[] = new int[input];
       int Totalmarks = 0 ;

       for(int i = 0 ; i<input ; i++)
       {
        System.out.print(" Subject "+(i+1)+": ");
        Marks[i] = sc.nextInt(); 
        Totalmarks = Totalmarks + Marks[i];
       }
       System.out.println();
       System.out.println(" Total Marks : "+Totalmarks);

       float Average = (float)Totalmarks/input;
       System.out.printf(" Average Percentage : %.2f\n",Average);

       if(Average>=90)
       {
        System.out.println(" Grade : A");
       }
       else if(Average>=80 )
       {
        System.out.println(" Grade : B");
       }
       else if(Average>=70)
       {
        System.out.println(" Grade : C");
       }
       else if(Average>=60)
       {
        System.out.println(" Grade : D");
       }
       else
       {
        System.out.println(" Grade : F");
       }
      
       System.out.println("---------------------------------");
    }
}