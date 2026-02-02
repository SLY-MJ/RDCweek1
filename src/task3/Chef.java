package task3;

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

    public void prepareDish(Dish dish) {
        System.out.println("大厨" + getName() + "开始准备菜品：" + dish.getName());
        if (dish instanceof ScrambledTofu d) {
            d.cook();
            d.serve();
        }
        else if (dish instanceof StirFriedCarrot d) {
            d.cut();
            d.cook();
            d.serve();
        }
        else {
            System.out.println("未知菜品，无法准备！");
            return;
        }
        System.out.println("菜品" + dish.getName() + "准备完成！");
    }
}
