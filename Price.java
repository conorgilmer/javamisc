public class Price {

String name;
double cost;
double price;
double vatRate;


public Price (String n, double c) {
 name = n;
 price = c;
 cost = c;
 vatRate = 0;
}

public Price (String n, double c, double rate) {
 name = n;
 price = c + (c * (rate/100));
 vatRate = rate;
 cost = c;
}


public void printRec() {

System.out.println("Receipt for  " + name +"\n");
System.out.println("Cost = " + cost +  "\n");
System.out.println("VAT Rate = " + vatRate +  "\n");
System.out.println("Price = " + price +  "\n");

}

}
