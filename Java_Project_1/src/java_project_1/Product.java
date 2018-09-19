
package java_project_1;


public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    
    public Product(int pid, String pname, float pprice, String pAddDate)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.addDate = pAddDate;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getDate()
    {
        return addDate;
    }
    
}
