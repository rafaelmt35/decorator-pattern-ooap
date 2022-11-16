public abstract class AddOn extends Foods{
    protected Foods foods;

    public AddOn(String description,Foods foodd){
        super(description);
        this.foods = foodd;
    }

    public abstract String getDesc();
}
