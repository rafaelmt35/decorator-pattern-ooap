public class Sauce extends AddOn {
    public Sauce(Foods food){
        super("Spicy", food);
    }

    @Override
    public String getDesc(){
        return foods.getDesc() + " with sauce";
    }

    @Override
    public double cost(){
        return foods.cost() + 50;
    }
}
