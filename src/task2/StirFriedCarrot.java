package task2;

public class StirFriedCarrot extends Dish{

    private String featrue;

    public StirFriedCarrot(){}

    public StirFriedCarrot(String name, String mainIngredient, String ingredients, String time,String featrue){
        super(name, mainIngredient, ingredients, time);
        this.featrue = featrue;
    }

    public String getFeatrue() {
        return featrue;
    }

    public void setFeatrue(String featrue) {
        this.featrue = featrue;
    }

    @Override
    public void cook() {
        System.out.println("将"+ getIngredients() + "炒至半熟,再加入" + getMainIngredient() + getFeatrue() + ",继续翻炒" + getTime() );
    }

    @Override
    public void serve() {
        System.out.println("大厨将精心制作的" + getName() + "装盘上桌");
    }
}
