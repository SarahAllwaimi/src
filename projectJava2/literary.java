package projectJava2;


public class literary extends ArabicBook{

	 private String Type;
	 private int pages;
	
	 public literary(int BookId, int OwnerId,String OwnName ,String BookName,String Date , int pages){
		 super( BookId,  OwnerId, OwnName ,BookName ,Date);
		 Type="Literary";
		 this.pages=pages;
	 }// constructor for the buy 
     
	 public literary(int BookId, int OwnerId,String OwnName ,String BookName, String DateSta, String DateEnd, int pages) {
		 super( BookId,  OwnerId, OwnName ,BookName , DateSta, DateEnd);
		 Type="Literary";
		 this.pages=pages;
	 } // constructor for the Borrow

	 public String getType() {
		 return Type;
	 }


	 public void setType(String type) {
		 Type = type;
	 }
	   
     public double CalculPrice() {
    	 if (pages < 200) {
    		 return 100+50;
    	 }
    	 else
    	  return 100; 
     }
     
     // override
     public double CalculPrice( int numOfDay) {
    	 if (pages < 200) {
    		 return numOfDay*15;
    	 }
    	 else
    	  return 8*numOfDay; 
     }
     
     public String toString() {

	return "=== Arabic Book ===\n"
		+ super.toString()
		+ "\nType of Book: Literary" 
		+ "\nPages: " + pages
		+ "\nPrice: " + CalculPrice();
     }


	 
	
}
