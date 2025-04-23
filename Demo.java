 class Demojava{
    int a,b,res1,res2;
    public Demojava(int a,int b)
    {
        this.a=a;
        this.b=b;
        res1=a+b;
        res2=a-b;

        System.out.println("Addition Result:"+res1);
        System.out.println("Subtraction Result:"+res2);

    }
}

public class Demo{
    public static void main(String[] args) {
        int a=10,b=10;
        Demojava d = new Demojava(a,b);
        
    }
}