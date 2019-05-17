public class Test {//Obparam.java
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    Test (int i){
        a=i;
    }
    void meth(int i,int j){//call by val
        i=i*2;
        j=j*2;
    }
    void meth(Test o){//call by ref
        o.a=o.a*2;
        o.b=o.b/2;
    }
    Test incr(){
        Test temp=new Test(a+10);
        return temp;
    }
}
