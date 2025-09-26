/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author joshy
 */
public class Coche {
    // ATRIBUTOS
    String chofer;
    String copiloto;
    String traseroIzq;
    String traseroDer;

    // CONSTRUCTORES
    public Coche() {
    }

    public Coche(String chofer, String copiloto, String traseroIzq, String traseroDer) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.traseroIzq = traseroIzq;
        this.traseroDer = traseroDer;
    }

    // MÉTODO donde cada ocupante se presenta
    public void presentarse() {
        System.out.println("Soy " + chofer + " y soy el CHOFER.");
        System.out.println("Soy " + copiloto + " y soy el COPILOTO.");
        System.out.println("Soy " + traseroIzq + " y voy en la PARTE TRASERA IZQUIERDA.");
        System.out.println("Soy " + traseroDer + " y voy en la PARTE TRASERA DERECHA.");
    }
}

