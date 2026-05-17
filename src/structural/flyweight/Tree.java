package structural.flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeType treetype;

    public Tree(int x,int y,TreeType treetype){
        this.x = x;
        this.y = y;
        this.treetype = treetype;
    }
    void draw(){
        treetype.draw(x,y);
    }
}
