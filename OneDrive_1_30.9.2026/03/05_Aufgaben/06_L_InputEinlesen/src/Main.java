import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "myScanner".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.

        // Creating a scanner object
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello and nice to meet you here!");
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();

        System.out.println("Thank you! What is your last name?");
        String lastName = userInput.nextLine();

        System.out.println("How old are you?");
        // Could also be byte, however, byte is only 128. People might get older
        // than 128 at some point
        short age = userInput.nextShort();

        System.out.println("On which day were you born? (Number please)");
        byte day = userInput.nextByte();

        System.out.println("On which month were you born? (Number please)");
        byte month = userInput.nextByte();

        System.out.println("What about the year? (Number please)");
        short year = userInput.nextShort();

        System.out.println("Are you a student/studying? (true or false)");
        boolean isStudent = userInput.nextBoolean();

        System.out.println("What is your favorite food?");
        // Previous methods still had a new line, which would be consumed instead of our answer
        // Therefore, we need to consume the new line first
        userInput.nextLine();
        String favoriteFood = userInput.nextLine();

        // Add more questions here

        // Instead of 2022, write the current year
        int daysLived = (2022 * 365 + 9 * 30) - (year * 365 + month * 30);

        System.out.println("Thank you for your input, " + firstName + " " + lastName + "!");
        System.out.println("You are " + age + " years old");
        System.out.println("You were born in " + day + "." + month + "." + year);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("Your favorite food is: " + favoriteFood);
        System.out.println("And so far you have lived approximately ~" + daysLived + " days!");

        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        System.out.println("We are going to do some math!\nPlease input two numbers.");
        System.out.print("Number 1: ");
        double number1 = userInput.nextDouble();
        System.out.print("Number 2: ");
        double number2 = userInput.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double division = number1 / number2;
        double multiplication = number1 * number2;
        System.out.println("Result of the addition: " + addition);
        System.out.println("Result of the subtraction: " + subtraction);
        System.out.println("Result of the division: " + division);
        System.out.println("Result of the multiplication: " + multiplication);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("Lets calculate your BMI!");
        System.out.print("Your weight in kg is:");
        float weight = userInput.nextFloat();
        System.out.println("Your height in meters is: (Example: 1.5)");
        float height = userInput.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.print("Enter the number of minutes to calculate into hours and minutes: ");
        int minutes = userInput.nextInt();
        int hours = minutes / 60; // Intentionally using int to cut of the floating point numbers here!
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " minutes is equal to " + hours + "h and " + remainingMinutes + "m");

        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        System.out.println("Lets calculate the circumference of a circle and an area");
        System.out.print("Enter the radius: ");
        double radius = userInput.nextDouble();
        double circumference = 2 * Math.PI * radius; // Or: 3.1415
        double area = Math.PI * radius * radius; // Or: 3.1415
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        System.out.println("Lets calculate the total bill amount with a tip(in %)?");
        System.out.print("Enter the bill amount: ");
        double billAmount = userInput.nextDouble();
        System.out.print("Enter the tip percentage: ");
        double tipPercentage = userInput.nextDouble();
        double tipAmount = billAmount * (tipPercentage / 100);
        double totalAmount = billAmount + tipAmount;
        System.out.println("Total bill: " + totalAmount);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        System.out.print("What hourly wage do you want (in CHF): ");
        int hourlyWage = userInput.nextInt();
        System.out.print("How many hours do you work a week? ");
        float hoursPerWeek = userInput.nextFloat();
        float monthlyWage = hourlyWage * hoursPerWeek * 4;
        float yearlySalary = monthlyWage * 12;
        System.out.println("Your monthly wage is: " + monthlyWage);
        System.out.println("Your yearly salary is: " + yearlySalary + ". (Excluding the 13th month)");

        //--------------------------------------------------------------------------------------------------------------
        // 8. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions.  Use a byte to store your result.
        userInput.nextLine(); // Consuming previous user input
        byte quizResult = 0;
        byte userQuizAnswer = 0;
        System.out.println("Hello and welcome to my quiz about game development!");

        System.out.println("Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures, terrain and much more?");
        userInput.nextLine();
        System.out.println("It is the perlin noise (texture). If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 02: What does FPS stand for in the context of game performance?");
        userInput.nextLine();
        System.out.println("FPS stands for Frames Per Second. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 03: What is the name of the algorithm commonly used for pathfinding?");
        userInput.nextLine();
        System.out.println("It's the A* or the A-star. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 04: What file format is commonly used for 3D models in game development?");
        userInput.nextLine();
        System.out.println("The common file format is .fbx. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 05: What is the name of the game engine developed by Epic Games?");
        userInput.nextLine();
        System.out.println("It's the Unreal Engine. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 06: What term describes games typically created by small teams or individuals without publisher funding?");
        userInput.nextLine();
        System.out.println("These are called indie games. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 07: What filter is often used to create a painterly effect in games, smoothing images while preserving edges?");
        userInput.nextLine();
        System.out.println("It's the Kuwahara filter. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 08: What does the acronym 'VFX' stand for in game development?");
        userInput.nextLine();
        System.out.println("VFX stands for Visual Effects. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 09: What is the name of the specialized program used in computer graphics to manipulate the appearance of 3D objects, often controlling aspects like lighting, shadows, and surface properties?");
        userInput.nextLine();
        System.out.println("The answer is shader. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;
        userInput.nextLine(); // Consuming previous user input

        System.out.println("Q 10: Last question! What does 'LOD' stand for?");
        userInput.nextLine();
        System.out.println("It stands for 'Level Of Detail'. If you were correct, write 1, else 0.");
        userQuizAnswer = userInput.nextByte();
        quizResult += userQuizAnswer;

        System.out.println("Now I'm calculating your points....");
        System.out.println("If you were honest, then you reached a total of " + quizResult + " points! Congrats!");


        // Make sure you didn't forget to close the scanner :)
        userInput.close();
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);