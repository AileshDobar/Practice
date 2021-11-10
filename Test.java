
class P 
{
      void Property()
     
	 {
		System.out.println("Cash+Gold+Land");
	}
      void marry()
     {
    	 System.out.println("Shreya/Subha");
     }
}	
class C extends P
{
	 void marry()
	{
		System.out.println("Aainaa");
	}
}
 class Test
{
	public static void main(String[] args)
	{
		P p = new P();
		p.marry();
		
		C c = new C();
		c.marry();
		
		P p1 = new C();
		p1.marry();
	}
}