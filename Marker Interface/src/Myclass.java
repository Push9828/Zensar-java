//Clonable Interface Demo


class Num1 implements Cloneable

{

    public int a;

    public int b;

    @Override

    public String toString() {

        return "Num1 [a=" + a + ", b=" + b + "]";

    }

    

    public Object clone() throws CloneNotSupportedException 

    {

        return super.clone();

    }

    

}

public class Myclass {



    public static void main(String arg[]) throws CloneNotSupportedException 

    {

        Num1 obj = new Num1();

        obj.a=5;

        obj.b=7;

        System.out.println(obj);

        

        //Shalow copy creates the reference for the data in Heap memory

        Num1 obj2 = obj;

        System.out.println(obj2);

        obj2.a=10;

        System.out.println(obj);

        System.out.println(obj2);

        

        //Deep Copy creates the new copy of data in the Heap memory

        

        Num1 obj3 =new Num1();

        obj3.a = obj.a;

        obj3.b = obj.b;

        System.out.println(obj3);

        

        obj3.a=15;

        System.out.println(obj);

        System.out.println(obj3);

        

        //Clonning is used to combine both shallow and deep copy

        

        Num1 obj4 =(Num1) obj.clone();

        System.out.println(obj4);

    }
}