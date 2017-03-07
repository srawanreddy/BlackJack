import java.util.Random;
public class Deck {

private Card[] theCards;
	
	public Deck()
	{
		this.theCards = new Card[52];
		String[] suits = {"H","D","C","S"};
		String[] displayNames = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		int pos = 0;
		for(int i = 0; i < suits.length; i++)
		{
			for(int j = 0; j < displayNames.length; j++)
			{
				this.theCards[pos] = new Card(displayNames[j], suits[i], values[j]);
				pos++;
			}
		}
	}
	
	public void shuffle()
	{
		Random r = new Random();
		int pos1;
		int pos2;
		Card temp;
		for(int i = 0; i < 5000; i++)
		{
			pos1 = r.nextInt(this.theCards.length);
			pos2 = r.nextInt(this.theCards.length);
			temp = this.theCards[pos1];
			this.theCards[pos1] = this.theCards[pos2];
			this.theCards[pos2] = temp;
		}
	}
	
	public Card deal(int pos)
	{
		return(this.theCards[pos]);
	}
	
	/*public void display()
	{
		for(int i = 0; i < this.theCards.length; i++)
		{
			this.theCards[i].display();
		}
	}*/
}
