import java.util.*;
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 201;
        while(n > 200) {
            System.out.println("Введіть розмірність масиву (до 200):");
            n = in.nextInt();
        }

        int[] A, B;
        A = new int[n];
        B = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("A["+i+"]=");
            A[i] = in.nextInt();
        }

        System.out.println("Масив А:");
        for (int i : A) System.out.print(i + "\t");
        System.out.println();
        System.out.println("Array of repeats: ");
        for (int i = 0; i < A.length ; i++) {
            boolean repeat = false;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]){
                    repeat = true;
                }
            }
            if(repeat == true) {
                B[i] = A[i];
                System.out.print(B[i] + "\t");
            }
        }

       // ArrayList<Integer> Bb = new ArrayList<>();
//        for(int i = 0; i < A.length; i++){
//            for(int j = i + 1; j < A.length; j++){
//                if(A[i] == A[j]){
//                    System.out.println("Елементи, які повторюються:");
//                    System.out.print(A[i]);
//                    System.out.println();
//
//                    System.out.println("Масив В:");
//
//                    Bb.add(0, A[i]);
//                    System.out.print(Bb);
//                    System.out.println();
//                }
//            }
//        }
    }
}


