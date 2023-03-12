import java.util.HashMap;

// 1. Создать множество, ключь и значение строки.
// 2. Добавить шесть элементов.
// 3. Вывести в консоль значения.
// 4. Добавить ко всем значениям символ "!"
// 5. Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
// 6. Объеденить значания во втором множестве и первом если ключи совпадают.
// 7. Вывести результат в консоль.

public class HW_5 {
    public static void main(String[] args) {
        //task_1
        HashMap<String, String> hm = new HashMap<>();

        //task_2
        hm.put("Первый", "Майкл");
        hm.put("Второй", "Дуайт");
        hm.put("Третий", "Джим");
        hm.put("Четвертый", "Пэм");
        hm.put("Пятый", "Стэнли");
        hm.put("Шестой", "Анджела");

        //task_3
        hm.forEach((k, v) -> System.out.println(v));
        System.out.println();

        //task_4
        for (String key : hm.keySet()) {
            hm.compute(key, (k, v) ->  v + "!");
        }
        hm.forEach((k, v) -> System.out.println(v));
        System.out.println();

        //task_5
        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("Первый", "Скотт");
        hm2.put("Второй", "Шрут");
        hm2.put("Третий3", "Халперт");
        hm2.put("Четвертый", "Бисли");
        hm2.put("Пятый5", "Хадсон");
        hm2.put("Шестой", "Мартин");


        //task_6
        for (String k : hm2.keySet()) {
            hm2.merge(k,hm.getOrDefault(k,""), String::concat);
        }

        //task_7
        for (String k : hm2.keySet()) {
            System.out.println(k + " " + hm2.get(k));
        }
    }
}