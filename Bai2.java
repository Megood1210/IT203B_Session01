import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập tổng số người dùng: ");
            int totalUsers = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số nhóm muốn chia: ");
            int groups = Integer.parseInt(scanner.nextLine());

            try {
                int peoplePerGroup = totalUsers / groups;
                System.out.println("Mỗi nhóm có: " + peoplePerGroup + " người");
            }
            catch (ArithmeticException e) {
                System.out.println("Không thể chia cho 0!");
            }

            System.out.println("Chương trình vẫn tiếp tục chạy sau khi xử lý lỗi.");

        }
        finally {
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
            scanner.close();
        }
    }
}