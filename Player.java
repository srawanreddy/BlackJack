import java.util.*;
public class Player{
	Scanner sc=new Scanner(System.in);
	private Hand hand;
	public Player()
	{
		hand=new Hand();
	}
	public boolean isBusted()
	{
		return(hand.handValue()>21);
	}
	
	public boolean isBlackJack()
	{
		return(hand.handValue()==21);
	}
	public void blackJack()
	{
		System.out.println("Players Cards: ");
		hand.takeCard();
		hand.takeCard();
		System.out.println("Total Value: "+ hand.handValue());
		while(!isBusted()&&!isBlackJack()){
			System.out.println("Press 1 to continue, 2 to drop the game");
			if(sc.nextInt()==1)
			{
				System.out.println("Players Cards: ");
				hand.takeCard();
				System.out.println("Total Value: "+ hand.handValue());
			}
			else 
			{
				break;
			}
		}
		
		if(isBusted())
		{System.err.println("Player Lost!");}
		else if(isBlackJack())
		{System.out.println("Player Won!");}
		else
		{System.out.println("Player dropped the game!");}
		
	}
}
