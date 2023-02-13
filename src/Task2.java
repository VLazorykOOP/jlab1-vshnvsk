import java.util.*;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть розмірність масиву:");
        int n = in.nextInt();

        int[] A;
        A = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("A["+i+"]=");
            A[i] = in.nextInt();
        }

        System.out.println("Масив А:");
        for (int i : A) System.out.print(i + " ");
        System.out.println();

        ArrayList<Integer> Bb = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            for(int j = i +1; j < A.length; j++){
                if(A[i] == A[j]){
                    System.out.println("Елементи, які повторюються:");
                    System.out.print(A[i]);
                    System.out.println();

                    System.out.println("Масив В:");
                    Bb.add(0, A[i]);
                    System.out.print(Bb);
                    System.out.println();
                }
            }
        }
        //System.out.println("Масив B:");
        //System.arraycopy(A, 0, B, 0, n);
        //for (int i : B) System.out.print(i + " ");
    }
}


