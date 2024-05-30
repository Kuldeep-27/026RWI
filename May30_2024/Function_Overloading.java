package May30_2024;

class Sum{

    void sum(int a,int b)
    {
        System.out.println("Sum is " +(a+b));
    }
    void sum(int a,int b,int c)
    {
        System.out.println("Sum is " +(a+b+c));
    }
    void sum(float a,float b){
        System.out.println("Sum is " + (a + b));
    }

}
public class Function_Overloading {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(3,5);
        s.sum(3,4,5);
        s.sum(4.55f,3.98f);
    }
}
