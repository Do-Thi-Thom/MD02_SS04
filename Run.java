import BT2_OOP.ra.Employee;
import BT3_OOP.QuadraticEquation;
import BT_OOP.ra.Circle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BT1:
//        Circle circle1 = new Circle();
//        circle1.inputData(scanner);
//        circle1.displayData();
//        double dientich = circle1.area(); // biến hứng giá trị trả về của hàm(phương thức)
//        System.out.printf("Dien tich hinh tron la: %.2f\n", dientich);
//
//        double radius = circle1.perimeter();
//        System.out.printf("Chu vi hình tròn là: %.2f", radius);

        //BT2:
//        Employee employee = new Employee();
//        employee.inputData(scanner);
//        employee.displayData();
//        double salary = employee.salary();
//        System.out.println("Lương" + salary);

        //BT3:
        QuadraticEquation qe = new QuadraticEquation();
        double root1 = 0.0;
        double root2 = 0.0;
        qe.inputData(scanner);
        double delta = qe.getDiscriminant();

        if(delta > 0){
            root1 = qe.getRoot();
            System.out.println("Nghiem thu 1: " + root1);
            root2 = qe.getRoot2();
            System.out.println("Nghiem thu 2: " + root2);
        }else if(delta == 0){
            root1 = qe.getRoot();
            System.out.println("Nghiem thu 1: " + root1);
        }else{
            System.out.println("The equation has no roots");
        }
    }

}
