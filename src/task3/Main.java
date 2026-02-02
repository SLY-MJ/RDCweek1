package task3;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("王刚");

        ScrambledTofu scrambledTofu = new ScrambledTofu("家常豆腐", "豆腐", "葱姜蒜", "5分钟", 4);
        StirFriedCarrot stirFriedCarrot = new StirFriedCarrot("炒胡萝卜", "胡萝卜", "蒜苗", "3分钟", "丝");

        chef.prepareDish(scrambledTofu);
        System.out.println();
        chef.prepareDish(stirFriedCarrot);
    }
}
