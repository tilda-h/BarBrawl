/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets.objects;


public enum drinkType {
    // enum drinktypes
    GIN("Gin", 44, 1),
    BEER("Beer", 5, 2),
    WINE("Wine", 7, 3),
    MYSTERYDRINK("Mysterydrink", 80, 4);

    public final String name;
    public final int alcContent;
    public final int effect;

    // Konstruktor
    private drinkType(String name, int alcContent, int effect) {
        this.name = name;
        this.alcContent = alcContent;
        this.effect = effect;
    }
    
    
}
