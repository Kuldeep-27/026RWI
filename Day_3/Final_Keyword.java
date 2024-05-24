package Day_3;



final class A{
    final int a = 5;

    final void getA(){
        System.out.println("a = "+ a);

    }
}


public class Final_Keyword {
    public static void main(String []args){
        A obj1 = new A();
        obj1.getA();
    }
}
