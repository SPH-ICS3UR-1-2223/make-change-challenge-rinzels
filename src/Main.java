import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		//Read in the amount paid
		System.out.println("What was the price");
		double price=in.nextDouble();
		System.out.println("how much money did you use to pay");
		double paid=in.nextDouble();
		double change=paid-price;
		System.out.println(change);
		
		int n100 = (int)(change/100);
		System.out.println(n100+" x $100");
		change = change - (n100*100);
		change=Math.round(change*100)/100;
		
		int n50 = (int)(change/50);
		System.out.println(n50+" x $50");
		change = change - (n50*50);
		change=Math.round(change*50)/50;
		
		int n20 = (int)(change/20);
		System.out.println(n20+" x $20");
		change = change - (n20*20);
		change=Math.round(change*20)/20;
		
		int n10 = (int)(change/10);
		System.out.println(n10+" x $10");
		change = change - (n10*10);
		change=Math.round(change*10)/10;
		
		int n5 = (int)(change/5);
		System.out.println(n20+" x $5");
		change = change - (n5*5);
		change=Math.round(change*5)/5;

		int n2 = (int)(change/2);
		System.out.println(n2+" x $2");
		change = change - (n2*2);
		change=Math.round(change*2)/2;
		
		int n1 = (int)(change/1);
		System.out.println(n1+" x $1");
		change = change - (n1*1);
		change=Math.round(change*1)/1;
		
		int n025 = (int)(change/025);
		System.out.println(n025+" x $0.25");
		change = change - (n025*0.25);
		change=Math.round(change*0.25)/0.25;
		
		
		int n010 = (int)(change/010);
		System.out.println(n010+" x $0.10");
		change = change - (n010*0.10);
		change=Math.round(change*0.10)/0.10;
		
		
		int n005 = (int)(change/005);
		System.out.println(n005+" x $0.05");
		change = change - (n005*0.05);
		change=Math.round(change*0.05)/0.05;
		
		
		
		
			
		
		
		//Print out the amount of change
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
