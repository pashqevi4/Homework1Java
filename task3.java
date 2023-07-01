package homework1java;
import java.util.Scanner;

//Реализовать простой калькулятор
public class task3 {
    public static void main(String[] args) {
        
    
    
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберите операцию (+, -, /, *):");
        String op = iScanner.nextLine();
        System.out.printf("Введите первое число:");
        Integer a = iScanner.nextInt();
        System.out.printf("Введите второе число:");
        Integer b = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Результат операции:");
        switch (op) {
            case "+":
                System.out.printf("Результат операции:");
                System.out.println(a + b);
                break;
            case "-":
                System.out.printf("Результат операции:");
                System.out.println(a - b);
                break;
            case "/":
                System.out.printf("Результат операции:");
                System.out.println(a / b);
                break;
            case "*":
                System.out.printf("Результат операции:");
                System.out.println(a * b);
            // default:
            //     System.out.println("Операция не может быть выполнена");
            //     break;
        }
    
 
    }
}

