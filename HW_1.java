import java.util.Random;

public class HW_1 {


    public static void main(String[] args) {

        Random rand = new Random();
        int m1[] = new int[Short.MAX_VALUE / 2];
        int m2[] = new int[Math.abs(Short.MIN_VALUE) / 2];
        int array1 = 0;
        int array2 = 0;

        // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = rand.nextInt(2001);
        System.out.println(i);

        // Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int a = i;
        int n = 0;
        while (a != 1) {
            a >>= 1;
            n++;
        }
        System.out.println(n);


        // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
                for (int y = i; y <= Short.MAX_VALUE; y++) {
                    if (y % i == 0) {
                        m1[array1] = y;
                        array1++;
                    }
                }

        // Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
                for (int y = i; y <= Short.MIN_VALUE; y++) {
                    if (y % i != 0) {
                        m2[array2] = y;
                        array2++;
                    }
                }
            }
        }