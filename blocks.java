public class blocks
	{ 
		private double Y; 
		private double X;
		private double height;
		private double width; 
		  
		private Rectangle shape[] = new Rectangle[4];
		  
		public blocks (double Xposition, double Yposition, String colour)
		{
		X=Xposition; 
		Y=Yposition;
		shape[0] = new Rectangle((X-0), (Y+0), 50, 50, colour);
		shape[1] = new Rectangle((X+0), (Y+0), 50, 50, colour); 	
		shape[2] = new Rectangle(X, Y, 0, 0, colour);  
		shape[3] = new Rectangle(X, (Y-20), 50, 50, colour);
		
		} 
	
			public void addTo(GameArena arena)     
		{
			arena.addRectangle(shape[0]);  
			arena.addRectangle(shape[1]); 
		        arena.addRectangle(shape[2]); 
			arena.addRectangle(shape[3]);   
			
			arena.update();
		}
  	
		public double getx() 
		{
			return X;
		} 
  	
		public double gety() 
		{
			return Y;
		
		}
		
}


