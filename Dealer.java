
public class Dealer {
private Deck deck;
private static int pos;
public Dealer()
{
	this.deck=new Deck();
	deck.shuffle();
	pos=0;
}



public Card hit()
{
return deck.deal(pos++);
}

}
