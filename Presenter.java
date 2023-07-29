class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onOperatorSelected() {
        UserInput userInput = view.getUserInput();

        if (userInput != null) {
            double num1 = userInput.num1;
            double num2 = userInput.num2;
            char operator = userInput.operator;

            switch (operator) {
                case '+':
                    model.add(num1, num2);
                    break;
                case '-':
                    model.subtract(num1, num2);
                    break;
                case '*':
                    model.multiply(num1, num2);
                    break;
                case '/':
                    model.divide(num1, num2);
                    break;
                default:
                    view.showError("Некорректный оператор");
            }

            view.showResult(model.getResult());
        } else {
            view.showError("Некорректный ввод");
        }
    }
}