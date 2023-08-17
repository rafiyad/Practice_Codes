import java.util.Scanner;

public class MiniShoppingCard {
    public static void main(String[] args) {
        int itemNumber;
        String itemName;
        double itemPrice,itemQuantity,price,discount=0,netprice=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your item number");
        itemNumber=in.nextInt();
        in.nextLine();
        System.out.println("Please enter your item name");
        itemName=in.nextLine();
        System.out.println("Please enter your item price");
        itemPrice=in.nextDouble();
        System.out.println("Please enter your item quantity");
        itemQuantity=in.nextDouble();
        price=itemPrice*itemQuantity;

        if(price>=1000 && price<2000)
            discount=price*0.1;
        else if (price>=2000 && price<3000) {
            discount=price*0.15;
        }
        else if (price>=3000 && price<5000) {
            discount=price*0.2;
        }
        else if (itemPrice>=5000) {
            discount=price*0.25;
        }
        netprice=price-discount;
        System.out.println("Item number "+itemNumber+
                            " mname "+itemName+
                            " price "+price+
                            " discount "+discount+
                            " net price "+netprice);

    }
}
