import java.util.*;
class Convert_Seconds{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int seconds=sc.nextInt();
		int hours=0;
		int minutes=0;
		if(seconds>=3600){
			hours=seconds/3600;
			seconds=seconds%3600;
			System.out.println("hrs : "+hours);
		
		}
		if(seconds>=60){
			minutes=seconds/60;
			System.out.println("mins : "+minutes);
			seconds=seconds%60;
			System.out.println("seconds : "+seconds);
		}
		
	}
}