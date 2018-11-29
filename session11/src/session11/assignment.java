package session11;

class pos{
	static int burger;
	static int pizza;				//attributes
	static int coke;
	static int fries;
	static int sandwich;
	static int price;
	int pos;
	
 static int bill;
	
	pos(int burger,int pizza,int coke,int fries,int sandwich){
		
	
	this.burger=burger;
	this.pizza=pizza;
	this.coke=coke;
	this.fries=fries;
	this.sandwich=sandwich;
			price=50;
			
	
	
}
	
	void showpos(){
		
		
		
	}
	static void showbill(){
		System.out.println("Welcome to Our Restautrant");
		System.out.println();
		System.out.println("Your Order PLease");
		System.out.println();
		System.out.println("Burger  : \t"+burger+"  =>"+burger*price);
		System.out.println("Pizza: \t\t"+pizza+"  =>"+pizza*price);
		System.out.println("Coke: \t\t"+coke+"  =>"+coke*price);
		System.out.println("Fries: \t\t"+fries+"  =>"+fries*price);
		System.out.println("Sandwich: \t"+sandwich+"  =>"+sandwich*price);
		bill=burger*price+pizza*price+coke*price+fries*price+sandwich*price;
		System.out.println("Bill : "+bill);
	}
}
public class assignment {

	public static void main(String[] args) {
		pos b1 = new pos(2, 0, 0, 4, 0);
		b1.showpos();
		pos.showbill();
	}

}
