import java.util.ArrayList;
import java.util.List;

class MiniCalculator {

    private List<String> history = new ArrayList<>();

    public double add(double a, double b) {
        history.add("+");
        return a + b;
    }

    public double subtract(double a, double b) {
        history.add("-");
        return a - b;
    }

    public double multiply(double a, double b) {
        history.add("*");
        return a * b;
    }

    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Деление на ноль невозможно");
        }
        history.add("/");
        return a / b;
    }

    public double power(double a, int b) {
        history.add("^");
        return Math.pow(a, b);
    }

    public List<String> getHistory() {
        return history;
    }

    public void clearHistory() {
        history.clear();
    }

    public static class DivideByZeroException extends Exception {
        public DivideByZeroException(String message) {
            super(message);
        }
    }
}