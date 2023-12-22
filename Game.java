import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення екземпляру ShooterGame
        ShooterGame shooterGame = new ShooterGame();

        // Створення екземпляру GameHelper, передавши йому зовнішній клас
        GameHelper gameHelper = new GameHelper(shooterGame);

        // Виклик методу test класу GameHelper
        gameHelper.test();

        // Гра
        while (true) {
            // Виведення меню
            System.out.println("Що ви хочете зробити?");
            System.out.println("1. Рухатися");
            System.out.println("2. Атака");
            System.out.println("3. Вихід");

            // Отримання вибору гравця
            String choice = scanner.next();

            // Виконання вибору
            switch (choice) {
                case "1":
                    // Запит на напрямок руху
                    System.out.println("У якому напрямку ви хочете рухатися?");
                    String direction = scanner.next();

                    // Рух
                    System.out.println("Ви обрали рух у напрямку: " + direction);
                    break;
                case "2":
                    // Запит на ціль атаки
                    System.out.println("На кого ви хочете напасти?");
                    String target = scanner.next();

                    // Атака
                    System.out.println("Ви обрали атаку на ціль: " + target);
                    break;
                case "3":
                    // Вихід з гри
                    System.out.println("Гра завершена.");
                    return;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        }
    }
}
