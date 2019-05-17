public class StaticClass {//call from BoxTSA
    static int a = 10;
    static int b;


    static void meth(int st) {
        System.out.println("xsqr: " + (st * st));
        System.out.println(a);
        System.out.println(b);

    }
    static{
        b=8*a*a;
    }
    static void callMe(){
        System.out.println(a+" "+b);
    }

}