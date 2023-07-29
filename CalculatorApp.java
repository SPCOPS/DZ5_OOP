import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        do {
            presenter.onOperatorSelected();

            System.out.print("Выполнить еще одну операцию? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);

            if (choice != 'y') {
                break;
            }
        } while (true);
    }
}
