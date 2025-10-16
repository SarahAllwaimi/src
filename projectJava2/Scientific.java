package projectJava2;

public class Scientific extends ArabicBook{
	
	 private String Type;
	  private int pages;
	
     public Scientific(int BookId, int OwnerId,String OwnName ,String BookName ,String Date , int pages) {
	  super( BookId,  OwnerId, OwnName ,BookName , Date);
	  Type="Scientific";
	  this.pages=pages;
	  
     }// constructor for the buy 
     
     public Scientific(int BookId, int OwnerId,String OwnName ,String BookName ,String DateSta, String DateEnd, int pages) {
   	  super( BookId,  OwnerId, OwnName ,BookName , DateSta ,DateEnd);
   	  Type="Scientific";
   	  this.pages=pages;
   	  
        }

	 public String getType() {
		 return Type;
	 }

	 public void setType(String type) {
		 Type = type;
	 }
	 
     
     public double CalculPrice() {
    	 if (pages < 200) {
    		 return 150+50;
    	 }
    	 else
    	  return 150; 
     }
     
     // override
     public double CalculPrice( int numOfDay) {
    	 if (pages < 200) {
    		 return numOfDay*20;
    	 }
    	 else
    	  return 10*numOfDay; 
     }

	 

      public String toString() {

    return "=== Arabic Book ===\n"
           + super.toString()  // call the toString method from Book class
		   + "\nType of Book: Scientific" 
           + "\nPages: " + pages
           + "\nPrice: " + CalculPrice();
	  }

     
}
