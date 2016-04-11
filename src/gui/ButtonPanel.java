/**
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 8
 * Class/Program: Move a Ball
 * File: ButtonPanel.java
 * Description: This program is an exercise to practice the use of Action Listeners. The user can move a blue ball drawn in a JPanel using four buttons. This class implements the buttons of the interface.
 * @author Rubén Labrador Páez
 * @version 1.0.0 11/04/2016
 **/

package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPanel extends GUI {

  private final Dimension BUTTON_DIM = new Dimension(80, 30);
  private JButton upButton = new JButton("Up");
  private JButton downButton = new JButton("Down");
  private JButton leftButton = new JButton("Left");
  private JButton rightButton = new JButton("Right");

  public ButtonPanel(int ballStep) {
    super(ballStep);
    JPanel buttons = new JPanel();
    buttons.setLayout(new GridLayout(3, 1, 1, 1));

    upButton.setName("up");
    upButton.addActionListener(new ButtonListener());
    upButton.setMnemonic(38);
    upButton.setPreferredSize(BUTTON_DIM);

    downButton.setName("down");
    downButton.addActionListener(new ButtonListener());
    downButton.setMnemonic(40);
    downButton.setPreferredSize(BUTTON_DIM);

    leftButton.setName("left");
    leftButton.addActionListener(new ButtonListener());
    leftButton.setMnemonic(37);
    leftButton.setPreferredSize(BUTTON_DIM);

    rightButton.setName("right");
    rightButton.addActionListener(new ButtonListener());
    rightButton.setMnemonic(39);
    rightButton.setPreferredSize(BUTTON_DIM);

    JPanel upButPanel = new JPanel(new FlowLayout());
    upButPanel.add(upButton);
    buttons.add(upButPanel);

    JPanel midButPanel = new JPanel(new FlowLayout());
    midButPanel.add(leftButton);
    midButPanel.add(rightButton);
    buttons.add(midButPanel);

    JPanel downButPanel = new JPanel(new FlowLayout());
    downButPanel.add(downButton);
    buttons.add(downButPanel);

    frame.add(buttons, BorderLayout.SOUTH);
    frame.pack();

  }

  protected class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == upButton) {
        getBallPanel().moveUp();
      } else if (e.getSource() == downButton) {
        getBallPanel().moveDown();
      } else if (e.getSource() == leftButton) {
        getBallPanel().moveLeft();
      } else if (e.getSource() == rightButton) {
        getBallPanel().moveRight();
      }
    }
  }

  public JFrame getFrame() {
    return super.frame;
  }
}
