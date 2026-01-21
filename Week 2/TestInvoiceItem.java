public class TestInvoiceItem {
    public static void main(String[] args)
    {
        InvoiceItem FirstInvoice = new InvoiceItem("1","First Item",10, 50.50);
        System.out.println(FirstInvoice);
        System.out.println(FirstInvoice.getTotal());
        System.out.println(InvoiceItem.invoiceCount);
        InvoiceItem SecondInvoice = new InvoiceItem("2","Second Item",5, 5.50);
         System.out.println(InvoiceItem.invoiceCount);

    }
}
