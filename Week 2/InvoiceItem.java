public class InvoiceItem {
    //Instance variables 
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    private static int invoiceCount = 0; 

    //Constructor
    public InvoiceItem(String id, String dsc, int quantity, double unitPrice)
    {
   
        this.id = id;
        this.desc = dsc;
        this.qty = quantity;
        this.unitPrice = unitPrice;
        invoiceCount++;
    }
    public InvoiceItem(InvoiceItem InI)
    {
        this.id = InI.id;
        this.desc = InI.desc;
        this.qty = InI.qty;
        this.unitPrice = InI.unitPrice;
        invoiceCount++;
    }
    public String getId()
    {
        return this.id;
    }
    public String getDesc()
    {
        return this.desc;
    }
    public int getQty()
    {
        return this.qty;
    }
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    public double getUnitPrice()
    {
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
    public double getTotal()
    {
      
        return (this.unitPrice * (double)this.qty);
    }
    public String toString()
    {
        return ("InvoiceItem[id=" + this.id + ", Desc = " + this.desc + ", qty = " + this.qty + " , Unitprice = " + this.unitPrice + "]" );
    }
    
    //static method
    public static void displayCount()
    {
        System.out.println(invoiceCount);
    
    }
}
