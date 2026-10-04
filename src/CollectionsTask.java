import java.util.*;

public class CollectionsTask {

    public static void main(String[] args) {

        Random random = new Random();

        // 1. Массив из 10 случайных чисел
        Integer[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        System.out.println("1. Исходный массив:");
        System.out.println(Arrays.toString(numbers));

        // 2. Преобразуем массив в список
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        System.out.println("\n2. Список:");
        System.out.println(list);

        // Сохраняем исходный список
        List<Integer> originalList = new ArrayList<>(list);

        // 3. Сортировка по возрастанию
        Collections.sort(list);

        System.out.println("\n3. По возрастанию:");
        System.out.println(list);

        // 4. Сортировка в обратном порядке
        Collections.reverse(list);

        System.out.println("\n4. В обратном порядке:");
        System.out.println(list);

        // 5. Перемешивание
        Collections.shuffle(list);

        System.out.println("\n5. Перемешанный список:");
        System.out.println(list);

        // 6. Циклический сдвиг
        Collections.rotate(list, 1);

        System.out.println("\n6. Циклический сдвиг на 1:");
        System.out.println(list);

        // 7. Уникальные элементы
        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println("\n7. Уникальные элементы:");
        System.out.println(list);

        // 8. Дублирующиеся элементы
        List<Integer> duplicates = new ArrayList<>();

        for (Integer number : originalList) {
            if (Collections.frequency(originalList, number) > 1
                    && !duplicates.contains(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("\n8. Дублирующиеся элементы:");
        System.out.println(duplicates);

        // 9. Преобразуем список обратно в массив
        Integer[] resultArray = list.toArray(new Integer[0]);

        System.out.println("\n9. Массив из списка:");
        System.out.println(Arrays.toString(resultArray));

        // 10. Количество вхождений
        System.out.println("\n10. Количество вхождений:");

        Set<Integer> countedNumbers = new LinkedHashSet<>(originalList);

	for (Integer number : countedNumbers) {
    		System.out.println(
            		number + " -> "
            		+ Collections.frequency(originalList, number)
    		);
	}
    }
}