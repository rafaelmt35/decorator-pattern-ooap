public abstract class Foods {
    private String description;
    
    public Foods(String description){
        super();
        this.description = description;
    }
    
    public String getDesc(){
        return description;
    }

    public abstract double cost();
}   

