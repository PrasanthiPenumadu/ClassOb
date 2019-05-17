public class BoxSCInhrtM {
    public static void main(String args[]){
        int vol;
        Box bfirst=new Box();
        BoxSubIn ship=new BoxSubIn();
        BoxSubIn ship1=new BoxSubIn(ship);
        BoxSubIn ship2=new BoxSubIn(10,20,30,45,55);
        BoxSubIn or;//Dyn meth dis meth overriding

        BoxSprInher b1=new BoxSprInher();
        BoxSprInher b2=new BoxSprInher(b1);//clone
        BoxSprInher b3=new BoxSprInher(10,20,30,45);
        Box or1;//fist object
        or1=bfirst;
      int x= or1.volume();//using volume from Boc class
      System.out.println(x);
        vol=b1.volume();
        System.out.println(vol);
        System.out.println(b1.weight);
        System.out.println();
        vol=b2.volume();
        System.out.println(vol);
        System.out.println(b2.weight);
        System.out.println();

       or1=b3;
        vol=b3.volume();
        System.out.println(vol);
        System.out.println(b3.weight);
        System.out.println();

        vol=ship.volume();
        System.out.println(vol);
        System.out.println(ship.weight);
        System.out.println(ship.cost);
        System.out.println();

        vol=ship1.volume();
        System.out.println(vol);
        System.out.println(ship1.weight);
        System.out.println(ship1.cost);
        System.out.println();
        or1=ship2;
        vol=ship2.volume();
        System.out.println(vol);
        System.out.println(ship2.weight);
        System.out.println(ship2.cost);
        System.out.println();
    }
}
