
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Drinks extends GameAsset {
    
    drinkType type;
    int volume;
    
    // Konstruktor
    public Drinks(int x, int y, Image img, String name, drinkType type, int volume) {
        super(x, y, img, name);
        this.type = type;
        this.volume = volume;
    }

    // for the future
    public int getAlcContent() {
        return volume * type.alcContent/100;
    }
    
    // Funktion trinken
    public void drinkIt() {
        if (this.volume != 0){
            this.volume = 0;
        //type.effect.apply();
        System.out.println("uf lecker");
        } else {
            System.out.println("aww man! Wer hat das denn ausgetrunken?!");
        }
    }
        
}

