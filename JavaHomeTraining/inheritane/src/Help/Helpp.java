package Help;

public class Helpp {
    int a;
    String Name;
    String Classes;
    Double Salary;
    public Helpp(int a,String Name,Double Salary,String Class){
        this.a =a;
        this.Name = Name;
        this.Salary = Salary;
        this.Classes = Class;
    }
   protected void display(){
        System.out.println("Name is "+Name);
        System.out.println("Classes are "+Classes);
        System.out.println("Salary "+Salary);
        System.out.println(" number Entered "+a);
    }
}
