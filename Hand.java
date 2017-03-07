
public class Hand {
protected static  Card[] cardsInHand;
private Dealer dealer;
protected static int pos;
protected static int value;
public Hand()
{
cardsInHand=new Card[12];
this.dealer=new Dealer();
pos=0;

}

public void takeCard()
{
if(pos<12)
{
cardsInHand[pos]=dealer.hit();
cardsInHand[pos].display();
pos++;
}
else
	return;
}

public static int handValue()
{
  value=0;
  for(int i=0;i<pos;i++)
  {
	  if(value<=10){
	  value+=cardsInHand[i].value;
	  }
	  else{
		  if(cardsInHand[i].value==11)
		 {value=value+1; }
		  else
		  {value+=cardsInHand[i].value;}
	  }
  }
  return value;
}

}