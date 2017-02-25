package GottaBlast;
import java.util.Scanner;
import java.util.Random;
public class Excuses {


public static void main(String[] args){
	
	boolean parents;
	boolean siblings;
	boolean pets;
	boolean children;
	String reason;
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
	input.nextLine();
	System.out.println("Whats the reason (Work/School/Misc)");
	reason = input.nextLine();
	
	
	if(reason.equals("School") || reason.equals("school")){
		
	
	
	if(parents && siblings && pets && children){
		
		String[] excuse = {"Dog is sick","I'm sick", "You is sick","Brohter is sisck","Frick you","i wanna leave"};
		System.out.println(excuse[num.nextInt(6)]);	
		
	}
	else if(parents && siblings && pets){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}
	
	else if(parents && siblings && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}
	 
	else if(parents && pets && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}
	
	else if(siblings && pets && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}
	
	else if(parents && siblings){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(parents && pets){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(parents && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(siblings && pets){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(siblings && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(pets && children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(parents){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(siblings){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(pets){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if(children){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}

	else if (!(parents && siblings && pets && children)){
		String[] excuse = {};
		System.out.println(excuse[num.nextInt()]);
	}
	
	
	}


	if(reason.equals("Work") || reason.equals("work")){
	
		
		
		
		if(parents && siblings && pets && children){
			
			String[] excuse = {"Dog is sick","I'm sick", "You is sick","Brohter is sisck","Frick you","i wanna leave"};
			System.out.println(excuse[num.nextInt(6)]);	
			
		}
		else if(parents && siblings && pets){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}
		
		else if(parents && siblings && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}
		 
		else if(parents && pets && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}
		
		else if(siblings && pets && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}
		
		else if(parents && siblings){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(parents && pets){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(parents && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(siblings && pets){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(siblings && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(pets && children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(parents){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(siblings){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(pets){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if(children){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}

		else if (!(parents && siblings && pets && children)){
			String[] excuse = {};
			System.out.println(excuse[num.nextInt()]);
		}
		
		
		
	
}


		if(reason.equals("Misc")||reason.equals("misc")){
			
			
			
			
			if(parents && siblings && pets && children){
				
				String[] excuse = {"Dog is sick","I'm sick", "You is sick","Brohter is sisck","Frick you","i wanna leave"};
				System.out.println(excuse[num.nextInt(6)]);	
				
			}
			else if(parents && siblings && pets){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}
			
			else if(parents && siblings && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}
			 
			else if(parents && pets && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}
			
			else if(siblings && pets && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}
			
			else if(parents && siblings){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(parents && pets){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(parents && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(siblings && pets){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(siblings && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(pets && children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(parents){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(siblings){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(pets){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if(children){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}

			else if (!(parents && siblings && pets && children)){
				String[] excuse = {};
				System.out.println(excuse[num.nextInt()]);
			}
			
			
		}











}
}
