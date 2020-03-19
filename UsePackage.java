package pkgpackage;


public class UsePackage {
    public static void main(String[] args) {
        Package pkg1 = new Package(1,'A');
        Package pkg2 = new Package(2,'T');
        Package pkg3 = new Package(3,'M');

        InsuredPackage pkg4 = new InsuredPackage(1,'A');
        InsuredPackage pkg5 = new InsuredPackage(2,'T');
        InsuredPackage pkg6 = new InsuredPackage(3,'M');
        
        System.out.println("Normal Packages : ");
        
        pkg1.print();
        pkg2.print();
        pkg3.print();
        
        System.out.println("-------------------------------");
        
        System.out.println("Insured Packages : ");
        
        pkg4.print();
        pkg5.print();
        pkg6.print();  
    }
}
