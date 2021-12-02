package tictactoe;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class TicTacToeViewImpl extends JFrame implements TicTacToeView{
  private JLabel display;
  private JButton echoButton;
  private JButton exitButton;
  private JButton toggleButton;
  private JTextField input;
  public TicTacToeViewImpl(String caption){
    super(caption);

    setSize(500, 300);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new FlowLayout());

    display = new JLabel("To be displayed");
    this.add(display);

    // the text field
    input = new JTextField(10);

    this.add(input);

    // echo button
    echoButton = new JButton("Echofryf");
    echoButton.setActionCommand("Echo Button");
    this.add(echoButton);

    // toggle button
    toggleButton = new JButton("Toggle color");
    toggleButton.setActionCommand("Toggle color button");
    this.add(toggleButton);

    // exit button
    exitButton = new JButton("Exit");
    exitButton.setActionCommand("Exit Button");
    this.add(exitButton);

    pack();
    setVisible(true);
  }

  @Override
  public void addClickListener(TicTacToeController listener) {

  }

  @Override
  public void refresh() {

  }

  @Override
  public void makeVisible() {

  }
}
