public class SideDish extends AddOn {

    public SideDish(Foods food){
        super("Side Dish", food);
    }

    @Override
    public String getDesc(){
        return foods.getDesc() + " with Side Dish";
    }

    @Override
    public double cost(){
        return foods.cost() + 100;
    }
}
