package assets.objects;

import assets.actors.Player;

public class Effect {
    
    private final int duration;
    private boolean isBlurry;
    private int healthBoost;

    // Konstruktor Effekt 1
    public Effect(int duration, boolean isBlurry) {
        this.duration = duration;
        this.isBlurry = isBlurry;
        this.healthBoost = 0; 
        
        //Player.setVision();
        
        System.out.println("Careful! Blurry Vision! Dont stub your toe!");
    }

    // konstruktor Effekt 2
    public Effect(int duration, int healthBoost) {
        this.duration = duration;
        this.isBlurry = false; 
        this.healthBoost = healthBoost;
        
        //Player.setHealth();
        
        System.out.println("Wow! Drugs are good for you! Health-Boost!");
    }
    
    public boolean isBlurry() {
        return isBlurry;
    }

    public int getHealthBoost() {
        return healthBoost;
    }
    
}
