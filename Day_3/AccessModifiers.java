package Day_3;


class B{
    public void f1(){
        System.out.println("Public method executed");
    }

    private void f2(){
        System.out.println("Private Method executed");
    }

    protected void f3(){
        System.out.println("Protected Method executed");
    }

    void f4(){
        System.out.println("Default Method executed");
    }

}

public class AccessModifiers {

    public static void main(String []args){
        B obj = new B();

        obj.f1();
       // obj.f2(); private method cannot be accessed from outside the class
        obj.f3();
        obj.f4();
    }

}
