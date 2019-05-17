public class Box {
    int width;
    int depth;
    int height;
 int volume(){
        return width*height*depth;
    }
     int tsaCube () {
        return 2 * ((width * width) + (height * height) + (depth * depth));
    }
    Box(int width,int depth,int height){//using Constructor instead of method setDim to set prop of ob
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    Box(Box ob){//using Constructor instead of method setDim to set prop of ob
    width=ob.width;
    height=ob.height;
    depth=ob.depth;
    }
    Box(){
     width=5;
     height=7;
     depth=10;
    }
   /* void setDim(int w,int d,int h){//to pass the parameters when you call from the object set variables
        width=w;
        height=h;
        depth=d;

    }*/
}
