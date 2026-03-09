import java.io.FileNotFoundException;
import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class UserService {
    public static void registerUser(String name, String ageInput, String email) throws InvalidAgeException, InvalidEmailException { // khai báo throws để phương thức gọi nó (main) phải xử lý
        int age;

        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            throw e; // ném ra một ngoại lệ
        }

        if (age < 18) {
            throw new InvalidAgeException("Lỗi nghiệp vụ: Tuổi không đủ để đăng ký hệ thống.");
        }

        if (!email.contains("@")) {
            throw new InvalidEmailException("Lỗi nghiệp vụ: Email không hợp lệ.");
        }

        System.out.println("Đăng ký thành công cho: " + name);
    }

    public static void saveUserToFile(String userData) throws FileNotFoundException { // là Checked Exception nên bắt bắt buộc phải có throws hoặc try-catch để xử lý
        throw new FileNotFoundException("Không tìm thấy file lưu trữ.");
    }
}

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            String age = scanner.nextLine();

            System.out.print("Nhập email: ");
            String email = scanner.nextLine();

            UserService.registerUser(name, age, email);

            String userData = name + ", " + age + ", " + email;
            UserService.saveUserToFile(userData);

        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Tuổi phải là một con số");
        }
        catch (FileNotFoundException e) {
            System.out.println("Lỗi hệ thống: " + e.getMessage());
        }
        finally {
            System.out.println("Hoàn tất luồng xử lý đăng ký.");
            scanner.close();
        }
    }
}