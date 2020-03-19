package pkgpackage;


public class InsuredPackage extends Package{
    public InsuredPackage(double weight, char type) {
        
        super(weight, type);
        add();
        
    }
    public void add(){
        double cost = super.price;
        
        if(cost <=1 ){
            super.price+=2.45;
            
        }else if(cost <= 3){
            super.price+=3.95;
            
        }else if(cost >=3.01){
            super.price+=5.55;
        }
    }
}
