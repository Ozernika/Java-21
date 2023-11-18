package task5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution<T, K, V> {
    private T genericVariable;
    private K keyVariable;
    private V valueVariable;

    public Solution(T genericVariable, K keyVariable, V valueVariable) {
        this.genericVariable = genericVariable;
        this.keyVariable = keyVariable;
        this.valueVariable = valueVariable;
    }

    public T getGenericVariable() {
        return genericVariable;
    }

    public K getKeyVariable() {
        return keyVariable;
    }

    public V getValueVariable() {
        return valueVariable;
    }

    public <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Массивы ключей и значений должны иметь одинаковую длину");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {

        Solution<String, Integer, Double> solution = new Solution<>("GenericString", 42, 3.14);

        List<Integer> integerList = solution.newArrayList(1, 2, 3, 4, 5);
        System.out.println("Тестирование метода newArrayList с типом int: " + integerList);

        List<Double> doubleList = solution.newArrayList(1.7, 2.4, 3.8, 4.1, 5.9);
        System.out.println("Тестирование метода newArrayList с типом double: " + doubleList);
        System.out.println();

        HashSet<String> stringSet = solution.newHashSet("one", "two", "three");
        System.out.println("Тестирование метода newHashSet с типом string: " + stringSet);

        HashSet<Double> doubleSet = solution.newHashSet(1.2, 2.6, 3.7, 4.2);
        System.out.println("Тестирование метода newHashSet с типом double: " + doubleSet);

        Integer[] keys = {1, 2, 3};
        Double[] values = {1.1, 2.2, 3.3};
        HashMap<Integer, Double> hashMap = solution.newHashMap(keys, values);
        System.out.println("Хэш-таблица (ключ=значение): " + hashMap);
    }
}
