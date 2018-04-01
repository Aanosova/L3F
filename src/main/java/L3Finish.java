import java.util.*;
import java.util.Scanner;

public class L3Finish {
    public static void main(String[] args) {
        Scanner Chooseone = new Scanner(System.in);
        System.out.println("Введите 1 чтобы открыть калькулятор");
        System.out.println("Введите 2 чтобы работать с массивом");
        int L3= Chooseone.nextInt();
        switch (L3){
            case 1:
                Scanner Lesson3 = new Scanner(System.in);
                // Создаем переменную Lesson3  с возможостью ввода данных в консоли System.in
                float one, two;
                /* cоздаем переменные для хранения введенных данных*/
                System.out.println("Введите первое дробное число:");
                /* cообщение о вводе первого значения*/
                one = Lesson3.nextFloat();
                /*Ввод значения с клавиатуры с плавающей  точкой*/
                System.out.println("Введите второе дробное число:");
                two = Lesson3.nextFloat();
                System.out.println("Введите 1 чтобы сложить числа");
                System.out.println("Введите 2 чтобы из первого числа вычесть второе");
                System.out.println("Введите 3 чтобы разделить первое число на второе");
                System.out.println("Введите 4 чтобы перемножить числа");
                int rt= Lesson3.nextInt();
                switch (rt){
                    case 1:
                        float a = one + two;
                        System.out.printf("Cумма чисел равна: %.2f",a);
                        break;
                    case 2:
                        float b = one - two;
                        System.out.printf("Разность 1 и 2 числа равна:%.2f", b);
                        break;
                    case 3:
                        float c = one / two;
                        System.out.printf("Деление 1 числа на 2: %.2f", c);
                        break;
                    case 4:
                        float d = one * two;
                        System.out.printf("Умножение чисел равно: %.2f", d);
                        break;
                }

                break;
            case 2:
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        String array[] = new String[size]; // Создаём массив String размером в size
        System.out.println("Введите слова:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.next(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Выводим наш массив:");

        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        //Вывод самого длинного слова в массиве
        int maxLengthString = 0;
        for(int i=0;i<array.length;i++){
            if(array[i].length()>maxLengthString){
                maxLengthString = array[i].length();
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i].length()==maxLengthString)
            {
                System.out.println("Самое длинное слово: " + array[i]);
            }
        }
        break;
        }
    }
}