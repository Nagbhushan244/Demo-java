 class Demojava{
    int a,b,res1,res2,res3,res4;
    public Demojava(int a,int b)
    {
        this.a=a;
        this.b=b;
        res1=a+b;
        res2=a-b;
        res3=a*b;
        res4=a/b;

        System.out.println("Addition Result:"+res1);
        System.out.println("Subtraction Result:"+res2);
        System.out.println("Multiplication Result:"+res3);
        System.out.println("Division Result:"+res4);

    }
}

public class Demo{
    public static void main(String[] args) {
        int a=10,b=10;
        Demojava d = new Demojava(a,b);
        
    }
}