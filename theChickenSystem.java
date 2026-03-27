
package chicken;
public class theChicken {
  private int id ; 
  private double weight ; 
  static  double dailyPrice=5  ; 
    static  double necessaryWeight=1.2  ; 
    
  public theChicken (int id , double weight ){
        this.id=id ;
         this.weight=weight ;        
    }
  
  public int getId ( ){
      return id;  
  }
  
   public double getWeight (  ){
      return weight ;  
  }
  
 public void setId (int id){
     this.id = id ; 
 } 
  
  public void setWeight  (double weight){
     this.weight = weight ; 
 }  
  
  public static void setDailyPrice  (double dailyPrice){
     theChicken.dailyPrice = dailyPrice ; 
 }  
  public static double getDailyPrice  (){
    return dailyPrice; 
 }   


public static void setNecessaryWeight(double necessaryWeight) {
    theChicken.necessaryWeight = necessaryWeight;
}

public static double getNecessaryWeight() {
    return necessaryWeight;
}
  
 public double price() {
    double price = 0;
    if (canMarket()) {
        price = weight * dailyPrice;
    }
    return price;
}
  public boolean canMarket() {
    return weight >= necessaryWeight;
}
 public void ChikenDisplay(){
    System.out.println("the chicken id is :"+id);
     System.out.println("the weight is "+weight );
    if (canMarket()) {
        System.out.println("Ready for market. Price: " + price());
    } else {
        System.out.println("Don't have the necessary weight");
    }
}
} 
  
  
  
  

