//Вывести все простые числа от 1 до 1000

package homework1java;

public class task2 {
    public static void main(String[] args) {
        System.out.println(simple(1000));

    }

    static String simple(Integer limit){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while (i <= limit){
            if (i % 2 == 0){
                i++;
            }else{
                for (int j = 1; j < Math.sqrt(i); j++) {
                    if (i / j == 0) {
                        i++;
                    }
                    else{
                        stringBuilder.append(i).append(" ");
                        i++;
                    }    
                }
                 
            }
        
        }
    return stringBuilder.toString();
    }

}
