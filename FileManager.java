import java.io.*;

public class FileManager {

    // Метод для чтения файла
    public byte[] readFile(String filePath) throws IOException {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int length;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            return outputStream.toByteArray();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден: " + filePath);
        }
    }

    // Метод для записи файла
    public void writeFile(byte[] data, String filePath) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(data);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден: " + filePath);
        }
    }

    // Метод для копирования файла
    public void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (InputStream inputStream = new FileInputStream(sourceFilePath);
             OutputStream outputStream = new FileOutputStream(destinationFilePath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден: " + sourceFilePath);
        }
    }
}