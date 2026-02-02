package assets.objects;

import assets.actors.Player;

public class Effect {
    
    private final int duration;
    private boolean isBlurry;
    private int healthBoost;

    // Konstruktor Effekt 1
    public Effect(int effectNumber) {
        switch (effectNumber) {
            case 1: // Gin
                this.duration = 10;
                this.isBlurry = true;
                this.healthBoost = 0;
                //Player.setVisison();
                break;
            case 2: // Beer
                this.duration = 5;
                this.isBlurry = false;
                this.healthBoost = 10; 
                //Player.setHealth();
                break;
            case 3: // Wine
                this.duration = 7;
                this.isBlurry = true;
                this.healthBoost = 5;
                //Player.setVision();
                //Player.setHealth();
                break;
            case 4: // Mysterydrink
                this.duration = 15;
                this.isBlurry = true;
                this.healthBoost = 0;
                //Player.setVision();
                break;
            default:
                throw new IllegalArgumentException("Invalid effect number");
        }
    }

    public void apply () {
        
    }
    
    public boolean isBlurry() {
        return isBlurry;
    }

    public int getHealthBoost() {
        return healthBoost;
    }
    
}
