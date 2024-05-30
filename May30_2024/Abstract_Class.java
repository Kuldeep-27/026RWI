package May30_2024;

abstract class A{
    int a,b;
    A(int a ,int b){
        this.a = a;
        this.b = b;
    }

    abstract void display();


}

class B extends A{
    B(int a,int b){
        super(a,b);
    }

    void display(){
        System.out.println("a = " + a + " , " + "b = " + b);
    }


}

public class Abstract_Class {
    public static void main(String[] args) {
        A a = new B(2,3);
        a.display();

    }
}
