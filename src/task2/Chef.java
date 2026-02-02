package task2;

public class Chef {

    private String name;

    public Chef() {
    }

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //实现了多态
    public void prepareDish(Dish dish) {
        System.out.println("大厨" + getName() + "正在准备菜品：" + dish.getName());
        System.out.println("大厨" + getName() + "先把" + dish.getMainIngredient() + "和" + dish.getIngredients() + "准备好");
        System.out.println("开始烹饪" + dish.getName() + "...");
        if( dish instanceof ScrambledTofu d){
            d.cook();
            d.serve();
        }else if (dish instanceof StirFriedCarrot d){
            d.cook();
            d.serve();
        }else {
            dish.cook();
            dish.serve();
        }
    }
}
