public class Software extends Product
{
    private String CPU;
    private String OS;
    private int RAM;
    public Software(int productID,String productName, double cost, String yearOfPublication, String publishingHouse, int RAM,String CPU,String OS){
        super( productID, productName,cost,  yearOfPublication, publishingHouse);
        this.RAM = RAM;
        this.CPU = CPU;
        this.OS = OS;
    }

    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public int getRAM(){
        return RAM;
    }

    public void setCPU(String CPU){
        this.CPU = CPU;
    }

    public String getCPU(){
        return CPU;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public String getOS(){
        return OS;
    }
}
