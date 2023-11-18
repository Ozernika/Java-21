package task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListConverter {

    public static <T> List<T> convertToList(T[] inputArray) {
        List<T> resultList = new ArrayList<>();
        for (T item : inputArray) {
            resultList.add(item);
        }
        return resultList;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertToList(intArray);
        System.out.println("Входной массив: " + java.util.Arrays.toString(intArray));
        System.out.println("Результат конвертации: " + intList);
        System.out.println();

        String[] strArray = {"a", "b", "c", "d", "e"};
        List<String> strList = convertToList(strArray);
        System.out.println("Входной массив: " + java.util.Arrays.toString(strArray));
        System.out.println("Результат конвертации: " + strList);
    }
}
