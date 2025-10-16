package projectJava2;

public class English  extends Book {


	private int pages;
	private String language;
	

	public English (int BookId, int OwnerId,String OwnName ,String BookName ,String Date , int pages) {
	  super( BookId, OwnerId, OwnName , BookName, Date);
	  this.pages=pages;
	  language="English";
	  
  }// constructor for the buy 

	public English(int BookId, int OwnerId,String OwnName ,String BookName , String DateSta, String DateEnd, int pages) {
		super( BookId, OwnerId, OwnName , BookName,DateSta ,DateEnd);
		this.pages=pages;
		language="English";
	}// constructor for the Borrow
	
	  public double CalculPrice( int numOfDay) {
	    	 if (pages < 200) {
	    		 return numOfDay*25;
	    	 }
	    	 else
	    	  return 15*numOfDay; 
	     }
	  
	  public double CalculPrice() {
	    	 if (pages < 200) {
	    		 return 150+50;
	    	 }
	    	 else
	    	  return 150; 
	     }

		 public String toString() {
    return "=== English Book ===\n"
           + super.toString()  // call the toString method from Book class
           + "\nPages: " + pages
           + "\nLanguage: " + language
           + "\nPrice: " + CalculPrice();
		 }

}
