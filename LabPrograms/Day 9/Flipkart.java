public class Flipkart {
    // Clothes
    public static void clothes(String product, String companyName, String type, int quantity)
    {
        if((companyName.equals("Nike") || companyName.equals("Reebok"))  && ( type.equals("shoes") || type.equals("T-shirt")))
        {
            double price=buyNowForClothes(type,quantity);
            bill(product, companyName, type, quantity,price);
        }
        else{
            System.out.println("This product is not available");
        }
    }
    static double buyNowForClothes(String type,int quantity)
    {
        if(type.equals("T-shirt"))
        {
            double shirt=500,dis,tprice,total;
            total=shirt*quantity;
            dis=total*(10.0/100);
            tprice=total-dis;
            return tprice;
        }
        else if(type.equals("shoes"))
        {
            double shoe=1000,dis,tprice,total;
            total=shoe*quantity;
            dis=total*(10.0/100);
            tprice=total-dis;
            return tprice;
        }
        else {
            return 0;
        }
    }
    static void bill(String product, String companyName,String type,int quantity,double price)
    {
        System.out.println();
        System.out.println("=================Zudio===================");
        System.out.println("The name of the product : "+product);
        System.out.println("The name of the company : "+companyName);
        System.out.println("The type of the product : "+type);
        System.out.println("The quantity of the product : "+quantity);
        System.out.println("The total price after discount : "+price);
    }



    // Mobiles
    public static void mobile(String product, String companyName, int quantity)
    {
        if(product.equals("phone") && (companyName.equals("Apple") || companyName.equals("Samsung")))
        {
            double price=buyNowForMobile(companyName, quantity);
            bill(product, companyName, quantity, price);
        }
        else{
            System.out.println("This product is not available");
        }
    }

    public static double buyNowForMobile(String companyName,int quantity)
    {
        if(companyName.equals("Apple"))
        {
            double apple=40000,dis,tprice,total;
            total=apple*quantity;
            dis=total*(20.0/100);
            tprice=total-dis;
            return tprice;
        }
        else if(companyName.equals("Samsung"))
        {
            double sams=30000,dis,tprice,total;
            total=sams*quantity;
            dis=total*(25.0/100);
            tprice=total-dis;
            return tprice;
        }
        else {
            return 0;
        }
    }

    static void bill(String product, String companyName,int quantity,double price)
    {
        System.out.println();
        System.out.println("==============Mobile Store===============");
        System.out.println("The name of the product : "+product);
        System.out.println("The name of the company : "+companyName);
        System.out.println("The quantity of the product : "+quantity);
        System.out.println("The total price after discount : "+price);
    }

    public static void main(String[] args) {
        Flipkart fk=new Flipkart();
        fk.clothes("clothes", "Nike", "shoes", 2);
        fk.mobile("phone", "Apple", 2);
    }

}


/*


=================Zudio===================
The name of the product : clothes
The name of the company : Nike
The type of the product : shoes
The quantity of the product : 2
The total price after discount : 1800.0

==============Mobile Store===============
The name of the product : phone
The name of the company : Apple
The quantity of the product : 2
The total price after discount : 64000.0
 */