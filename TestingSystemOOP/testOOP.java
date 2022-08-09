package TSOOP;
import java.util.Scanner;

public class testOOP {
    public static void main(String[] args) {
        Question question1 = new Question("В файл с каким расширением компилируется java-файл?", 3,
                "1. cs", "2. java", "3. class", "4. exe");
        int counter = checkAnswer(question1);
        Question question2 = new Question("С помощью какой команды git можно получить полную копию удаленного репозитория?",3,
                "1. commit", "2. push","3. clone");
        counter += checkAnswer(question2);
        Question question3 = new Question("Какой применяется цикл, когда неизвестно кол-во итераций?",1,
                "1. while", "2. for");
        counter += checkAnswer(question3);
        System.out.println("Тест завершён! \nРезультат: Правильно - " + counter + ". Неправильно - " + (Question.getQuestionCounter() - counter));
    }

    public static int checkAnswer(Question object){
        Scanner sc = new Scanner(System.in);
        int correctAnswer = object.getCorrectAnswer();
        int counter = 0;
        System.out.println(object);
        int answer = sc.nextInt();
        if (answer == correctAnswer) {
            System.out.println("Правильно!");
            ++counter;
        }
        else {
            System.out.println("Неправильно!");
        }
        return counter;
    }
}
