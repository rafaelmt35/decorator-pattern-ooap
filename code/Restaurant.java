public class Restaurant {
    public static void main(String[] args) {

        Normalfood normalfood = new Normalfood();
        System.out.println(normalfood.getDesc() + ": " + normalfood.cost());

        Spicyfood spicyfood = new Spicyfood();
        System.out.println(spicyfood.getDesc() + ": " + spicyfood.cost());

        SideDish sideDish = new SideDish(spicyfood);
        System.out.println(sideDish.getDesc() + ": " + sideDish.cost());

        Sauce sauce = new Sauce(sideDish);
        System.out.print(sauce.getDesc() + ": " + sauce.cost());
    }
}
