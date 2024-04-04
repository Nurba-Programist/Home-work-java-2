// Пример использования
public class Main {
    public static void main(String[] args) {
        MiniCalculator calculator = new MiniCalculator();
        
        try {
            double result = calculator.divide(10, 0);
            System.out.println("Результат деления 10 на 0: " + result);
        } catch (MiniCalculator.DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            double result = calculator.power(2, 3);
            System.out.println("Результат возведения числа 2 в степень 3: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        for (String operation : calculator.getHistory()) {
            System.out.print(operation + " ");
        }
    }
}
