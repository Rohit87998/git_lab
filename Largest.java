import java.util.Scanner;
public class Largest {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();
     System.out.println("enter the second number");
    int b = sc.nextInt();
     System.out.println("enter the third number");
    int c = sc.nextInt();
    if (a > b && a>c){
        System.out.println(a+" is the greatest number");

}
else if(b > a && b > c){
    System.out.println(b +" is the greatest number");
}
else if ( c > b && c > a ) {
    System.out.println(c +" is the greatest number");
}

float sum = a+b+c;
float average = sum/2;
System.out.println("average of the three numbers is  = "+ average);







}
}