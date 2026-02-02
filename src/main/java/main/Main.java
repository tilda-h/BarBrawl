/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

// imports (tilda)
import assets.objects.Drinks;
import assets.objects.drinkType;
import assets.objects.Chair;
import assets.objects.Door;

import java.awt.Image;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        
        // hier werden ausgeteilt
        
        
        
        
        // hier werden zwilling verglichen...
        
        
        // hier passiert alkohol, hoffe das ist gut so für merge (tilda)
        
        Image image = null; //delete!!

        Drinks glasWein = new Drinks(0, 0, image, "Weinglas",drinkType.WINE, 200);
        glasWein.drinkIt();
        glasWein.drinkIt();
        
        Chair Stuhl1 = new Chair(0,0,image);
        Stuhl1.throwIt(0);
        
        Door Tur1 = new Door(0,0,image);
        Tur1.open(true);

    }
}
