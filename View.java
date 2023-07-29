import java.util.Scanner;

class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public void showResult(double result) {
        System.out.println("Результат: " + result);
    }

    public UserInput getUserInput() {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        return new UserInput(num1, num2, operator);
    }

    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }
}

// Класс для хранения введенных пользователем данных
class UserInput {
    public double num1;
    public double num2;
    public char operator;

    public UserInput(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
}
