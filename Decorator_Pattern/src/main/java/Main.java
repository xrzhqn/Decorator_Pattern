public class Main {
    public static void main(String[] args) {
//        an object of Department class which takes value of object Teacher which takes value of Student class
        homeWork homeWork = new Department(new Teacher(new Student()));
//        output of our object
        System.out.println(homeWork.homework());
    }
}
