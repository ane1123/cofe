package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Меня зовут Юля.");
        System.out.println("Я была сделана в 2021 году.");
        System.out.println("Пожалуйста, напиши мне своё имя.");
        String name = scanner.nextLine();
        System.out.println("Какое у тебя отличное имя - " + name + "!");
        System.out.println("Дай угадаю твой возраст.");
        System.out.println("Напиши остатки деления твоего возраста на 3, 5 и 7");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Твой возраст равен " + age + "; что за хорошее время, чтобы начать программировать!");
        System.out.println("Теперь я докажу вам, что могу считать до любого числа, которое вы хотите.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        System.out.println("Готово, хорошего дня!");
        System.out.println("Давайте проверим ваши знания в области программирования.");
        System.out.println("Почему мы используем методы?");
        System.out.println("1. Чтобы повторить утверждение несколько раз.");
        System.out.println("2. Разбить программу на несколько небольших подпрограмм.");
        System.out.println("3. Чтобы определить время выполнения программы.");
        System.out.println("4. Прервать выполнение программы.");
        number = scanner.nextInt();
        while (number != 2) {
            System.out.println("Пожалуйста, попробуй ещё.");
            number = scanner.nextInt();
        }
        System.out.println("Поздравляю, хорошего дня!");
    }

}