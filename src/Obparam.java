public class Obparam {//Test.java
    public static void main(String args[]) {
        final int NUM=125;
       int a=10,b=20;
        Test ob=new Test(150,25);
        Test ob1=new Test(10,20);
        Test ob3=new Test(2);
        System.out.println(ob.a+" "+ob.b);
        ob.meth(ob);//call by ref
        System.out.println(ob.a+" "+ob.b);
        System.out.println(ob1.a+" "+ob1.b);
        ob1.meth(a,b);//call by val
        System.out.println(ob1.a+" "+ob1.b);
        System.out.println(ob3.a+" "+ob3.a);
        System.out.println(NUM);
    }
}
