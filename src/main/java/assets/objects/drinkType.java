/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets.objects;


public enum drinkType {
    // enum drinktypes
    GIN("Gin", 44, new Effect(10, true)),
    BEER("Beer", 5, new Effect(10, 10)),
    WINE("Wine", 7, new Effect(10, 10)),
    MYSTERYDRINK("Mysterydrink", 80, new Effect(15, true));

    public final String name;
    public final int alcContent;
    public final Effect effect;

    // Konstruktor
    private drinkType(String name, int alcContent, Effect effect) {
        this.name = name;
        this.alcContent = alcContent;
        this.effect = effect;
    }
    
    
}
