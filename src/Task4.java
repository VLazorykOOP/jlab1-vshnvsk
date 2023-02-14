import java.util.*;
public class Task4 {
    private static boolean symmetric(String str) {
        if (str.length() != str.length()) return false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");

        System.out.println("Симетричні слова:");
        for(int i = 0; i < words.length; i++){
            if(symmetric(words[i]))
                System.out.println(words[i]);
        }
        in.close();
    }
}
