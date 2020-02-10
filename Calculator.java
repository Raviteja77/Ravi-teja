package project1.Raviteja;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc = new Scanner(System.in);
		s=1;
		while(s!=0){
			float number1 = sc.nextInt();
			float number2 = sc.nextInt();
			char choice = sc.next().charAt(0);
		     switch(choice) {
		       case '+':
			     System.out.println(number1+number2);
			     break;
		       case '-': 
			     System.out.println(number1-number2);
			     break;
		       case '*':
			     System.out.println(number1*number2);
			     break;
		       case'/':
			     System.out.println(number1/number2);
			     break;
		}	
		     System.out.println("do you want to continue");
		     s=sc.nextInt();
		} 
		sc.close();
		System.out.println("calculator is turned off");
	}
}
