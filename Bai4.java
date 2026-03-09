import java.io.IOException;

public class Bai4 {
    public static void saveToFile(String data) throws IOException {
        throw new IOException("Không thể ghi dữ liệu vào file");
    }

    public static void processUserData(String userData) throws IOException {
        saveToFile(userData); //truyền dữ liệu người dùng vào để lưu file
    }

    public static void main(String[] args) {
        try {
            processUserData("User: Anna, Age: 22");
        }
        catch (IOException e) {
            System.out.println("Lỗi hệ thống khi lưu dữ liệu: " + e.getMessage());
        }

    }
}