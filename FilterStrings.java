import java.util.Scanner;

public class FilterStrings {

    public static String[] filterShortStrings(String[] strings) {
        int count = 0;
        for (String string : strings) {
            if (string.length() <= 3) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (String string : strings) {
            if (string.length() <= 3) {
                result[index++] = string;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Можно ввести массив с клавиатуры
        // System.out.print("Введите количество строк: ");
        // int n = scanner.nextInt();
        // scanner.nextLine(); // Очистка буфера
        // String[] strings = new String[n];
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Введите строку " + (i + 1) + ": ");
        //     strings[i] = scanner.nextLine();
        // }

        // Или задать массив на старте программы
        String[] strings = {"abc", "defg", "hij", "klmno", "pqr", "st", "uvw", "xyz"};

        String[] newStrings = filterShortStrings(strings);
        System.out.println("Новый массив строк:");
        for (String string : newStrings) {
            System.out.println(string);
        }
    }
}