import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int queResult = 0;
        String[][] que = new String[3][5];
        que[0][0] = "В файл с каким расширением компилируется java-файл?";
        que[0][1] = "1. cs";
        que[0][2] = "2. java";
        que[0][3] = "3. class";
        que[0][4] = "4. exe";
        que[1][0] = "С помощью какой команды git можно получить полную копию удаленного репозитория?";
        que[1][1] = "1. commit";
        que[1][2] = "2. push";
        que[1][3] = "3. clone";
        que[1][4] = "4. copy";
        que[2][0] = "Какой применяется цикл, когда неизвестно кол-во итераций?";
        que[2][1] = "1. while";
        que[2][2] = "2. for";
        que[2][3] = "3. loop";
        que[2][4] = "4. other";

        int correctAnswersCounter = printQueAndCheckAns(que, queResult);
        System.out.println("Тест завершён! \nРезультат: Правильно - " + correctAnswersCounter + ". Неправильно - " + (3 - correctAnswersCounter));
    }

    public static Integer printQueAndCheckAns(String[][] que, int queResult) {
        Integer[] correctAnsArr = new Integer[3];
        correctAnsArr[0] = 3;
        correctAnsArr[1] = 3;
        correctAnsArr[2] = 1;
        int g = 0;
        for (String[] strings : que) {
            for (String string : strings) {
                System.out.print(string + " \n");
            }
            if (checkAnswer(correctAnsArr[g])) {
                ++queResult;
            }
            ++g;
        }
        return queResult;
    }

    public static Boolean checkAnswer(int correctAnswer){
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == correctAnswer) {
            System.out.println("Правильно!");
            return true;
        }
        else {
            System.out.println("Неправильно!");
            return false;
        }
    }
}
