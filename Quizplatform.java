import java.util.Scanner;

public class Quizplatform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Platform!");

        int score = 0;
        int totalQuestions = 3; // Adjust the number of questions as needed

        // Question 1
System.out.println("\nQuestion 1: What is Closest Planet to sun?");
System.out.println("a) Earth\nb) Jupiter \nc) Mercury \nd) Saturn");
System.out.println("Enter Your answer:");
String answer1 = scanner.nextLine().trim().toLowerCase();

if (answer1.equals("c")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Incorrect. The correct answer is c)");
}

// Question 2
System.out.println("\nQuestion 2: What Galaxy does the eath in?");
System.out.println("a) Blackeye Galaxy \nb) Backward Galaxy \nc) Milkyway galaxy");
System.out.println("Enter Your answer:");
String answer2 = scanner.nextLine().trim().toLowerCase();

if (answer2.equals("c")) {
    System.out.println("Correct!");
    score++;
} else {
    System.out.println("Incorrect. The correct answer is c");
}


// Question 3
System.out.println("\nQuestion 3: How many continents are there?");
System.out.println("a) 5\nb) 6\nc) 7\nd) 8");
System.out.println("Enter Your answer:");
String answer3 = scanner.nextLine().trim().toLowerCase();

    if (answer3.equals("c")) {
        System.out.println("Correct!");
        score++;
    } else {
         System.out.println("Incorrect. The correct answer is c) 7");
        }

// Display final score
System.out.println("\nQuiz completed!");
System.out.println("Your score: " + score + "/" + totalQuestions);

    scanner.close();
    }
}
