public class Department extends homeWorkDecorator{
    homeWork homeWork;
    public Department(homeWork homeWork) {
        super(homeWork);
    }

    public String insertMarkIntoMoodle() {
        return " Homework was graded in Moodle by the help of IT department";
    }

    @Override
    public String homework() {
        return super.homework() + insertMarkIntoMoodle();
    }
}
