
/**
 * Takes three grades, averages them, and finds letter grade.
 *
 * @author (Ryan Kim)
 * @version (3-4-19)
 */
import java.util.Scanner;
public class GradeReport
{
    public static void main(String[] args) {
        //Print programmer information
        System.out.println("Programmer: Ryan Kim");
        System.out.println("Course:     COSC 111, Winter 2019");
        System.out.println("Lab#:       4, part #1");
        System.out.println("Due date:   3-4-19\n");
        
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three test scores: ");
        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        //find average and display
        double average = (x + y + z) / 3.0;
        System.out.println("\nGrade Report:");
        System.out.println("\tThree test scores:    " + x + " " + y + " " + z);
        System.out.printf("\tAverage test score:   %.1f\n", average);
        
        // Find letter grade and display
        if (average < 59) {
            System.out.println("\tLetter grade:         F");
        }
        else if (average < 69) {
            System.out.println("\tLetter grade:         D");
        }
        else if (average < 79) {
            System.out.println("\tLetter grade:         C");
        }
        else if (average < 89) {
            System.out.println("\tLetter grade:         B");
        }
        else if (average < 100) {
            System.out.println("\tLetter grade:         A");
        }
    }
}
/*
Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part #1
Due date:   3-4-19

Enter three test scores: 95 95 95

Grade Report:
	Three test scores:    95 95 95
	Average test score:   95.0
	Letter grade:         A

Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part #1
Due date:   3-4-19

Enter three test scores: 50 25 49

Grade Report:
	Three test scores:    50 25 49
	Average test score:   41.3
	Letter grade:         F

Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part #1
Due date:   3-4-19

Enter three test scores: 80 93 70

Grade Report:
	Three test scores:    80 93 70
	Average test score:   81.0
	Letter grade:         B

Programmer: Ryan Kim
Course:     COSC 111, Winter 2019
Lab#:       4, part #1
Due date:   3-4-19

Enter three test scores: 70 60 63

Grade Report:
	Three test scores:    70 60 63
	Average test score:   64.3
	Letter grade:         D
 */