package GottaBlast;
import java.util.Scanner;
import java.util.Random;
public class Excuses {


public static void main(String[] args){
	
	boolean parents;
	boolean siblings;
	boolean pets;
	boolean children;
	
	Scanner input = new Scanner(System.in);
	Random num = new Random();
	//System.out.println(siblings);
	//System.out.println(parents);
	
	System.out.println("Do you have siblings? (True/False)");
	siblings = input.nextBoolean();
	input.nextLine();
	System.out.println("Do you have atleast one parent? (True/False)");
	parents = input.nextBoolean();
	input.nextLine();
	System.out.println("Do you have any pets? (True/False)");
	pets = input.nextBoolean();
	input.nextLine();
	System.out.println("Do you have atleast one child? (True/False");
	children = input.nextBoolean();
	
	
	if(parents && siblings && pets && children){
		
		String[] excuse = {"Dog is sick","I'm sick", "You is sick","Brohter is sisck","Frick you","i wanna leave"};
		
		System.out.println(excuse[num.nextInt(6)]);
		
		
		
	}
	else if(parents && siblings && pets){
		
	}
	
	else if(parents && siblings && children){
		
	}
	 
	else if(parents && pets && children){
		
	}
	
	else if(siblings && pets && children){
		
	}
	
	else if(parents && siblings){
		
	}

	else if(parents && pets){
		
	}

	else if(parents && children){
		
	}

	else if(siblings && pets){
		
	}

	else if(siblings && children){
		
	}

	else if(pets && children){
		
	}

	else if(parents){
		
	}

	else if(siblings){
		
	}

	else if(pets){
		
	}

	else if(children){
		
	}

	else if (!(parents && siblings && pets && children)){
		
	}
	
	



}















}
