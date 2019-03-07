
/**
 * Take input about month  and find days in month.
 *
 * @author (Ryan Kim)
 * @version (3-4-19)
 */
import java.util.Scanner;
public class DaysInMonth
{
    public static void main(String[] args) {
        //Print programmer information
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Course:     COSC 111, Winter 2019");
        System.out.println("Lab#:       4, part 2");
        System.out.println("Due date:   4-4-2019\n");
        
        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int userInput = sc.nextInt();
        
        //Switch statement to find month and print days in that month
        switch(userInput) {
            case 1:
                System.out.println("There are 31 days in January");
                break;
            case 2:
                System.out.println("There are 28 days in February");
                break;
            case 3:
                System.out.println("There are 31 days in March");
                break;
            case 4:
                System.out.println("There are 30 days in April");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 30 days in June");
                break;
            case 7:
                System.out.println("There are 31 days in July");
                break;
            case 8:
                System.out.println("There are 31 days in August");
                break;
            case 9:
                System.out.println("There are 30 days in September");
                break;
            case 10:
                System.out.println("There are 31 days in October");
                break;
            case 11:
                System.out.println("There are 30 days in November");
                break;
            case 12:
                System.out.println("There are 31 days in December");
                break;
            default:
                System.out.println("Invalid input, TRY AGAIN!");
        }
    }
}
/*
Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part 2
Due date:   4-4-2019

Enter a month (1-12): 6
There are 30 days in June

Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part 2
Due date:   4-4-2019

Enter a month (1-12): 20
Invalid input, TRY AGAIN!

Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part 2
Due date:   4-4-2019

Enter a month (1-12): 12
There are 31 days in December
 */