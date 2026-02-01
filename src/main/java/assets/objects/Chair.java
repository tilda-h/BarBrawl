
package assets.objects;

import assets.GameAsset;
import assets.Throwable;
import java.awt.Image;

public class Chair extends GameAsset implements Throwable{
    
    public Chair(int x, int y, Image img) {
        super(x, y, img, "chair"); 
        //Map.setNotWalkable(x, y, 2); // idea radius 2 around coords not walkable (fin!!!)
    }

    @Override
    public void throwIt(int direction) { // what is direction?: sin / a
        int distance = 1;
        super.setX(getX()+direction*distance);
        super.setY(getY() + (int) Math.sqrt(Math.pow(distance, 2) + Math.pow(direction, 2))); // plus oder minus
    }
    
    
}
