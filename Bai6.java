class InvalidAgeException2 extends Exception {
    public InvalidAgeException2(String message) {
        super(message);
    }
}

class User2 {
    private String name;
    private int age;

    public User2(String name, int age) throws InvalidAgeException2 {
        setName(name);
        setAge(age);

    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }

    }

    public void setAge(int age) throws InvalidAgeException2 {
        if (age < 0) {
            throw new InvalidAgeException2("Tuổi phải không đươc âm");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Bai6 {
    public static void main(String[] args) {
        try {
            User2 user = new User2("Anna", -5);
        }
        catch (InvalidAgeException2 e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}
