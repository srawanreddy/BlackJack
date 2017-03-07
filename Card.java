
public class Card {
	private String displayName;
	private String displaySuit;
	protected int value;
	
	public Card(String displayName, String displaySuit, int value)
	{
		this.displayName = displayName;
		this.displaySuit = displaySuit;
		this.value = value;
	}
	
	public void display()
	{
		System.out.println(this.displayName + " of " + this.displaySuit);
	}
}
