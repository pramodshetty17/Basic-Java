public class Vehicle{

     Vehicle(String brand,int cost) {
        System.out.println("Brand:"+brand+" Cost:"+cost);
    }
     Vehicle(String brand) {
        System.out.println("Brand:"+brand);
    }
     Vehicle(String brand,String fuel) {
        System.out.println("Brand:"+brand+", Fuel Type:"+fuel);
    }
     Vehicle(int cost,String brand) {
        System.out.println("Brand:"+brand+" Cost:"+cost);
    }

    public static void main(String[] args) {
        
        Vehicle v1=new Vehicle("BMW",15000);
         Vehicle v2=new Vehicle("Audi");
          Vehicle v3=new Vehicle("Rolls Royce","Petrol");
           Vehicle v4=new Vehicle(190992029,"Thar");
    }
    
}