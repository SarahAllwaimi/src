package projectJava2;

public  abstract class  Book   {
	 
	private String BookName ;
	private String OwnName;
	private int BookId;
	private int OwnerId;
	private String  Date ;
	private String DateEnd="";
	
	protected boolean available;
	
	public Book (int BookId, int OwnerId,String OwnName ,String BookName , String Date ) {
		
		this.BookName=BookName;
		this.OwnName=OwnName ;
		this.BookId=BookId;
		this.OwnerId=OwnerId;
		this.Date=Date;
		this.available=true;
		
		
		}// constructor for the buy 
	
    public Book (int BookId, int OwnerId,String OwnName ,String BookName , String DateSta ,String DateEnd ) {
    	this.BookName=BookName;
		this.OwnName=OwnName ;
		this.BookId=BookId;
		this.OwnerId=OwnerId;
		this.Date=DateSta;
		this.DateEnd=DateEnd;
		this.available=true;
	}// constructor for the Borrow
   
    	
    	
    	
    	
    	public void borrowBook() {
    	if(available) {
    		available=false;
    		System.out.println(BookName+"has been borrowed");
    	}
    	else {
    		System.out.println(BookName+"is not available");
    	}
    		
    		
    	}

    	public void returnBook() {
    		available=true;
    		System.out.println(BookName+"has been returned");
    	}
    	
    	
    
    	public boolean isAvailable() {
    		return available;
    	}
    	
	
	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getOwnName() {
		return OwnName;
	}

	public void setOwnName(String ownName) {
		OwnName = ownName;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public int getOwnerId() {
		return OwnerId;
	}

	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDateEnd() {
		return DateEnd;
	}
	public void setDateEnd(String dateEnd) {
		DateEnd = dateEnd;
	}


	public abstract double CalculPrice();

	public abstract double CalculPrice(int numOfDay);

	public String toString() {
    
	
	  String str = "----------------------------------------\n*Owner Information*"+
	 "\nOwner ID: " +  getOwnerId() +"\n" +
     "\nOwner Name: " + getOwnName() + "\n" +
	 "\nDate: " + getDate() +"\n" +
		"----------------------------------------\n*Book Information*"+
	    "Book ID: " + getBookId() +"\n" +
        "\nBook Name: " + getBookName() + "\n";

		// Include end date only if it's not empty so that it doesn't show for purchased books
		 if (getDateEnd() != null && !getDateEnd().isEmpty()) {
            str += "End Date: " + getDateEnd() + "\n";
        }
        
        str += "Available: " + (available ? "Yes" : "No");
        return str;
    }
        
}


	

