import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание № 11: "); // метод
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        boolean isMumbaYumba = checkMumbaYumba(word);
        if (isMumbaYumba) {
            System.out.println("Слово принадлежит языку Мумба-Юмба");
        } else {
            System.out.println("Слово не принадлежит языку Мумба-Юмба");
        }
    }
    public static boolean checkMumbaYumba(String word) {
        if (word.contains("bb")) {
            return false;
        }
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == word.charAt(i + 1) && word.charAt(i) == word.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}