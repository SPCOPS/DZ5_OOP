class CalculatorModel {
    private double result;

    public void add(double a, double b) {
        result = a + b;
    }

    public void subtract(double a, double b) {
        result = a - b;
    }

    public void multiply(double a, double b) {
        result = a * b;
    }

    public void divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            result = Double.POSITIVE_INFINITY; // Обработка деления на ноль
        }
    }

    public double getResult() {
        return result;
    }
}