import java.util.Scanner;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Вхідні дані дійсного типу, результат – дійсного");
        System.out.print("n=");
        float n = in.nextFloat();
        System.out.print("m=");
        float m = in.nextFloat();
        float y=(n+1)/(n*n*m+2)+(m+n)/(m-n)+n*n*n;
        System.out.println("y=" + y);

        System.out.println("Вхідні дані цілого типу, результат – дійсного");
        System.out.print("n=");
        int N = in.nextInt();
        System.out.print("m=");
        int M = in.nextInt();
        float y2=(N+1)/(N*N*M+2)+(M+N)/(M-N)+N*N*N;
        System.out.println("y=" + y2);

        System.out.println("Вхідні дані дійсного типу, результат – цілого");
        System.out.print("n=");
        double Nn = in.nextDouble();
        System.out.print("m=");
        double Mm = in.nextDouble();
        int y3 = (int)((Nn+1)/(Nn*Nn*Mm+2)+(Mm+Nn)/(Mm-Nn)+Nn*Nn*Nn);
        System.out.println("y=" + y3);
    }
}

