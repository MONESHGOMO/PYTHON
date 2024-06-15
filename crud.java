package CRUD;
import java.util.Scanner;
public class crud{

	public static void main(String[] args) {
		 Scanner input=new Scanner (System.in);

	System.out.println("WELCOME TO gomo RETAIL SHOP");
	System.out.println("LIST OF THE PRODUCTS IN THE SHOP");
	System.out.println("1.soap\n2.paste\n3.toothbrush\n4.toothpaste\n5.perfume\n6.washing powder");
	System.out.println("ENTER ZERO TO STOP THE BILLING PROCESS");
int soap=30;
int paste =60;
int toothbrush=80;
int toothpaste=120;
int perfume =150;
int washing_powder=180;
int amount=0;
while(true) {
	System.out.println("ENTER THE PRODUCT CODE :");
	int product_code=input.nextInt();
	if(product_code==0) {
		break;
	}
	else {
		System.out.println("ENTER THE QUANTITY OF THE PRODUCT :");
		int quantity=input.nextInt();
		if(product_code==1) {
			amount=(soap*quantity)+amount;
		}
		else if(product_code==2) {
			amount=(paste*quantity)+amount;
		}
		else if(product_code==3) {
			amount=(toothbrush*quantity) + amount;
		}
		else if(product_code==4) {
			amount=(toothpaste*quantity) + amount;
		}
		else if(product_code==5) {
			amount=(perfume*quantity)+ amount;
		}
		else if (product_code==6) {
			amount=(washing_powder*quantity)+amount;
		}
		else {
			System.out.println("CURRENTLY OUT OF STOCK");
		}
		
		
	}
}

System.out.println("THE AMOUNT NEED TO PAY :" + amount);
System.out.println("HAVR A GOOD DAY....");	








}
}
