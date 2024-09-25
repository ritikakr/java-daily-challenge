package com.day4;

public class Main 
{
	public class Hillstation 
	{
		public void location()
		{
			System.out.println("Hillstation.");
		}
				
		public void famousfor()
				
		{
			System.out.println("Famous for its weather and views.");
		}

	
	}

	public class Manali extends Hillstation
	{
		public void location()
		{
			System.out.println("Manali");
			
		}
		
		public void famousfor()
		{
			System.out.println("Manali is famous for snow-capped mountains, adventure sports, and scenic beauty.");
			super.location();
			super.famousfor();
		}
	}
	

	public class Mussoorie extends Manali
	{
		public void location()
		{
			System.out.println("Mussoorie.");
			
		}
		
		public void famousfor()
		{
			System.out.println("Mussoorie is famous for its colonial architecture, scenic views, and pleasant weather.");
			super.location();
			super.famousfor();
		}
	}
	

	public class Gulmarg extends Mussoorie
	{
		public void location()
		{
			System.out.println("Gulmarg.");
			
		}
		
		public void famousfor()
		{
			System.out.println("Gulmarg is famous for its gondola rides, skiing, and meadows.");
			super.location();
			super.famousfor();
		}

	}
	public static void main(String[] args)
	{
		Main m = new Main();
		
		Gulmarg gm = m.new Gulmarg();
		
		gm.location();
		gm.famousfor();
				
	}
		
	}



