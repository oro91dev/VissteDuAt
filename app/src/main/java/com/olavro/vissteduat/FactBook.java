package com.olavro.vissteduat;

import java.util.Random;

public class FactBook {
    private String[] facts = {
            "I Asia finnes det en slange, Chrysopelea paradisi, som kan fly gjennom lufta i rundt 40 kilometer i timen.",
            "Hakkespetten kan dunke nebbet inn i en trestamme 20 ganger i sekunder.",
            "Noen fisker kan smake med hele kroppen fordi de har smaksceller i skinnet.",
            "Multibev AS har fått tillatelse å distribuere Dr.Pepper i Norge",
            "Gresshopper inneholder cirka 20% protein ",
            "Fugler kan ikke svette",
            "Flodhesten kan sove under vann",
            "Ikke alle marihøner har prikker",
            "Om natta sover noen papegøyefisker i en pose av slim som de har laget selv ",
            "Kiwi inneholder dobbelt så mye C-vitamin som appelsin",
            "Faren til et muldyr er et esel, mens moren er en hest! ",
    "NLA ikke står for noe"};

    String getFact() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
