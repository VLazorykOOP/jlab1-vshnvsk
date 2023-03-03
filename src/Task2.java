import java.sql.SQLOutput;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 201;
        while (n > 200) {
            System.out.println("Введіть розмірність масиву (до 200):");
            while (!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            n = in.nextInt();
            if (n <= 0) {
                System.out.println("Не можна від'ємні і 0!!!");
                n = 201;
            }
        }

        int[] A;
        A = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]=");
            while (!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            A[i] = in.nextInt();
        }

        System.out.println("Масив А:");
        for (int i : A) System.out.print(i + "\t");
        System.out.println();

        int maxValue = A[0];
        for (int i = 0; i < n; i++) {
            if (maxValue < A[i]) {
                maxValue = A[i];
            }
        }

        System.out.println("Кількість повторів числа:");
        int[] count = new int[maxValue + 1];
        for (int i = 0; i < n; i++) {
            count[A[i]]++;
            System.out.println(count[A[i]]);
        }

        int count2 = 0;
        int single = 0;
        for (int i = 0; i < maxValue + 1; i++) {
            if (count[i] >= 2) {
                count2 += count[i];
                single++;
            }
        }

        int[] repeats = new int[single];

        int temp = 0;
        int j = 0;
        for (int i = 0; i < maxValue + 1; i++) {
            if (count[i] >= 2) {
                temp = i;
                repeats[j] = temp;
                j++;
            }
        }

        System.out.print("Масив без повторів: ");
        for (int i = 0; i < single-1; i++) {
            System.out.print(repeats[i]);
        }
        System.out.print(repeats[single-1]);
    }
}