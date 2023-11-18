package task2_3;

import java.util.Arrays;

public class MyArray<T> {
    private T[] array;

    public MyArray(int size) {
        array = (T[]) new Object[size];
    }

    public void setElement(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Недопустимый индекс");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Недопустимый индекс");
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        // Пример использования:
        MyArray<Integer> intContainer = new MyArray<>(4);
        intContainer.setElement(0, 1);
        intContainer.setElement(1, 2);
        intContainer.setElement(2, 3);
        intContainer.setElement(3, 4);
        System.out.println("Пример массива, хранящего начения типа int: ");
        intContainer.printArray();
        System.out.println("Элемент с индексом 1: " + intContainer.getElement(1));
        System.out.println();

        MyArray<Double> doubleContainer = new MyArray<>(3);
        doubleContainer.setElement(0, 5.8);
        doubleContainer.setElement(1, 3.9);
        doubleContainer.setElement(2, 0.5);
        System.out.println("Пример массива, хранящего начения типа double: ");
        doubleContainer.printArray();
    }
}
