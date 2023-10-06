package Billing;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
    public static void main(String args[]){
        ArrayList items=new ArrayList();
        Scanner scanner=new Scanner(System.in);
        double total=0;
        double subTotal=0;
        double tax=0;
        double discount=0;
        double finalTotal=0;
        System.out.println("supermarket Billing System");
        System.out.println("Enter the item details");
        while(true){
            System.out.println("Enetr the item name");
            String itemName=scanner.next();
            if(itemName.equalsIgnoreCase("Exit")){
                break;
            }
            System.out.println("Enter item quantity:");
            int itemQuantity=scanner.nextInt();
            System.out.println("Enter the price:");
            double itemPrice=scanner.nextDouble();
            Item item=new Item(itemName,itemQuantity,itemPrice);
            items.add(item);
            subTotal+=itemQuantity*itemPrice;
            System.out.println("Item:"+itemName+"Quantity:"+itemQuantity+"Price:"+itemPrice);
 }
 System.out.println("Enter the tax rate:");
 double taxRate=scanner.nextDouble();
 tax=(taxRate*subTotal)/100;
 System.out.println("Enetr the discount amount:");
 discount =scanner.nextDouble();
 finalTotal=subTotal+tax-discount;
 System.out.println("Subtotal:"+subTotal);
 System.out.println("Tax:"+tax);
 System.out.println("Discount"+discount);
 System.out.println("Total"+finalTotal);
        
    }
    
}
class Item{
    private String name;
    private int quantity;
    private double price;
    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

