package task4;

import java.io.File;
import java.util.Scanner;

public class DirectoryListing {

    public static String[] listDirectoryContents(String directoryPath) {
        try {
            File directory = new File(directoryPath);
            // Получаем список файлов и подкаталогов в указанном каталоге
            String[] contents = directory.list();

            // Выводим первые 5 элементов списка
            System.out.println("Первые 5 элементов каталога:");
            if (contents != null) {
                for (int i = 0; i < Math.min(5, contents.length); i++) {
                    System.out.println(contents[i]);
                }
            }

            return contents;
        } catch (Exception e) {
            System.out.println("Ошибка при получении содержимого каталога: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к каталогу: ");
        String directoryPath = scanner.nextLine();
        String[] directoryContents = listDirectoryContents(directoryPath);
        scanner.close();
    }
}
