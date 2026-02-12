class Human{
//     private int age=11;
//    private String name="Asha";
//     public int getAge()
//     {
//         return age;
//     }
//     public String getName(){
//         return name;
//     }
  public Human(){//default
    //constructor will be called everytime a object is created now lets create 2nd objet obj1 in contructor will print 2 time
    // System.out.println("in constructor");
    age=12;
    name="john";

  }
  public Human(int a ,String n){//parameterized
    age=a;
    name=n;
  }
 private int age;
 private String name;
  public void setAge(int a){
    age=a;
  }
 public int getAge()
    {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setNmae(String n){
        name=n;
    }

}
public class demo {
    public static void main(String args[]) {
        //for encapsulation hiding we are  protecting by using private.. so we can use those variables only by using  method which will be in same cls to access or defien value we will use object and pass value through method so we are combining both variable and method so its encapsulation
        Human obj=new Human();
        Human obj1=new Human(18,"johncc");
    //    obj.setAge(30);
      
    //    obj.setNmae("Ashaa");
        System.out.println(obj.getAge()+": "+obj.getName());
        System.out.println(obj1.getAge()+": "+obj1.getName());
    }
}
