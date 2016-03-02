import java.util.Scanner;
public class AdventureGame {

	public static void main(String[] args) {
		Scanner type=new Scanner(System.in);
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("");
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\"(enter 1) or into the \"kitchen\"(enter 2)?");
		int uk;
		uk=type.nextInt();
		if(uk==2){
		System.out.println("There is a long countertop with dirty dishes everywhere.");
		System.out.println("Off to one side there is, as you'd expect, a refrigerator. ");
		System.out.println("You may open the \"refrigerator\"(enter 1) or look in a \"cabinet\"(enter 2).");
		int rc;
		rc=type.nextInt();
		if(rc==1){
		System.out.println("Inside the refrigerator you see food and stuff. \nIt looks pretty nasty. \nWould you like to eat some of the food? (enter Y or N)");
		String eat=type.next();
		if(eat.toLowerCase().equals("yes")){
			System.out.println("You eat the nasty food and die out of food poison.\nGame Over");	
		}else if(eat.toLowerCase().equals("no")){
			System.out.println("You die of starvation... eventually.");
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");	
		}
		}else if(rc==2){
			System.out.println("On the cabinet you see a book. \nIt is a diary written by one of the previous house owners. \nWould you like to read it? \nThere may be answer to how to get out of here. (enter Y or N)");
			String read=type.next();
			if(read.toLowerCase().equals("yes")){
				System.out.println("You read the book but only to find that no one can get out of here.\nGame Over");	
			}else if(read.toLowerCase().equals("no")){
				System.out.println("You stay in the house...forever. \nGame Over");
			}else{
				System.out.println("DEAD END");
				System.out.println("Game Over.");
			}
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");	
		}
		}else if(uk==1){
		System.out.println("Upstairs you see a hallway.  \nAt the end of the hallway is the master \"bedroom\"(enter 1). There is also a \"bathroom\" off the hallway(enter 2).  Where would you like to go?");
		int bb=type.nextInt();
		if(bb==1){
		System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. \nThe bed is unmade. \n In the back of the room, the closet door is a jar.  \nWould you like to open the door? (\"yes\" or \"no\")");
		String open=type.next();
		if(open.toLowerCase().equals("yes")){
			System.out.println("You get the jar and find a key inside. \nObject 1 is found. \nLevel 1 is completed.");	
		}else if(open.toLowerCase().equals("no")){
			System.out.println("Well, then I guess you'll never know what was in there. \nThanks for playing, \nI'm tired of making nested if statements.");
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");
		}
		}else if(bb==2){
		System.out.println("You go into the bathroom and see a skeleton in the bathtub. \nIn its hand there is a cellphone. \nWould you like to take the cellphone out? yes or no");
		String getPhone=type.next();
		if(getPhone.toLowerCase().equals("yes")){
			System.out.println("You can't take the phone out of the skeleton's hand. \nGame Over");	
		}else if(getPhone.toLowerCase().equals("no")){
			System.out.println("You die of shock. \nGame Over");
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");
		}
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");	
		}
		}else{
			System.out.println("DEAD END");
			System.out.println("Game Over.");	
		}
		type.close();
	}

}
