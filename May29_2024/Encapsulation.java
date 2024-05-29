package May29_2024;


class Complex{
    private int real,img;
    Complex(int real,int img){
        this.real = real;
        this.img = img;
    }

    void setReal(int real){
        this.real = real;
    }
    void setImg(int img){
        this.img = img;
    }
    public String toString(){
        return real + "+" + img + "i";
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Complex c1 = new Complex(2,3);

        System.out.println(c1);
    }
}
