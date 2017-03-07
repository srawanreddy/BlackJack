class school2 extends School
{
 private void msg1()
	{
		System.out.println("this method cannot accessed outside class since it is using private access modifier");
		
	}
 protected void msg2()
 {
	 System.out.println("this method can be accessed inside the same package since it is using protected access modifier");
 }
 protected void msg3()
 {
	 System.out.println("this method can be accessed outside the class  since it is using public access modifier");
 }
}