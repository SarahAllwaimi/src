package projectJava2;

 class Library {
	
private String name;
private String location;
public  Book[] Buy;
public   Book[] Borrow;
private int numBorrowed;
private int numBooks;

//Constructor
public Library(String name ,String location ) {
	
	this.name=name;
	this.location=location;
	this.Buy=new Book[100];
	numBooks=0;
	this.Borrow=new Book [100];
	numBorrowed=0;
}
//add book(aggregation)
public boolean addBook(Book book) {
	if(numBooks<Buy.length) {
		Buy[numBooks]=book;
		numBooks++;
		return true;
	}
	return false;	
}

public boolean addBorrow(Book b) {
if(numBorrowed < Borrow.length && b.isAvailable()) {
	Borrow[numBorrowed]=b;
    numBorrowed++;
b.borrowBook();
return true;

	
}
return false;	
	
	
}

//Return book by id
public boolean returnBook(int id) {
for(int i=0;i<numBorrowed;i++) {
	if(Borrow[i].getBookId()==id) {
		Borrow[i].returnBook();
		//shifting to delete the book from the borrowed array
		Borrow[i]=Borrow[numBorrowed-1];
		numBorrowed--;
		Borrow[numBorrowed]=null;
		return true;
	}
}
return false;	
}

//Remove Book by id
public boolean removbook(int id) {
// first we should check if the book is borrowed or not
	for(int i=0;i<numBorrowed;i++) {
	if(Borrow[i].getBookId()==id){
		//The book is currently borrowed and cannot be removed.
		return false;
	}
	}
for(int i=0;i<numBooks;i++) {
if(Buy[i].getBookId()==id)	{
	Buy[i]=Buy[numBooks-1];
numBooks--;
Buy[numBooks]=null;
return true;
}		
}
return false;	
}



//Search book by id
public Book searchBook(int id) {
	for(int i=0 ;i<numBooks ;i++) {
		if(Buy[i].getBookId()==id)
		return Buy[i];
	}//for Buy
		for(int i=0 ;i<numBorrowed ;i++) {
			if(Borrow[i].getBookId()==id)
			return Borrow[i];
		}//for Borrow
			return null;
}



//get all available books
public Book[] getAllAvailable() {
	
Book[]	list =new Book[numBooks];
int j=0;
for(int i=0 ;i<numBooks;i++) {
if(Buy[i].isAvailable())	
	list[j++]=Buy[i];
}
return list;	
}


//count available books
public int countAvailable() {
int count=0;
for(int i=0; i<numBooks;i++) {
	if(Buy[i].isAvailable())
		count++;
}
	return count;
}

public  void   ToDisplayEnglisg(  Book Buy [],Book  Borrow [],  int countBr, int countBu) {
	  
	   int toCount=0;// to count it's not null 
	  
	  
	  for (int i=0;i<countBr;i++) {
   	  if ( Borrow[i] instanceof English  )
   		 toCount++;
   	  }
   	  for (int i=0;i<countBu;i++) {
       	  if ( Buy[i] instanceof  English )
       		  toCount++;    
       	  }   
   	  
   	  
	  for (int i=0;i<countBr;i++) {
	  if ( Borrow[i] instanceof English )
		  System.out.print(Borrow[i].toString());
	  }
	  for (int i=0;i<countBu;i++) {
  	  if ( Buy[i] instanceof English )
  		  System.out.print(Buy[i].toString());       

  	  }
  	  
}
public  void   ToDisplayLiterary(  Book Buy [],Book Borrow [],  int countBr, int countBu) {
	  
    int toCount=0;// to count it's not null 
	  
	  
	  for (int i=0;i<countBr;i++) {
   	  if ( Borrow[i] instanceof literary )
   		 toCount++;
   	  }
   	  for (int i=0;i<countBu;i++) {
       	  if ( Buy[i] instanceof literary )
       		  toCount++;    
       	  }
   	  
   if(toCount!=0) {  
   	
	  for (int i=0;i<countBr;i++) {
	       if ( Borrow[i] instanceof literary )
		       System.out.print(Borrow[i].toString());   
	           }
	  
	  for (int i=0;i<countBu;i++) {
   	    if ( Buy[i] instanceof literary )
   		   System.out.print(Buy[i].toString());     
	            }
	 
       }// the clode of the if 
   else 
		  System.out.println("all the Book is available for the Arabic literary ");

 }
public void   ToDisplayScientific( Book  Buy [],Book  Borrow [],  int countBr, int countBu) {
	  
	  int toCount=0;// to count it's not null 
	  
	  
	  for (int i=0;i<countBr;i++) {
  	  if ( Borrow[i] instanceof Scientific )
  		 toCount++;
  	  }
  	  for (int i=0;i<countBu;i++) {
      	  if ( Buy[i] instanceof Scientific )
      		  toCount++;    
      	  }
  	  
  	  
	 if(toCount!=0) {
	    for (int i=0;i<countBr;i++) {
	        if ( Borrow[i] instanceof Scientific )
		        System.out.print(Borrow[i].toString());
	              }
	    
	    for (int i=0;i<countBu;i++) {
  	    if ( Buy[i] instanceof Scientific )
  		     System.out.print(Buy[i].toString());       
  	          }
	      }// close for the if 
	   else
		   System.out.println("all the Book is available for the Arabic Scientific ");
}
public   int getNumBorrowed() {
	return numBorrowed;
}
public void setNumBorrowed(int numBorrowed) {
	this.numBorrowed = numBorrowed;
}
public int getNumBooks() {
	return numBooks;
}
public void setNumBooks(int numBooks) {
	this.numBooks = numBooks;
}


}
