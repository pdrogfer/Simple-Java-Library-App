package com.pgf.libraries;


/* This is a custom Java library to show how to create and include your own libraries in your
* Android projects. For simplicity, it has only one class and one method 'getJoke()'. In this
* project, it is used in MainActivity inside app module
*/

public class JokeSmith {

    private String joke = "El rey le expulsó de España a Quevedo, ...";
            /* y le prohibió volver a pisar tierra\n" +
            "española. y se fue a Portugal. Y cargó un carro de tierra y se sentó encima de\n" +
            "la tierra. Y al pasar por el palacio, se puso de pie en el carro. Y entonces el\n" +
            "rey dice que cómo tenía valor de volver a España habiéndole prohibido que\n" +
            "pisara tierra española. Dice:\n" +
            "–Perdone Su Majestad, pero yo vengo pisando tierra portuguesa.";
            */

    public String getJoke() {
        return joke;
    }
}