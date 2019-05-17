public class BoxObj {
    public static void main(String args[]){
        Box mybox1=new Box(10,20,30);
        Box mybox2=new Box(11,22,33);
        int vol;
        int tsa;

        vol=mybox1.volume();
        System.out.println(vol);
        vol=mybox2.volume();
        System.out.println(vol);
       // tsa=mybox1.tsaCube();
    }
}
