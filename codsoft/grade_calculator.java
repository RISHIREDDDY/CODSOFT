package codsoft;
import java.util.*;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of subjects here: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        int total_marks = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            arr[i] = obj.nextInt(); 
            total_marks += arr[i];  
        }
        double AverageMarks = (double) total_marks / n;
        char grade;
        if (AverageMarks >= 95) {
            grade = 'A';
            System.out.println("Grade: A+");
        } else if (AverageMarks >= 85) {
            grade = 'A';
            System.out.println("Grade: A");
        } else if (AverageMarks >= 75) {
            grade = 'B';
            System.out.println("Grade: B+");
        } else if (AverageMarks >= 65) {
            grade = 'B';
            System.out.println("Grade: B-");
        } else if (AverageMarks >= 55) {
            grade = 'C';
            System.out.println("Grade: C");
        } else if (AverageMarks >= 45) {
            grade = 'D';
            System.out.println("Grade: D");
        } else {
            System.out.println("Sorry, you have failed the exam. Better luck next time.");
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total_marks + " out of " + (n * 100));
        System.out.println("Average Percentage: " + AverageMarks + "%");
        obj.close();
    }
}
