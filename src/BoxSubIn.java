public class BoxSubIn extends BoxSprInher {
    double cost;
    BoxSubIn(BoxSubIn ob){
        super(ob);
        cost=ob.cost;
    }
    BoxSubIn(int width,int depth,int height,int m,double c){
        super(width,depth,height,m);
        cost=c;
    }
    BoxSubIn(){
        super();
        cost=25;
    }
    int volume(){
      //  super.volume();
        return height*height*height;
    }
}
