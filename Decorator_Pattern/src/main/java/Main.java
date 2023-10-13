public class Main {
    public static void main(String[] args) {
        homeWork homeWork = new Department(new Teacher(new Student()));

        System.out.println(homeWork.homework());
    }
}
