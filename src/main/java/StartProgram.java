import java.util.Scanner;

public class StartProgram {

    public static void main(String[] args) {
        System.out.println("               ###################\n               # Тинькофф Финтех #\n               #  calculator №1  #\n               # (c) Ippolitov A #\n               ###################\n");
        System.out.println("Привет! Если тебе так же как и мне тяжело считать - \nвоспользуйся этим калькулятором\n");
        calculate();

    }

    public static void calculate() {
        System.out.println("Калькулятор считает примеры формата: \na(операция)b \nгде а и b - целые числа (без точки)\n");
        System.out.println(" *Чтобы начать введи цифу 1 и нажми Enter\n *Если хочешь выйти введи любой символ и нажми Enter");
        Scanner reader = new Scanner(System.in);
        String openProgram = reader.nextLine();

        while (openProgram.equals("1")) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введи первое число");
            String input1 = scanner.nextLine();
            int number1 = 0;
            if (new Scanner(input1).hasNextInt()) {
                number1 = Integer.parseInt(input1);
            } else {
                System.out.println("Первое число некоректно \nПобробуй еще раз\n");
                continue;

            }

            System.out.println("Введи второе число");
            String input2 = scanner.nextLine();
            int number2 = 0;
            if (new Scanner(input2).hasNextInt()) {
                number2 = Integer.parseInt(input2);
            } else {
                System.out.println("Второе число некоректно \nПопробуй ввести числа еще раз\n");
                continue;
            }

            System.out.println("Введи операцию из предложенных:\n+ сложение\n- вычитание\n* умножение\n/ деление");
            String procedure = scanner.nextLine();

            switch (procedure) {
                case "+":
                    System.out.println("Результат: " + new OperationAddition().execute(number1, procedure, number2) + "\n");
                    break;
                case "-":
                    System.out.println("Результат: " + new OperationSubtraction().execute(number1, procedure, number2) + "\n");
                    break;
                case "*":
                    System.out.println("Результат: " + new OperationMultiplication().execute(number1, procedure, number2) + "\n");
                    break;
                case "/":
                    System.out.println("Результат: " + new OperationDivision().execute(number1, number2, procedure) + "\n");
                    break;
                default:
                    System.out.println("Знак введен некоректно! \n");
                    break;
            }

            System.out.println("Для продолжение введи 1\nДля выхода введи любой символ");
            openProgram = reader.nextLine();
        }
        System.out.println("Вы вышли из программы");
    }

}
