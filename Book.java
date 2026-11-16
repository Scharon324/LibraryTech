public class Book extends Product
{
    private String author;
    private String ISBN ;
    private int NrOfPages;
   public Book(int productID,String productName, double cost, String yearOfPublication,String publishingHouse, String author, String ISBN, int NrOfPages ){
       super( productID, productName,cost,  yearOfPublication, publishingHouse);
       this.author = author;
       this.ISBN = ISBN;
       this.NrOfPages = NrOfPages;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
   
    public String getAuthor(){
        return author;
    }
    
        public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
   
    public String getISBN(){
        return ISBN;
    }
    
        public void setNrOfPages(int NrOfPages){
        this.NrOfPages = NrOfPages;
    }
   
    public int getNrOfPages(){
        return NrOfPages;
    }

}