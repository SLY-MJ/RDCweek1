package task2;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("王刚");

        ScrambledTofu scrambledTofu = new ScrambledTofu("葱煎豆腐", "豆腐", "葱", "5分钟", 4);
        StirFriedCarrot stirFriedCarrot = new StirFriedCarrot("清炒胡萝卜", "胡萝卜", "蒜末", "3分钟", "片");

        chef.prepareDish(scrambledTofu);
        System.out.println();
        chef.prepareDish(stirFriedCarrot);
    }
}
