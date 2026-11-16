import javax.swing.*;
import java.awt.*;
public class Product extends JPanel 
{
    private int productID;
    private String productName;
    private double cost;
    private String yearOfPublication;
    private String publishingHouse;

    /*public Product(int productID, String productName, float cost, String yearOfPublication, String publishingHouse){
    this.productID = productID;
    this.productName = productName;
    this.cost = cost;
    this.yearOfPublication = yearOfPublication;
    this.publishingHouse = publishingHouse;
    }*/

    public Product(int productID,String productName, double cost, String yearOfPublication, String publishingHouse){
        this.productID = productID;
        this.productName = productName;
        this.cost = cost;
        this.yearOfPublication = yearOfPublication;
        this.publishingHouse = publishingHouse;
    }

    public void setProductID(int productID){
        this.productID = productID;
    }

    public int getProductID(){
        return productID;        
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;        
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return cost;        
    }

    public void setYearOfPublication(String yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public String getYearOfPublication(){
        return yearOfPublication;        
    }

    public void setPublishingHouse(String publishingHouse){
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse(){
        return publishingHouse;        
    }
    }
