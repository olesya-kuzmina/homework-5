import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Задание №9: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = scanner.nextLine();

        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replace("[^a-za-яё]","");
        str2 = str2.toLowerCase().replace("[^a-za-яё]","");
        char[] charAray1 = str1.toCharArray();
        char[] charAray2 = str2.toCharArray();
        Arrays.sort(charAray1);
        Arrays.sort(charAray2);
        return Arrays.equals(charAray1,charAray2);
    }
}
