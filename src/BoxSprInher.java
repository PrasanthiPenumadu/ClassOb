public class BoxSprInher extends Box {
    double weight;
    BoxSprInher(int width,int depth,int height,int m){
        super(width,depth,height);
        weight=m;
    }
    BoxSprInher(BoxSprInher ob){
        super(ob);
        weight=ob.weight;
    }
    BoxSprInher(){
        super();
        weight=95;
    }
int volume(){
        return width+height+depth;
}
}