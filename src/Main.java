import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Задача 1: Четное или нечетное число
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
        System.out.print("Задача 1 Старт\n");

        System.out.print("Введите число: ");
        int a = in.nextInt();

        if(a % 2 == 0) System.out.print("Число четное\n");
        else System.out.print("Число нечётное\n");

        System.out.print("Задача 1 Конец\n\n");


//        Задача 2: Минимальное из трех чисел
//        Условие:
//        Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.
        System.out.print("Задача 2 Старт\n");

        System.out.print("Введите число 1: ");
        int num1 = in.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = in.nextInt();
        System.out.print("Введите число 3: ");
        int num3 = in.nextInt();

        if(num1 < num2 && num1 < num3) System.out.print("Число 1 минимальное\n");
        else if(num2 < num1 && num2 < num3) System.out.print("Число 2 минимальное\n");
        else if(num3 < num1 && num3 < num2) System.out.print("Число 3 минимальное\n");
        else System.out.print("Нет одного минимального числа\n");

        System.out.print("Задача 2 Конец\n\n");


//        Задача 3: Таблица умножения
//        Условие:
//        Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
        System.out.print("Задача 3 Старт\n");

        for(int i = 1; i<11; i++) System.out.print("\n" + 5*i);

        System.out.print("\nЗадача 3 Конец\n\n");


//        Задача 4: Сумма чисел от 1 до N
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.
        System.out.print("Задача 4 Старт\n");

        System.out.print("Введите целое число:");
        int it = in.nextInt();
        int result = 0;
        for(int i = 0; i<=it; i++) result+=i;
        System.out.print(result);

        System.out.print("\nЗадача 4 Конец\n\n");


//        Задача 5: Число Фибоначчи
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.
        System.out.print("Задача 5 Старт\n");

        System.out.print("Введите целое число:");
        int n = in.nextInt();

        int lastNum = 0;
        int curNum = 1;
        for(int i = 0; i<n; i++) {
            System.out.print("\n" + curNum);
            int next = lastNum + curNum;
            lastNum = curNum;
            curNum = next;
        }

        System.out.print("\nЗадача 5 Конец\n\n");


//        Задача 6: Проверка простого числа
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).
        System.out.print("Задача 6 Старт\n");

        System.out.print("Введите целое число:");
        int simpleNum = in.nextInt();

        int it2 = 2;
        boolean isSimpleNum = true;
        while(it2<=Math.sqrt(simpleNum) && isSimpleNum){
            if(simpleNum % it2 == 0) isSimpleNum = false;
            it2++;
        }
        if(isSimpleNum) System.out.print("\nЧисло простое");
        else System.out.print("\nЧисло составное");

        System.out.print("\nЗадача 6 Конец\n\n");


//        Задача 7: Обратный порядок чисел
//        Условие:
//        Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.
        System.out.print("Задача 7 Старт\n");

        System.out.print("Введите целое число:");
        int n2 = in.nextInt();

        for(int i = n2; i>0; i--) System.out.print("\n" + i);

        System.out.print("\nЗадача 7 Конец\n\n");


//        Задача 8: Сумма четных чисел
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).
        System.out.print("Задача 8 Старт\n");

        System.out.print("Введите число А:");
        int a1 = in.nextInt();
        System.out.print("Введите число B:");
        int b1 = in.nextInt();

        int sum = 0;
        for(int i = a1; i<=b1; i++) {
            if(i % 2 == 0) sum+=i;
        }
        System.out.print("Сумма четных чисел в диапазоне AB: " + sum);

        System.out.print("\nЗадача 8 Конец\n\n");


//        Задача 9: Реверс строки
//        Условие:
//        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.
        System.out.print("Задача 9 Старт\n");

        System.out.print("Введите целое число:");
        String str = in.next();
        System.out.print("\nРазвернутое число: " + new StringBuilder(str).reverse().toString());

        System.out.print("\nЗадача 9 Конец\n\n");


//        Задача 10: Количество цифр в числе
//        Условие:
//        Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.
        System.out.print("Задача 10 Старт\n");

        System.out.print("Введите целое число:");
        String numStr = in.next();
        System.out.print("Количество цифр в числе :" + numStr.length());

        System.out.print("\nЗадача 10 Конец\n\n");


//        Задача 11: Факториал числа
//        Условие:
//        Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).
        System.out.print("Задача 11 Старт\n");

        System.out.print("Введите целое число:");
        int facNum = in.nextInt();
        int it3 = 1;
        int sum1 = 1;
        while (it3 <= facNum){
            sum1*=it3;
            it3++;
        }
        System.out.print("Факториал числа: " + sum1);

        System.out.print("\nЗадача 11 Конец\n\n");


//        Задача 12: Сумма цифр числа
//        Условие:
//        Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.
        System.out.print("Задача 12 Старт\n");

        System.out.print("Введите целое число:");
        int sumNum = Math.abs(in.nextInt());
        int result2 = 0;
        while (sumNum > 0) {
            result2 += sumNum % 10;
            sumNum /= 10;
        }

        System.out.print("Сумма цифр числа: " + result2);

        System.out.print("\nЗадача 12 Конец\n\n");

//
//        Задача 13: Палиндром
//        Условие:
//        Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).
        System.out.print("Задача 13 Старт\n");

        System.out.print("Введите целое число:");
        String palindrom = in.next();
        if(palindrom.equals(new StringBuilder(palindrom).reverse().toString())) System.out.print("Строка палиндром\n");
        else System.out.print("Строка не палиндром\n");

        System.out.print("Задача 13 Конец\n\n");


//        Задача 14: Найти максимальное число в массиве
//        Условие:
//        Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.
        System.out.print("Задача 14 Старт\n");

        System.out.print("Введите целое число:");
        int quan = in.nextInt();
        int[] arr = new int[quan];
        for (int i = 0; i < quan; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        System.out.print("Максимальное число: " + max);

        System.out.print("\nЗадача 14 Конец\n\n");


//        Задача 15: Сумма всех элементов массива
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.
        System.out.print("Задача 15 Старт\n");

        System.out.print("Введите целое число:");
        int quan2 = in.nextInt();
        int[] arr2 = new int[quan2];
        for (int i = 0; i < quan2; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr2[i] = in.nextInt();
        }
        int sumArr = 0;
        for (int num : arr2) sumArr += num;
        System.out.print("Сумма чисел: " + sumArr);

        System.out.print("\nЗадача 15 Конец\n\n");

//        Задача 16: Количество положительных и отрицательных чисел
//        Условие:
//        Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.
        System.out.print("Задача 16 Старт\n");

        System.out.print("Введите целое число:");
        int quan3 = in.nextInt();
        int[] arr3 = new int[quan3];
        for (int i = 0; i < quan3; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr3[i] = in.nextInt();
        }
        int sumMin = 0;
        int sumMax = 0;
        for (int num : arr3) {
            if(num > 0) sumMax++;
            else sumMin++;
        }
        System.out.print("Количество положительных чисел: " + sumMax);
        System.out.print("\nКоличество отрицательных чисел: " + sumMin);
        System.out.print("\nЗадача 16 Конец\n\n");


//        Задача 17: Простые числа в диапазоне
//        Условие:
//        Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).
        System.out.print("Задача 17 Старт\n");

        System.out.print("Введите целое число A: ");
        int arrStart = in.nextInt();

        System.out.print("Введите целое число B: ");
        int arrEnd = in.nextInt();

        System.out.print("Простые числа в диапазоне: ");
        for(int i = arrStart; i < arrEnd; i++){
            int it4 = 2;
            boolean isSimpleNum2 = true;
            while(it4<=Math.sqrt(simpleNum) && isSimpleNum2){
                if(i % it4 == 0) isSimpleNum2 = false;
                it4++;
            }
            if(isSimpleNum2) System.out.print("\n" + i);

        }

        if(isSimpleNum) System.out.print("\nЧисло простое");
        else System.out.print("\nЧисло составное");

        System.out.print("Задача 17 Конец\n\n");


//        Задача 18: Подсчет гласных и согласных в строке
//        Условие:
//        Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.
        System.out.print("Задача 18 Старт\n");

        System.out.print("Введите строку для подсчета гласных и согласных(только английский алфавит): ");
        String str1 = in.next();
        int vowels = 0, consonants = 0;
        for (char c : str1.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AaEeIiOoUuYy".contains(String.valueOf(c))) vowels++;
                else consonants++;
            }
        }
        System.out.print("Количество гласных: " + vowels);
        System.out.print("\nКоличество согласных: " + consonants);

        System.out.print("\nЗадача 18 Конец\n\n");


//        Задача 19: Перестановка слов в строке
//        Условие:
//        Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.
        System.out.print("Задача 19 Старт\n");

        System.out.print("Введите несколько слов: ");
        String[] words = in.nextLine().split(" ");
        StringBuilder reversedArr = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedArr.append(words[i]).append(" ");
        }

        System.out.println("Развернутый массив слов: " + reversedArr.toString().trim());

        System.out.print("Задача 19 Конец\n\n");


//        Задача 20: Число Армстронга
//        Условие:
//        Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).
        System.out.print("Задача 20 Старт\n");

        System.out.print("Введите чило: ");
        int armNum = in.nextInt();

        int digitsCount = String.valueOf(armNum).length();
        int sumOfPowers = 0;
        int it4 = armNum;
        while (it4 > 0) {
            int digit = it4 % 10;
            sumOfPowers += Math.pow(digit, digitsCount);
            it4 /= 10;
        }

        if(sumOfPowers == armNum) System.out.print("Вы ввели число Армстронга");
        else System.out.print("Введенное число не является числом армстронга");

        System.out.print("\nЗадача 20 Конец\n\n");
    }
}