import java.util.Scanner;

public class code {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println();
        System.out.println("-------- 🎉 WELCOME TO MY QUIZ GAME! 🎉 ----------");

        System.out.println();
        System.out.print("Enter your name : \n");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Hello " + name + "! Let's get started.");
        System.out.println();

        while (playAgain) {
            System.out.println("\nChoose your Quiz Category:");
            System.out.println("1. Java Questions");
            System.out.println("2. General Knowledge");
            System.out.println("3. Cricket");

            System.out.print("Enter choice (1/2/3): ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();

            String[] selectedQuestions = {};
            String[][] selectedOptions = {};
            char[] selectedAnswers = {};

            switch (categoryChoice) {
                case 1:
                    selectedQuestions = new String[]{
                            "1. Which keyword is used to define a class in Java?",
                            "2. Which data type is used to store true/false values in Java?",
                            "3. Who invented Java?",
                            "4. What is JVM in Java?",
                            "5. Which package contains the Scanner class in Java?"
                    };

                    selectedOptions = new String[][]{
                            {"A) object", "B) define", "C) new", "D) class"},
                            {"A) char", "B) int", "C) boolean", "D) float"},
                            {"A) James Gosling", "B) Dennis Ritchie", "C) Guido van Rossum", "D) Bjarne Stroustrup"},
                            {"A) Java Visual Machine", "B) Java Virtual Method", "C) Java Virtual Machine", "D) Java Verified Mode"},
                            {"A) java.io", "B) java.util", "C) java.net", "D) java.lang"}
                    };

                    selectedAnswers = new char[]{'D', 'C', 'A', 'C', 'B'};
                    break;

                case 2:
                    selectedQuestions = new String[]{
                            "1. What is the capital of India?",
                            "2. Who invented the World Wide Web?",
                            "3. Which planet is known as the Red Planet?",
                            "4. Which country is known as the Land of Rising Sun?",
                            "5. Which mountain is the tallest in the world?"
                    };

                    selectedOptions = new String[][]{
                            {"A) Karnataka", "B) Mumbai", "C) Delhi", "D) Bengaluru"},
                            {"A) Bill Gates", "B) Tim Berners-Lee", "C) Steve Jobs", "D) Elon Musk"},
                            {"A) Earth", "B) Venus", "C) Mars", "D) Jupiter"},
                            {"A) Japan", "B) South Korea", "C) China", "D) Thailand"},
                            {"A) Mount Kilimanjaro", "B) Mount Everest", "C) Mount Elbrus", "D) Mount Fuji"}
                    };

                    selectedAnswers = new char[]{'C', 'B', 'C', 'A', 'B'};
                    break;

                case 3:
                    selectedQuestions = new String[]{
                            "1. Who is known as the 'God of Cricket'?",
                            "2. Which team won the IPL 2023 trophy?",
                            "3. Who has scored the most international centuries?",
                            "4. What is the maximum number of overs per bowler in an ODI match?",
                            "5. Which Indian cricketer is known as 'Captain Cool'?"
                    };

                    selectedOptions = new String[][]{
                            {"A) MS Dhoni", "B) Sachin Tendulkar", "C) Virat Kohli", "D) Sunil Gavaskar"},
                            {"A) Mumbai Indians", "B) Kolkata Knight Riders", "C) Chennai Super Kings", "D) Gujarat Titans"},
                            {"A) Ricky Ponting", "B) Virat Kohli", "C) Kumar Sangakkara", "D) Sachin Tendulkar"},
                            {"A) 8", "B) 10", "C) 12", "D) 15"},
                            {"A) Rohit Sharma", "B) KL Rahul", "C) MS Dhoni", "D) Yuvraj Singh"}
                    };

                    selectedAnswers = new char[]{'B', 'C', 'D', 'B', 'C'};
                    break;

                default:
                    System.out.println("Invalid category. Try again...");
                    continue;
            }

            System.out.println("\nLet's Begin the Quiz, " + name + "! 🎮\n");

            int score = 0;

            for (int i = 0; i < selectedQuestions.length; i++) {
                System.out.println("--------------------------------------------------");
                System.out.println("QUESTION - " + (i + 1));
                System.out.println(selectedQuestions[i]);

                for (String option : selectedOptions[i]) {
                    System.out.println(option);
                }

                char userAnswer;
                boolean validInput = false;

                while (!validInput) {
                    System.out.print("Your answer (A/B/C/D): ");
                    userAnswer = scanner.next().toUpperCase().charAt(0);

                    if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                        validInput = true;

                        if (userAnswer == selectedAnswers[i]) {
                            System.out.println("CORRECT ANSWER! ✅");
                            score++;
                            System.out.println();
                        }

                        else {
                            System.out.println("WRONG ANSWER! ❌");
                            System.out.println("The Correct Answer is: " + selectedAnswers[i]);
                            System.out.println();
                        }
                    }

                    else {
                        System.out.println("Invalid input! Please enter A, B, C, or D.");
                    }
                }

                if (i < selectedQuestions.length - 1) {
                    System.out.print("Type 'next' to move to the next question: ");
                    String next = scanner.next().toLowerCase();

                    while (!next.equals("next")) {
                        System.out.print("Invalid input! Please type 'next': ");
                        next = scanner.next().toLowerCase();
                    }
                    System.out.println();
                }
            }

            System.out.println("\nCalculating your results...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\nAnalyzing your answers...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\nPreparing your final report...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println();


            int percentage = (score * 100) / selectedQuestions.length;

            System.out.println("----------------------------- QUIZ RESULTS -------------------------------------");

            if (percentage >= 90) {
                System.out.println("Congratulations! You have passed the Quiz Game 🥳");
                System.out.println();
                System.out.println("Outstanding Work! " + name + " 👍");
                System.out.println("You got " + score + " out of " + selectedQuestions.length + " correct.");
            }

            else if (percentage >= 70) {
                System.out.println("Congratulations! You have passed the Quiz Game 🥳");
                System.out.println();
                System.out.println("Very Good! " + name + " 👍");
                System.out.println("You got " + score + " out of " + selectedQuestions.length + " correct.");
            }

            else if (percentage >= 50) {
                System.out.println("Congratulations! You have passed the Quiz Game 🥳");
                System.out.println();
                System.out.println("Good Attempt! " + name + " 👍");
                System.out.println("You got " + score + " out of " + selectedQuestions.length + " correct.");
            }

            else {
                System.out.println("Sorry! You didn't pass the quiz Game 😔. Better luck next time!");
                System.out.println();
                System.out.println("Nice try! " + name + " 👍");
                System.out.println("You got " + score + " out of " + selectedQuestions.length + " correct.");
            }

            System.out.println("Your score: " + percentage + "%");
            System.out.println();
            System.out.println();

            String response;
            boolean validResponse = false;

            do {
                System.out.print("Do you want to play another category quiz? (yes/no): ");
                response = scanner.next().toLowerCase();

                if (response.equals("yes")) {
                    validResponse = true;
                }
                else if (response.equals("no")) {
                    playAgain = false;
                    validResponse = true;
                }
                else {
                    System.out.println("Invalid input! Please type 'yes' or 'no'.");
                }
            } while (!validResponse);

        }

        System.out.println();
        System.out.println("Thank you for playing the Quiz, " + name + "! 👋 See you again! ❤️");
        System.out.println("-------------------------------------------------------------------------------------");
        scanner.close();
    }
}