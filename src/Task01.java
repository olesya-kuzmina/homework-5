import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку текста: ");
        String text = scanner.nextLine();
        System.out.print("Введите символ: ");
        char symbol = scanner.nextLine().charAt(0);

        int count = 0;
        System.out.print("Индексы вхождений символа: ");
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == symbol){
                System.out.print(i + " ");
                count++;
            }
        }
if (count > 0) {
    System.out.println("\nКоличество совпадений: " + count);
}else {
    System.out.println("\nСопадений не найдено");
}
    }
}
