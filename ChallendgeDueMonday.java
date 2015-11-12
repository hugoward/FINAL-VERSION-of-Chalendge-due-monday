
public class ChallendgeDueMonday {

	public static void main( String arg[]){
	boolean loop=true;
       //PATTERN 1
		//*
		//**
		//***
		//****
		//*****
		//Pattern1
		System.out.println("Pattern 1:");
		
		{
			for(int i=1;i<=5;i++){
				 
	            for(int j=1;j<=i;j++){
	                if (j%2==0 || j%2!=0)
	                {
	                	System.out.print("*");
	                }
	            
	               
	            }
	            
	            System.out.println();
			}
			
			
		//Pattern2
			//     *
			  //  ***
			  // *****
			 // *******
			// *********
			System.out.println(" ");
			System.out.println("Pattern 2:");
			int counter=1;
			while(counter<=2)
			{
				
				
				for(int lines=1;lines<=5;lines++) // Prints 'i' number of lines
					
				{
					
					int lastline = (1+2*(5-1));
					int newline = (1+2*(lines-1));
				
					for (int space=1; space<=(lastline-newline  )/2; space++)
                	{
						
                		System.out.print(" ");
                		
                		
                	}
					
		            for(int x=1; x<=newline; x += 1)
		            {
		            	
		                System.out.print("*");
		                
		                	
		            }
		            System.out.println();  
		            
		            
				}
				counter++;
			}
				 
		            
			
		
	//PATTERN 3	
				System.out.println(" ");
			System.out.println("Pattern 3:");
			
			for(int lines=1;lines<=5;lines++) // Prints 'i' number of lines
				
			{
				
				int lastline = (1+2*(5-1));
				int newline = (1+2*(lines-1));
			
				for (int space=1; space<=(lastline-newline  )/2; space++)
            	{
					
            		System.out.print(" ");
            		
            		
            	}
				
	            for(int x=1; x<=newline; x += 1)
	            {
	            	
	            	if (x%2==0)
	            	{
	            		System.out.print("A");
	            	}
	            	
	            	if (x%2!=0) //or write "else"
	            	{
	            		System.out.print("*");
	            	}
	    			
	                
	                
	                	
	            }
	            System.out.println();  
			}
			 
		
			
	
	
        }


	}

}


