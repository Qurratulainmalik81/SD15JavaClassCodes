public class TestInvoiceItem {
    public static void testMethod()
    {
        //
    }
    public void Instancemethod()
    {}
    public static void main(String[] args)
    {
        testMethod();//static method can be called like this when its in the same class. 
       // Instancemethod();// need an object reference to call it
        InvoiceItem FirstInvoice = new InvoiceItem("1","First Item",10, 50.50);
        System.out.println(FirstInvoice);
        System.out.println(FirstInvoice.getTotal());
      //  System.out.println(InvoiceItem.invoiceCount);
        InvoiceItem.displayCount();
       
        InvoiceItem SecondInvoice = new InvoiceItem("2","Second Item",5, 5.50);
        // System.out.println(InvoiceItem.invoiceCount);
         InvoiceItem.displayCount();

    }
}

