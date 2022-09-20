package mentorAssignment;

 public class PolymorphismExample {

    public static void display(){
        System.out.println("HII Zerome");
    }

}

 class Test extends PolymorphismExample{

    public static void display(){
        System.out.println("Hi ZEROME im test");
    }

     public static void display(int a){
         System.out.println("Hi ZEROME im test  @" + a);
     }

 }


class solution {
    public static void main(String[] args) {
        Test.display();
        Test.display(5);
        PolymorphismExample.display();
    }
}