//Teacher class extends Decorator class which already implemented homework method
public class Teacher extends homeWorkDecorator{
//  create constructor which takes homework as value
    public Teacher(homeWork homeWork) {
        super(homeWork);
    }
//    create a method which returns this string
    public String makeHomeworkReview() {
        return " Teacher assessed the homework.";
    }
//      переопределяем метод интерфейса и добавляем метод в этом классе
    @Override
    public String homework() {
        return super.homework() + makeHomeworkReview();
    }
}
