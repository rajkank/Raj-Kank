import java.util.*;
class FirstProgram{
    public static void main(String args[]){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter First Number");
        int no1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int no2 = sc.nextInt();
        int result = no1 + no2;
        System.out.println("Your Name is : "+name);
        System.out.println("First Number : "+no1);
        System.out.println("Second Number : "+no2);
        System.out.println("Rsult is : "+result);
    }
}