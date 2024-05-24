import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String proposal = scanner.nextLine();
        String[] slova = proposal.split(" ");
        int obdl = 0;
        for (String word : slova) {
            obdl += word.length();
        } double sreddl = (double) obdl / slova.length;
        System.out.println("Средняя длина слова: " + sreddl);
    }
}
