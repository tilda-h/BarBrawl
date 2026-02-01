
package assets.objects;

import assets.GameAsset;
import java.awt.Image;


public class Drinks extends GameAsset {
    
    drinkType type;
    int volume;
    
        
    public Drinks(int x, int y, Image img, String name, drinkType type, int volume) {
        super(x, y, img, name);
        this.type = type;
        this.volume = volume;
    }

    public int getAlcContent() {
        return volume * type.alcContent/100;
    }
    
    
    public void drinkIt() {
        if (this.volume != 0){
            this.volume = 0;
        Effect effect = type.effect;
        System.out.println("uf lecker");
        } else {
            System.out.println("aww man! Wer hat das denn ausgetrunken?!");
        }
    }
    
    // Create an Effect for the wine
    
    // spieler verändern: bildschirm schummerig, mehr health, mehr gespräch unlocked
    
}

