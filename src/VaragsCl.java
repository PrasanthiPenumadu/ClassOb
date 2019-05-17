public class VaragsCl {

  static void test(int...v){
        System.out.print("Int :No.of args"+v.length+"contents:");
        for(int x:v){
            System.out.print(x+" ");


        }System.out.println();
    }
   static  void test(boolean...v){
        System.out.print("Boolean :No.of args"+v.length+"contents:");
        for(boolean x:v){
            System.out.print(x+" ");

        } System.out.println();
}

    static void test(String m,int...v) {
        System.out.print("Boolean :No.of args"+ m + v.length + "contents:");
        for (int x : v) {
            System.out.print(x + " ");

        }  System.out.println();
    }

    public static void main(String args[]){
        test(1,2,3,4,5);
        test(true,false,true);
        test("Testing:" ,1,2);

    }
}
