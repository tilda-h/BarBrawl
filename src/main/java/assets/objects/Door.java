
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Door extends GameAsset{

    private DoorState state;

    public enum DoorState {
        CLOSED,
        OPEN,
        KICKED_IN
    }
    
    // Konstruktor Tür
    public Door(int x, int y, Image img) {
        super(x, y, img, "door");
        this.state = DoorState.CLOSED;
        //Map.setNotWalkable(x, y, 2);
    }

    public DoorState getState() {
        return state;
    }

    // Funktion Öffnen/Schließen
    public void open(boolean hasKey) {
        if (state == DoorState.CLOSED && hasKey) {
            state = DoorState.OPEN;
            //Map.setWalkable(x, y, 2);
            System.out.println("Hereinspaziert");
        } else if (state == DoorState.OPEN && hasKey) {
            state = DoorState.CLOSED;
            //Map.setNotWalkable(x, y, 2);
            System.out.println("die Tür ist zu");
        } else if (!hasKey) {
            System.out.println("Kein Schlüssel, kein Zugang");
        }
    }

    // Funktion Eintreten
    public void kickIn() {
        if (state != DoorState.KICKED_IN) {
            state = DoorState.KICKED_IN;
            //Map.setWalkable(x, y, 2);
            System.out.println("Die Tür ist weg (Könnte 'ne Tasse Tee vertragen. War keine leichte Reise...)");
        } else {
            System.out.println("man kann die tür nicht zwei mal eintreten");
        }
    }

    
}