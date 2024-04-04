/* import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier {

    // Метод для проверки пароля
    public static void verifyPassword(String password) throws InvalidPasswordException {
        if (password == null || password.isEmpty()) {   
            throw new InvalidPasswordException("Пароль не может быть пустым.");
        }

        // Проверка длины пароля
        if (password.length() < 8) {
            throw new InvalidPasswordException("Пароль должен быть не менее 8 символов.");
        }

        // Регулярное выражение для проверки наличия цифры и заглавной буквы
        final String regex = "^.*(?=.{8,})(?=.*\\d)(?=.*[A-Z]).*$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()) {
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру и заглавную букву.");
        }
    }

    // Вспомогательный класс для исключения
    private static class InvalidPasswordException extends Exception {
        InvalidPasswordException(String message) {
            super(message);
        }
    }

    // Статический блок для тестирования
    public static void main(String[] args) {
        try {
            verifyPassword("12345Fm8"); // Правильный пароль
            System.out.println("Пароль верен.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            verifyPassword("abcdefg"); // Неправильная длина
            System.out.println("Это не должно быть напечатано.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            verifyPassword("bcdefghe"); // Нет цифры и заглавной буквы
            System.out.println("Это не должно быть напечатано.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            verifyPassword("abc123Def"); // Есть заглавная буква, но нет цифры в начале
            System.out.println("Это не должно быть напечатано.");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
} */