import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        int savedArg;
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add((int) (Math.random() * 10));
            System.out.print(numberList.get(i) + " ");
        }
        System.out.print("\n");
        ArrayList<Integer> secondList = new ArrayList<>(numberList);

        long start = System.nanoTime();
        for (int j : numberList){
            for (int i = (numberList.size() - 1); i >= 0; i--) {
                if ((i != 0) && (numberList.get(i) < numberList.get(i - 1))) {
                    savedArg = numberList.get(i - 1);
                    numberList.set(i - 1, numberList.get(i));
                    numberList.set(i, savedArg);
                }
            }
        }
        long finalTime = System.nanoTime() - start;
        printArrList(numberList, finalTime);

        start = System.nanoTime();
        Collections.sort(secondList);
        finalTime = System.nanoTime() - start;
        printArrList(secondList,finalTime);
    }
    static void printArrList(ArrayList<Integer> list, long time) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.print("затрачено времени - " + time + "\n");
    }
}
