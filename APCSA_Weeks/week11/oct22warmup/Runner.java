public class Runner {

    public static void main(String[] args) {

        // instantiate an object of type QuizPractice
        QuizPractice quiz = new QuizPractice();

        // declare argument variable and assign it a value of ten
        int argument = 10;

        // declare factorial variable and assign it the value of quiz.factorial, with a parameter of "argument"
        int factorial = quiz.factorial(argument);
        System.out.println("The factorial of " + argument + " is " + factorial);

        // calling quiz.countUpBy5(); twice with two different parameters
        quiz.countUpBy5(50);
        quiz.countUpBy5(68);
    }
}