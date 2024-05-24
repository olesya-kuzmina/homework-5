import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание №5: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split("[\\s:]+");
        int count = 0;
        System.out.println("Слова с четным количеством букв: ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word + " ");
                count++;
            }
        }
        System.out.println("");
        System.out.print("Количество строк с четным количеством букв: " + count);
    }
}
