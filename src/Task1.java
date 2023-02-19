import java.util.Scanner;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Вхідні дані дійсного типу, результат – дійсного");
        float n = 0, m = 0;
        while(  n == m || n*n*m+2 == 0 ){
            System.out.println("Введіть числа:");
            System.out.print("n=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            n = in.nextFloat();
            System.out.print("m=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            m = in.nextFloat();
        }
        float y=(n+1)/(n*n*m+2)+(m+n)/(m-n)+n*n*n;
        System.out.println("y=" + y);

        System.out.println("Вхідні дані цілого типу, результат – дійсного");
        int N = 0, M = 0;
        while( N == M || N*N*M+2 == 0 ) {
            System.out.println("Введіть числа:");
            System.out.print("n=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            N = in.nextInt();
            System.out.print("m=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            M = in.nextInt();
        }
        float y2=(N+1)/(N*N*M+2)+(M+N)/(M-N)+N*N*N;
        System.out.println("y=" + y2);

        System.out.println("Вхідні дані дійсного типу, результат – цілого");
        double Nn = 0, Mm = 0;
        while ( Nn == Mm || Nn*Nn*Mm+2 == 0 ) {
            System.out.println("Введіть числа:");
            System.out.print("n=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            Nn = in.nextDouble();
            System.out.print("m=");
            while(!in.hasNextFloat()) {
                in.next();
                System.out.println("Тільки числа!");
            }
            Mm = in.nextDouble();
        }
        int y3 = (int)((Nn+1)/(Nn*Nn*Mm+2)+(Mm+Nn)/(Mm-Nn)+Nn*Nn*Nn);
        System.out.println("y=" + y3);
    }
}

