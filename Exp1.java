class Product{
    String pcode,pname;
    int price;
    public Product()
    {
    }
  public Product(String pid,String name,int cost)
  {
this.pcode= pid;
this.pname= name;
this.price= cost;
  } 
  public int getprice(){
    return price;
  } 
  public void display(){
    System.out.println("product code="+this.pcode);
    System.out.println("product name="+this.pname);
    System.out.println("price="+this.price);
  }
}
public class Exp1{
    public static void main(String[] args){
        Product p1= new Product("kl","suzuki",500000 ); 
        p1.display();
        Product p2= new Product("KA","TATA",600000);
        p2.display();
        Product p3= new Product("Dl","hyundai",700000);
        p3.display();
       
        Product Lp= p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
        System.out.println("lowest price=");
        Lp.display();

        Product p4= new Product();
        p4.pcode="333";
        p4.pname="kia";
        p4.price= 500000;
        p4.display();

    }
    
}