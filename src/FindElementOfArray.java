import java.util.Scanner;

public class FindElementOfArray {
    public static void main(String[] args) {
        String[] fruits = {"xoài", "cam", "chanh", "ổi", "mít", "na"};
        // Khai báo biến tìm kiếm nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter fruit you want to find:");
        String fruit = sc.nextLine();
        // duyệt mảng và tìm kiếm phần tử hiện ra vị trí
        boolean findFruit = true;
        for (int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(fruit)){
                System.out.println("Element " + fruit +" have index is: " + i);
                findFruit = false;
                break;
            }
        }
        if(findFruit){
            System.out.println("Not find "+ fruit +" in array");
        }
    }
}
