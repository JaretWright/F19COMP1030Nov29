import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
    {
        String continueAsking = "y";
        ArrayList<Double> grades = new ArrayList<>();

        do{
            System.out.printf("Enter a grade: ");
            Scanner keyboard = new Scanner(System.in);
            grades.add(keyboard.nextDouble());
            System.out.println(grades);

            keyboard.nextLine();
            System.out.printf("Enter 'y' to continue adding grades:");
            continueAsking=keyboard.nextLine();
        } while (continueAsking.equalsIgnoreCase("y"));

        System.out.printf("The average grade is %.1f%% %n", avg(grades));
    }

    public static double avg(ArrayList<Double> grades)
    {
        double sum = 0;
        for (Double grade: grades)
            sum+=grade;
        return sum/grades.size();
    }
}
