class InvalidAgeException1 extends Exception {
    public InvalidAgeException1(String msg) {
        super(msg);
    }

}
class User1 {
    private int age;

    public void setAge(int age) throws InvalidAgeException1 {
        if (age < 0) {
            throw new InvalidAgeException1("Tuổi không thể âm");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        User1 user = new User1();

        try {
            user.setAge(-1);
        }
        catch (InvalidAgeException1 e) {
            System.out.println(e.getMessage());
        }
    }
}