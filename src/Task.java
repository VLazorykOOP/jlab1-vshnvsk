import java.util.*;
public class Task {
    private static void swapColumns(int[][] A, int i, int j) {
        for(int k = 0; k < A.length; k++) {
            int temp = A[k][i];
            A[k][i] = A[k][j];
            A[k][j] = temp;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 21;
        while(n > 20){
            System.out.println("Введіть розмірність матриці (до 20):");
            while(!in.hasNextInt()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            n = in.nextInt();
            if(n < 0){
                System.out.println("Не можна від'ємні!!!");
                n = 21;
            }
        }

        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                while(!in.hasNextFloat()) {
                    in.next();
                    System.out.println("Тільки числа!");
                }
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("Матриця А:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Максимальний елемент матриці:");
        int max = A[0][0];
        int maxInd = 0, maxInd2 = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                    maxInd = i;
                    maxInd2 = j;
                }
            }
        }

        System.out.println("A[" + maxInd + "][" + maxInd2 + "] = " + max);


        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (maxInd == i) {
                    int[] tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
                if (maxInd2 == j) {
                    swapColumns(A, i, j);
                }
            }
        }

        System.out.println("Результат:");
        for (int[] i : A) {
            for (int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
    }
}