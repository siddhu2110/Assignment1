import java.util.*;
class Break_Amount{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		if(input>=1000){
			count=input /1000;
			input=input%1000;
			System.out.println("1000s : "+count);
		
		}
		if(input>=500){
			count=input/500;
			input=input%500;
			System.out.println("500s : "+count);
		}

		if(input>=200){
			count=input/200;
			input=input%200;
			System.out.println("Remaining : 200");
		}		
	}
}