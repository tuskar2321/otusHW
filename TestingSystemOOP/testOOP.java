package TSOOP;
import java.util.Scanner;

public class testOOP {
    public static void main(String[] args) {
        Question question1 = new Question("� ���� � ����� ����������� ������������� java-����?",
                "1. cs", "2. java", "3. class", "4. exe", 3);
        int counter = checkAnswer(question1);
        Question question2 = new Question("� ������� ����� ������� git ����� �������� ������ ����� ���������� �����������?",
                "1. commit", "2. push","3. clone","4. copy",3);
        counter += checkAnswer(question2);
        Question question3 = new Question("����� ����������� ����, ����� ���������� ���-�� ��������?",
                "1. while", "2. for","3. loop","4. other",1);
        counter += checkAnswer(question3);
        System.out.println("���� ��������! \n���������: ��������� - " + counter + ". ����������� - " + (Question.getQuestionCounter() - counter));
    }

    public static int checkAnswer(Question object){
        Scanner sc = new Scanner(System.in);
        int correctAnswer = object.getCorrectAnswer();
        int counter = 0;
        System.out.println(object);
        int answer = sc.nextInt();
        if (answer == correctAnswer) {
            System.out.println("���������!");
            ++counter;
        }
        else {
            System.out.println("�����������!");
        }
        return counter;
    }
}
