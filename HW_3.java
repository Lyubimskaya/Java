
import java.util.*;
import java.util.stream.Collectors;

public class HW_3 {
    public static void main(String[] args) {

        // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.

        List<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Grey");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println("Задание 1: " + colors);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа "!".

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("Задание 2: " + colors);

        // 3. Вставить элемент в список в первой позиции.

        colors.add(0, "Orange");
        System.out.println("Задание 3: " + colors);

        // 4. Извлечь элемент (по указанному индексу (2)) из заданного списка.

        System.out.println("Задание 4: " + colors.get(2));

        // 5. Обновить определенный элемент списка по заданному индексу (2).

        colors.set(2, "Brown");
        System.out.println("Задание 5: " + colors);

        // 6. Удалить третий элемент из списка.

        colors.remove(3);
        System.out.println("Задание 6: " + colors);

        // 7. Поиска элемента в списке по строке.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи название цвета по английски и с большой буквы (например: Pink): ");
        String findColor = new String(scanner.nextLine());

        List<String> resElem = colors.stream()
                .filter(color -> color.contains(findColor))
                .collect(Collectors.toList());
        if (resElem.size() > 0) {
            System.out.println("Задание 7: " + "Element: " + resElem);
        } else System.out.println("Задание 7: " + "Такого элемента нет");

        // 8. Создать новый список и добавить в него несколько елементов первого списка.

        List<String> newList = new ArrayList<>();
        newList.add("Orange");
        newList.add("Pink!");
        newList.add("White");
        System.out.println("Задание 8: " + newList);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.

        colors.removeAll(newList);
        System.out.println("Задание 9: " + colors);

        // 10. *Сортировка списка.

        Collections.sort(colors);
        System.out.println("Задание 10: " + colors);

    }

}