package pkgpackage;
public class Package {
    
    public double weight;
    public char spMethod;
    public double price;
    
    public Package(double w,char s){
        this.weight = w;
        this.spMethod = s;
        totalCost();
    }
    
    public void totalCost(){
        if(weight <= 8){
            switch (spMethod) {
                case 'A':
                    price = 2;
                    break;
                case 'T':
                    price = 1.50;
                    break;   
                case 'M':
                    price = 0.50;
                    break;
            }
        }else if(weight <= 16){
            switch (spMethod) {
                case 'A':
                    price = 3;
                    break;
                case 'T':
                    price = 2.35;
                    break;
                case 'M':
                    price = 1.50;
                    break;
            }
        }else if(weight >= 17){
            switch (spMethod) {
                case 'A':
                    price = 4.50;
                    break;
                case 'T':
                    price = 3.25;
                    break;
                case 'M':
                    price = 2.15;
                    break;
            }
        }   
    }
    public double getPrice(){
        return price;
    }
    public void print(){
        System.out.println("");
        System.out.println("Weight : "+weight);
        System.out.println("Shipping Method : "+spMethod);
        System.out.println("Price : "+price);
        
    }
    
}
