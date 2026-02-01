package assets.objects;

import assets.actors.Player;

public class Effect {
    
    private int duration;
    private boolean isBlurry;
    private int healthBoost;

    public Effect(int duration, boolean isBlurry) {
        this.duration = duration;
        this.isBlurry = isBlurry;
        this.healthBoost = 0; 
        
        //Player.setVision();
        
    }

    public Effect(int duration, int healthBoost) {
        this.duration = duration;
        this.isBlurry = false; 
        this.healthBoost = healthBoost;
        
        //Player.setHealth();
    }

    public boolean isBlurry() {
        return isBlurry;
    }

    public int getHealthBoost() {
        return healthBoost;
    }
    
}
