//take character input from user. 
import java.util.Scanner;
public class P1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the charachter");
	char ch = sc.next().charAt(0);//it takes only single character from user(string)
	System.out.println("the entered character is:");
	System.out.println(ch);
}
}
