package shoppingKartusingarray;

import java.util.Scanner;

public class ShoppingKartOperations {
	static Scanner sc =new Scanner(System.in);
	
		static void AllMenus()
		{
		
		int choice;
		//ProductService productService=new ProductService();
		System.out.println("\t\t~~ Welcome To Shopping Kart~~");
		while(true) {
			
			System.out.println("============================================");
		System.out.println("Enter 1. for Add Product\nEnter"
				+ " 2. for display All product Details\n"
				+ "Enter 3. for display product Details by id\n"
				+ "Enter 4.for update product details\n"
				+ "Enter 5.for delete product details\n"
				+ "Enter 6.for book product\n"
				+ "Enter 7.for Cancle booking product\n"
				+ "Enter 8. for quit");
		
		System.out.println("============================================");
		choice=sc.nextInt();
		 System.out.println("============================================");
		
		 switch(choice)
		{
		case 1:AdminPanel.adminOperation();
		System.out.println("============================================");
		break;
		case 2:
			UserPanel.UserOperation();
			System.out.println("============================================");
			break;
			
		case 3:System.exit(0);
		
		
		}
		}
		}
}
		     	