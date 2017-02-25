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
		
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(15)]);	
		
	}
	else if(parents && siblings && pets){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(14)]);
	}
	
	else if(parents && siblings && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(12)]);
	}
	 
	else if(parents && pets && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(14)]);
	}
	
	else if(siblings && pets && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(14)]);
	}
	
	else if(parents && siblings){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(9)]);
	}

	else if(parents && pets){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(13)]);
	}

	else if(parents && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(11)]);
	}

	else if(siblings && pets){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(13)]);
	}

	else if(siblings && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(11)]);
	}

	else if(pets && children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(13)]);
	}

	else if(parents){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(10)]);
	}

	else if(siblings){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(10)]);
	}

	else if(pets){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(12)]);
	}

	else if(children){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(10)]);
	}

	else if (!(parents && siblings && pets && children)){
		String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
		System.out.println(excuse[num.nextInt(9)]);
	}
	
	
	}


	if(reason.equals("Work") || reason.equals("work")){
	
		
		
		
		if(parents && siblings && pets && children){
			
			String[] excuse = {"I have a Doctor’s appointment.", "There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(18)]);	
			
		}
		else if(parents && siblings && pets){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(14)]);
		}
		
		else if(parents && siblings && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(15)]);
		}
		 
		else if(parents && pets && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(17)]);
		}
		
		else if(siblings && pets && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(17)]);
		}
		
		else if(parents && siblings){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(11)]);
		}

		else if(parents && pets){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(13)]);
		}

		else if(parents && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(14)]);
		}

		else if(siblings && pets){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(13)]);
		}

		else if(siblings && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(14)]);
		}

		else if(pets && children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(16)]);
		}

		else if(parents){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(9)]);
		}

		else if(siblings){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(10)]);
		}

		else if(pets){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(12)]);
		}

		else if(children){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
			System.out.println(excuse[num.nextInt(13)]);
		}

		else if (!(parents && siblings && pets && children)){
			String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
			System.out.println(excuse[num.nextInt(9)]);
		}
		
		
		
	
}


		if(reason.equals("Misc")||reason.equals("misc")){
			
			
			
			
			if(parents && siblings && pets && children){
				
				String[] excuse = {"I have a Doctor’s appointment.", "I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(22)]);	
				
			}
			else if(parents && siblings && pets){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(17)]);
			}
			
			else if(parents && siblings && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(19)]);
			}
			 
			else if(parents && pets && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(21)]);
			}
			
			else if(siblings && pets && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(20)]);
			}
			
			else if(parents && siblings){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(14)]);
			}

			else if(parents && pets){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(16)]);
			}

			else if(parents && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(18)]);
			}

			else if(siblings && pets){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(15)]);
			}

			else if(siblings && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(17)]);
			}

			else if(pets && children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(19)]);
			}

			else if(parents){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(13)]);
			}

			else if(siblings){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(12)]);
			}

			else if(pets){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(14)]);
			}

			else if(children){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something."};
				System.out.println(excuse[num.nextInt(16)]);
			}

			else if (!(parents && siblings && pets && children)){
				String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a trafiic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning."};
				System.out.println(excuse[num.nextInt(11)]);
			}
			
			
		}




		System.out.println(siblings);
		System.out.println(parents);





}
}
