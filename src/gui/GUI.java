/**
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 8
 * Class/Program: Move a Ball
 * File: GUI.java
 * Description: This program is an exercise to practice the use of Action Listeners. The user can move a blue ball drawn in a JPanel using four buttons. This class implements the basic graphic interface.
 * @author Rubén Labrador Páez
 * @version 1.0.0 11/04/2016
 **/

package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class GUI extends JFrame {
  protected JFrame frame = new JFrame();
  protected BallPanel ballPanel;

  GUI(int ballStep) {
    ballPanel = new BallPanel(ballStep);
    frame.setLayout(new BorderLayout());
    frame.setTitle("Move a Ball");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(getBallPanel(), BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }

  public JFrame getFrame() {
    return frame;
  }

  public BallPanel getBallPanel() {
    return ballPanel;
  }

}
