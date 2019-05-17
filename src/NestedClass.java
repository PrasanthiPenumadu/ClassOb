public class NestedClass {
    int outer=100;
    void test(){
        for(int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("Outer accessible: "+ outer--);//accessing outer field from inner class
                }
            }Inner inOb=new Inner();//call inner method from outer by inner class object
            inOb.display();
        }
    }
}
