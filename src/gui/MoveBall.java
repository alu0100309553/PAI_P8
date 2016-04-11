/**
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 8
 * Class/Program: Move a Ball
 * File: Test.java
 * Description: This program is an exercise to practice the use of Action Listeners. The user can move a blue ball drawn in a JPanel using four buttons. This implements the main to test the program.
 * @author Rubén Labrador Páez
 * @version 1.0.0 11/04/2016
 **/

package gui;

public class MoveBall {

  public static void main(String[] args) {
    if (args.length == 1) {
      GUI window = new ButtonPanel(Integer.parseInt(args[0]));
    } else {
      System.out.println("Error: try MoveBall \"int value\"");
    }
  }

}
