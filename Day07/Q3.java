package Day07;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String name;
    double price;

    Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    String getName(){
        return name;
    }

    double getPrice(){
        return price;
    }
}

class ShoppingCart{
    ArrayList<Product> p = new ArrayList<>();

    void addProduct(String name, double price){
        p.add(new Product(name, price));
        System.out.println(name + " added to cart.");
    }

    void removeProduct(String name){
        for(Product val : p){
            if(name.equalsIgnoreCase(val.getName())){
                p.remove(val);
                System.out.println(name + " removed from cart.");
                return;
            }
        }
        System.out.println(name + " not found in cart.");
    }

    double calculateTotalCost(){
        double sum=0;
        for(Product val : p){
            sum+=val.getPrice();
        }
        return sum;
    }

    void displayCart(){
        if(p.isEmpty()){
            System.out.println("Shopping cart is empty.");
            return;
        }

        System.out.println("Products in Cart:");
        for(Product val : p){
            System.out.println("- " + val.getName() + " : $" + val.getPrice());
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class Q3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;

        do{
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    cart.addProduct(name, price);
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeProduct(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }while(choice != 4);

        sc.close();
    }
}