package codsoft;
import java.util.*;
public class Numbergame {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Hello Friend Let us play the guessing game!");
		int rou = 1;
		int win = 0;
		while(true)
		{
			System.out.println("Let us Enter into the Round "+rou+" : ");
			int chances=10;
			System.out.println("You guess number 1 to 100 Means we give a chance 10 more times");
			System.out.println("You guess correct You will win the GAME");
			System.out.println("Best of luck...");
			int i = 1;
			int min = 1;
			int max = 100;
			int target = ran.nextInt(max-min+1)+min;
			for(i=1;i<=10;i++)
			{
				System.out.println();
				System.out.println("Chance "+i+" Enter the number you guess: ");
				int num = scan.nextInt();
				System.out.println();
				if(num>target) System.out.println("Your number is too high..");
				else if(num<target) System.out.println("Your number is too low..");
				else
				{
					System.out.println("Congratulatios!! you guessed the number correctly and win the round "+rou+" just by "+i+" chances...");
					win++;
					break;
				}
				chances--;
				if(chances>0) System.out.println("You have "+chances+" chances!! Try again!");
			}
			System.out.println();
			if(chances == 0) 
			{
				System.out.println("Oops! You have lost this round :( but don't give up try another round..");
				System.out.println("Better Luck Next Time!");
				System.out.println();
			}
			System.out.println("Total number rounds Played : "+rou);
			System.out.println("Total number rounds won : "+win);
			System.out.println();
			System.out.println("Don't leave your hope!!!");
			System.out.println("Do you want to play again: Yes or No");
			scan.nextLine();
			String str = scan.nextLine().toLowerCase();
			if(str.equals("no")) 
			{
				System.out.println();
				System.out.println("Thanks for making your brain thinking more.. See you later!!");
				System.out.println();
				System.out.println("Have a Great Day :) ");
				break;
			}
			rou++;
		}
	}

}
