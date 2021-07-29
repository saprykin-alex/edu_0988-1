import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        if( login.equals("admin") && pass.equals("123456") ){
            System.out.println("Доступ разрешен доступ разрешен для ADMIN");
        }else if( login.equals("user") && pass.equals("123") ){
            System.out.println("Доступ разрешен для USER");
        }else {
            System.out.println("Доступ запрещен");
        }

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<b){
            System.out.println("Условие внутри if = TRUE");
        }else{
            System.out.println("Условие внутри if = FALSE");
        }*/
        //System.out.println("Hello world");
        //String name = "Ivan";
        //System.out.println("Hello "+name);
        /*int num1 = 17;
        int num2 = 5;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1==num2);
        System.out.println((num1+10)*num2);*/
    }
}
