public class homeWorkDecorator implements homeWork{
    homeWork homeWork;
    public homeWorkDecorator(homeWork homeWork){
        this.homeWork = homeWork;
    }
    @Override
    public String homework() {
        return homeWork.homework();
    }
}
