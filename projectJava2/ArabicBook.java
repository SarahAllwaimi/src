package projectJava2;

public  abstract class  ArabicBook extends Book {
	
	private String language;

	
  public ArabicBook (int BookId, int OwnerId,String OwnName ,String BookName , String Date ) {
	  super( BookId, OwnerId, OwnName , BookName, Date);
	  language="Arabic";
	  
  }// constructor for the buy 
  public ArabicBook (int BookId, int OwnerId,String OwnName ,String BookName , String DateSta, String DateEnd) {
	  super( BookId, OwnerId, OwnName , BookName,DateSta ,DateEnd);
	  language="Arabic";
	  
  }// constructor for the Borrow

  public String getLanguage() {
	return language;
  }

  public void setLanguage(String language) {
	this.language = language;
  }
  
// to use the method in the child 
  public  abstract double CalculPrice();
  
  public String toString() {
    return "=== Arabic Book ===\n"
           + super.toString()  // call the toString method from Book class
           + "\nLanguage: " + language;
          // + "\nPrice: " + CalculPrice();  --- in subclasses ---
	  
  }
    
  
}
