public class Teacher extends homeWorkDecorator{

    public Teacher(homeWork homeWork) {
        super(homeWork);
    }
    public String makeHomeworkReview() {
        return " Teacher assessed the homework.";
    }

    @Override
    public String homework() {
        return super.homework() + makeHomeworkReview();
    }
}
