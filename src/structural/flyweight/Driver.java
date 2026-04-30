package structural.flyweight;
/*
In FlyWieght Pattern the focus is on sharing as much as possible with similar object and minimizing the memory usage.
In this case the TreeType is shared. It's the common thing and can be treated as Intrinsic State.
But In forest class Tree object is context specific and each tree has their own properties like location(x,y coordinate).
 */
public class Driver {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Planting 1 million trees
        for(int i = 0; i < 1000000; i++) {
            forest.plantTree(i, i, "Oak", "Green", "Rough");
        }

        System.out.println("Planted 1 million trees.");
    }
}
