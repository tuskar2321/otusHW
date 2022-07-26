import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        printResult(result);
    }

    public static Integer printQue1(int queResult){
        int correctAnswer = 3;
        String[] que = new String[5];
        que[0] = "В файл с каким расширением компилируется java-файл?";
        que[1] = "cs";
        que[2] = "java";
        que[3] = "class";
        que[4] = "exe";
        printQue(que);
        if (checkAnswer(correctAnswer)) {
            return ++queResult;
        }
        else {
            return queResult;
        }
    }

    public static Integer printQue2(int queResult){
        int correctAnswer = 3;
        String[] que = new String[5];
        que[0] = "С помощью какой команды git можно получить полную копию удаленного репозитория?";
        que[1] = "commit";
        que[2] = "push";
        que[3] = "clone";
        que[4] = "copy";
        printQue(que);
        if (checkAnswer(correctAnswer)) {
            return ++queResult;
        }
        else {
            return queResult;
        }
    }

    public static Integer printQue3(int queResult){
        int correctAnswer = 1;
        String[] que = new String[4];
        que[0] = "Какой применяется цикл, когда неизвестно кол-во итераций?";
        que[1] = "while";
        que[2] = "for";
        que[3] = "loop";
        printQue(que);
        if (checkAnswer(correctAnswer)) {
            return ++queResult;
        }
        else {
            return queResult;
        }
    }

    public static void printQue(String[] que){
        for (String i:que){
            System.out.println(i);
        }
    }

    public static Boolean checkAnswer(int correctAnswer){
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
            if (answer == correctAnswer) {
                System.out.println("Correct!");
                return true;
            }
            else {
                System.out.println("Wrong!");
                return false;
            }
        }

    public static void printResult(int result){
        result = printQue1(result);
        result = printQue2(result);
        result = printQue3(result);
        System.out.println("Тест завершён! \nРезультат: Правильно - " + result + ". Неправильно - " + (3 - result));
    }
    }