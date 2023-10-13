// Decorator class which implements homeWork interface
public class homeWorkDecorator implements homeWork{
//    create homework object
    homeWork homeWork;
//    create constructor with homework value
    public homeWorkDecorator(homeWork homeWork){
        this.homeWork = homeWork;
    }
//    overriding method of interface
    @Override
    public String homework() {
        return homeWork.homework();
    }
}
