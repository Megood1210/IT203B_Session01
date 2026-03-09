import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập năm sinh: ");
            String birthYearInput = scanner.nextLine();

            int birthYear = Integer.parseInt(birthYearInput);

            int currentYear = 2026;
            int age = currentYear - birthYear;

            System.out.println("Tuổi của bạn là: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println(" Măm sinh phải là một số");
        }
        finally {
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
            scanner.close();
        }
    }
}