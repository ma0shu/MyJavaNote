package Practice.FoodSeller;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList=new ArrayList<>();
    public void addFood()
    {
        Food food=new Food();
        Scanner scanner=new Scanner(System.in);
        System.out.println("�������Ʒ���ƣ�");
        String name=scanner.next();
        food.setName(name);
        System.out.println("�������Ʒ�۸�");
        double price=scanner.nextDouble();
        food.setPrice(price);
        System.out.println("�������Ʒ������");
        String description=scanner.next();
        food.setDescription(description);
        foodList.add(food);
        System.out.println("��ӳɹ���");
    }
    public void showAllFoods(){
        if(foodList.size()==0){
            System.out.println("���޲�Ʒ��");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f=foodList.get(i);
            System.out.println("��Ʒ���ƣ�"+f.getName()+"\t��Ʒ�۸�"+f.getPrice()+"\t��Ʒ������"+f.getDescription());
        }
    }
    public void start() {
        while (true) {
            System.out.println("��ѡ����");
            System.out.println("1.�ϼܲ�Ʒ");
            System.out.println("2.�鿴���в�Ʒ");
            System.out.println("0.�˳�");
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
                    System.out.println("�˳��ɹ���");
                    return;
                default:
                    System.out.println("�������");
            }
        }
    }
}
