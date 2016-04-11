/**
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 3 - Computación
 * Subject: Programación de aplicaciones interactivas.
 * Practice: 8
 * Class/Program: Move a Ball
 * File: BallPanel.java
 * Description: This program is an exercise to practice the use of Action Listeners. The user can move a blue ball drawn in a JPanel using four buttons. This class implements the view of the movement.
 * @author Rubén Labrador Páez
 * @version 1.0.0 11/04/2016
 **/

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
  private final Dimension PANEL_DIM = new Dimension(600, 300);
  private int ballStep = 1;
  private int ballD = 20;
  private int xMid;
  private int yMid;
  private int xOffset = 0;
  private int yOffset = 0;

  private int getBallStep() {
    return ballStep;
  }

  private void setBallStep(int ballStep) {
    this.ballStep = ballStep;
  }

  private void setBallD(int ballD) {
    this.ballD = ballD;
  }

  private void setxMid(int xMid) {
    this.xMid = xMid;
  }

  private void setyMid(int yMid) {
    this.yMid = yMid;
  }

  private void setxOffset(int xOffset) {
    this.xOffset = xOffset;
  }

  private void setyOffset(int yOffset) {
    this.yOffset = yOffset;
  }
  
  public int getxOffset() {
    return xOffset;
  }

  public int getyOffset() {
    return yOffset;
  }

  public int getxMid() {
    return xMid;
  }

  public int getyMid() {
    return yMid;
  }

  public int getBallD() {
    return ballD;
  }

  BallPanel(int ballStep_) {
    setPreferredSize(PANEL_DIM);
    setBackground(Color.YELLOW);
    setVisible(true);
    xOffset -= ballD / 2;
    yOffset -= ballD / 2;
    ballStep = ballStep_;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    draw(g);
  }

  private void draw(Graphics g) {
    setxMid(getWidth() / 2);
    setyMid(getHeight() / 2);
    g.setColor(Color.BLUE);
    g.fillOval(getxMid() + getxOffset(), getyMid() + getyOffset(), getBallD(), getBallD());
  }

  public void moveUp() {
    if ((getyOffset() - getBallStep() + getyMid()) >= 0)
      setyOffset(getyOffset() - getBallStep());
    else
      setyOffset(- getyMid());
    repaint();
  }

  public void moveDown() {
    if ((getyOffset() + getBallStep() + getBallD() + getyMid()) <= getHeight())
      setyOffset(getyOffset() + getBallStep());
    else
      setyOffset(getyMid() - getBallD());
    repaint();
  }

  public void moveLeft() {
    if ((getxOffset() - getBallStep() + getxMid()) >= 0)
      setxOffset(getxOffset() - getBallStep());
    else
      setxOffset(- getxMid());
    repaint();
  }

  public void moveRight() {
    if ((getxOffset() + getBallStep() + getBallD() + getxMid()) <= getWidth())
      setxOffset(getxOffset() + getBallStep());
    else
        setxOffset(getxMid() - getBallD());
    repaint();
  }

  

}
