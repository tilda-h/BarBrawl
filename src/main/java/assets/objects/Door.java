
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Door extends GameAsset{
    
    boolean open;
    boolean locked;
    
    public Door(int x, int y, Image img, boolean locked) {
        super(x, y, img, "door");
        open = false;
        this.locked = locked;
        //Map.setNotWalkable(x, y, 2); // idea radius 2 around coords not walkable
    }

    public boolean isOpen() {
        return open;
    }
    
    public boolean isLocked() {
        return locked;
    }

    public void setOpen(boolean open) {
        if (!locked) {
            this.open = open;
            if (!open) {
                //Map.setNotWalkable(x, y, 2); // idea radius 2 around coords not walkable
            } else if(open) {
                //Map.setNotWalkable(x, y, 2); // INVERSE!!!!!
            }
        }
    }
    
    public void setLocked(boolean locked, boolean key) {
        if (!open || key) {
            this.locked = locked;
        } else {
            System.out.println("ya cant (un)lock an open door, and ya need a 0--> (key)");
        }
    }
    
    public void setOpenKick (boolean kickable) { // kickable .. player could need certain strength or other
        if (!open || kickable) {
            this.open = true; // unchangeable
            this.locked = false; // door now destroyed, hagrid style
        }
    }
    
}


// make door lockable, able to kick open