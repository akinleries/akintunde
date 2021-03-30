package ChapterFour;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice(45.0, "laptop", 4, "five packs");

        invoice.setPrice(60000.0);
        invoice.description("Iphone 300");
        invoice.setQuantityOfItemPurchased(5);
        invoice.setNumber("5brands");


        System.out.println("Total cost is    :  " + "$" + invoice.getInvoiceAmount() + "\n");
        System.out.println("Description      :  " + invoice.getDescription() + "\n");
        System.out.println("Quantity of item :  " + invoice.getQuantityOfItemPurchased() + "pcs" + "\n");
        System.out.println("Number of Item   :  " + invoice.getNumber());
    }
}
