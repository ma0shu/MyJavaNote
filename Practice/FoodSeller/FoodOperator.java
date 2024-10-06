package Practice.FoodSeller;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList=new ArrayList<>();
    public void addFood()
    {
        Food food=new Food();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入菜品名称：");
        String name=scanner.next();
        food.setName(name);
        System.out.println("请输入菜品价格：");
        double price=scanner.nextDouble();
        food.setPrice(price);
        System.out.println("请输入菜品描述：");
        String description=scanner.next();
        food.setDescription(description);
        foodList.add(food);
        System.out.println("添加成功！");
    }
    public void showAllFoods(){
        if(foodList.size()==0){
            System.out.println("暂无菜品！");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f=foodList.get(i);
            System.out.println("菜品名称："+f.getName()+"\t菜品价格："+f.getPrice()+"\t菜品描述："+f.getDescription());
        }
    }
    public void start() {
        while (true) {
            System.out.println("请选择功能");
            System.out.println("1.上架菜品");
            System.out.println("2.查看所有菜品");
            System.out.println("0.退出");
            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    addFood();
                    break;
                case 2:
                    showAllFoods();
                    break;
                case 0:
                    System.out.println("退出成功！");
                    return;
                default:
                    System.out.println("输入错误！");
            }
        }
    }
}
