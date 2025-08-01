import java.util.*;
class Average_of_Marks{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Maths marks: ");
		float input1=sc.nextFloat();
		System.out.println("enter Physics marks: ");
		float input2=sc.nextFloat();
		System.out.println("enter Chemistry marks: ");
		float input3=sc.nextFloat();
		System.out.println("Total Marks: "+(input1+input2+input3)/3f);
	}
}