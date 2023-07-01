//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package homework1java;

public class task1 {
    public static void main(String[] args) {
        System.out.println(sum(15));
        System.out.println(fact(5));      
    }
    static Integer sum(Integer num){
        int summ = 0;
        for (int i = 0; i <= num; i++) {
            summ += i;
        }
        return summ;


    }
    static Integer fact(Integer num){
        int summ = 1;
        if (num == 0){
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            summ *= i;
        }
        return summ;
    }
}
