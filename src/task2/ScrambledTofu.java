package task2;

public class ScrambledTofu extends Dish{

    private int number;

    public ScrambledTofu(){}

    public ScrambledTofu(String name, String mainIngredient, String ingredients, String time,int number){
        super(name, mainIngredient, ingredients, time);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void cook() {
        System.out.println("用油把"+ getIngredients() + "爆出香味,再将" + getNumber() + "块" + getMainIngredient() + "放入煎" + getTime() );
    }

    @Override
    public void serve() {
        System.out.println("大厨将精心制作的" + getName() + "装盘上桌");
    }
}
