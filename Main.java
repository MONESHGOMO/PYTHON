/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);	
// class	vegprice=new vegprice();
		//Java mini project
		System.out.println("Welcome to Gomo pure vegetarian reataurant");
		System.out.println("Enter 1 to order and 2 to to exit");
		int userOption;
		userOption=input.nextInt();
		if (userOption==1){
	    System.out.println("<MAY I TAKE YOUR ORDER OR ARE YOU READY TO ORDER NOW>");	
		}
	    else if (userOption==2){
		System.out.println(">ordering opatch<");
	    }
	    if(userOption==1) {
	    System.out.println("HERE ITS IS CHOOSE WHICH  ARE WOULD YOU LIKE TO HAVE (* VEG , * NON-VEG, *BOTH) ");
	   }
	    String userOpinion; 
	    userOpinion=input.next();
	   switch(userOpinion){
	     
	    case "VEG" :
	    System.out.println("HERE IT IS ,VEGETARIAN MENU ,WE ARE HAVING  THE FOODS LIKE *MEALS (2) ,*MUSHROOM BIRIYANI (3),*PANNER BUTTER MASALA (4) AS AS SIDE DISH,*KEERA SAMBAR (6) ,*RASA VADA (7) ,*PAVU BAJJI (8) ");
	     break;
	    case "NON-VEG" :
	    System.out.println("HERE IT IS , NON-VEG MENU, WE HAVE  *BIRIYANI (22),*GRILLED CHICKEN (23),*NON-VEG FULL MEALS (24) ,*CHICKEN FRIED RICE (25) ,*CHICKEN NOODLES (26) ");
	    break;
	    
	    case "BOTH":
	        System.out.println(" *MEALS (2) ,*MUSHROOM BIRIYANI (3),*PANNER BUTTER MASALA (4) AS AS SIDE DISH,*KEERA SAMBAR (6) ,*RASA VADA (7) ,*PAVU BAJJI (8) ,    *BIRIYANI (22),*GRILLED CHICKHEN (23),*NON-VEG FULL MEALS (24) ,*CHICKHEN FRIED RICE (25) ,*CHICKHEN NOODLES (26) ");  
         break;
	   }
	   
	 /*   for (int process=2;process>0;process--){
	    System.out.println("enter the food code which you like to have.........");
	    }*/
	 	   byte chickenFriedrice =80;
	   byte chickenNoodles =80;
   int menuchoosing;
	    menuchoosing =input.nextInt();
	    //vegetarian menu price
	   byte meals=100;
	   byte mushrooomBiriyani=120;
	   float rasaVada=20.5f;
	   byte pannerbutterMasala=65;
	   byte pavuBajji=25;
	   byte keeraSambar=30;
	
	
	
	
	   //non-vegetarian menu price
	 
	
	   byte grilledChicken =100;
	   int Biriyani=150;
	   int nonvegMeals=150;
	   
	  
	   
	   
 switch (menuchoosing){
	      
	    case 3:
	        System.out.println(mushrooomBiriyani +"is your ordered food cost");
	        break;
	    case 2:
	        System.out.println(meals +"is your ordered food cost");
	        break;
	    
	    case 4:
	        System.out.println(pannerbutterMasala +"is your ordered food cost");
	        break;
	    case 6:
	        System.out.println(keeraSambar +"is your ordered food cost");
	        break;
	    case 7:
	        System.out.println(rasaVada +"is your ordered food cost");
	        break;
	    
	    case 8:
	        System.out.println(pavuBajji +"is your ordered food cost");
	        break;
	    
	     case 22:
	        System.out.println(Biriyani +"is your ordered food cost");
	        break;
	    
    	 case 23:
	        System.out.println(grilledChicken +"is your ordered food cost");
	        break;
	     case 24:
	        System.out.println(nonvegMeals +"is your ordered food cost");
	        break;
	    
	      case 25:
	        System.out.println(chickenFriedrice +"is your ordered food cost");
	        break;
	    
	      case 26:
	        System.out.println(chickenNoodles +"is your ordered food cost");
	        break;
	    
	  }
	   
	   
	       for (int process=2;process>0;process--){
	    System.out.println("enter the food code again and continoue your order.........");
	    }

   int secondtimemenuchoosing;
	secondtimemenuchoosing =input.nextInt();
	    //vegetarian menu price
	   byte meals=100;
	   byte mushrooomBiriyani=120;
	   float rasaVada=20.5f;
	   byte pannerbutterMasala=65;
	   byte pavuBajji=25;
	   byte keeraSambar=30;
	
	
	
	
	   //non-vegetarian menu price
	 
	
	   byte grilledChicken =100;
	   int Biriyani=150;
	   int nonvegMeals=150;
	  byte chickenNoodles=80;
	  byte chickenFriedrice=80;
	  
	   
	   
 switch (menuchoosing){
	      
	    case 3:
	        System.out.println(mushrooomBiriyani +"is your ordered food cost");
	        break;
	    case 2:
	        System.out.println(meals +"is your ordered food cost");
	        break;
	    
	    case 4:
	        System.out.println(pannerbutterMasala +"is your ordered food cost");
	        break;
	    case 6:
	        System.out.println(keeraSambar +"is your ordered food cost");
	        break;
	    case 7:
	        System.out.println(rasaVada +"is your ordered food cost");
	        break;
	    
	    case 8:
	        System.out.println(pavuBajji +"is your ordered food cost");
	        break;
	    
	     case 22:
	        System.out.println(Biriyani +"is your ordered food cost");
	        break;
	    
    	 case 23:
	        System.out.println(grilledChicken +"is your ordered food cost");
	        break;
	     case 24:
	        System.out.println(nonvegMeals +"is your ordered food cost");
	        break;
	    
	      case 25:
	        System.out.println(chickenFriedrice +"is your ordered food cost");
	        break;
	    
	      case 26:
	        System.out.println(chickenNoodles +"is your ordered food cost");
	        break;
	    
	  }
	  
	  	
	    
	    
	 
}
}