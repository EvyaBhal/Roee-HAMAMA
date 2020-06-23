package RPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rps2 implements ActionListener {
    private enum OP{rock,paper,scissors};
    private JFrame frame;

    private JPanel scoreBoard;
    private JPanel Choices;
    private JPanel Buttons;

    //scoreBoard Components
    private JLabel human; // human wins
    private JLabel pc;  // pc wins
    private JLabel draw; // number of draws
    private JLabel matches;

    private JLabel winner; // prints out who won
    private JLabel Whuman; // num of human wins
    private JLabel Wpc;// num of pc wins
    private JLabel Ndraw;// num of draws
    private JLabel Nmatch;// total num of matches


    //Choices Components
    private JLabel h; // human
    private JLabel c; // pc
    private JLabel H_c; // human choice;
    private JLabel C_c; // pc choice(random)

    //Buttons Components
    private JButton r;
    private JButton p;
    private JButton s;


    public rps2(){
        //build scoreBoard components
        human = new JLabel("Human:");
        pc = new JLabel("Computer:");
        // TODO: finish initializing the components

        scoreBoard = new JPanel();
        //scoreBoard.setLayout();
        //TODO: finish c'tor, all components have the same building design

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        OP Pchoice;
        OP Cchoice = OP.scissors;//TODO: randomly pick an option for PC.
        if(e.getSource() == r){
            Pchoice = OP.rock;
            //TODO: update rock Image to Player's choice
        }
        if(e.getSource()== p){
            Pchoice = OP.paper;
        }
        if(e.getSource()==s){
            Pchoice = OP.scissors;
        }
        //whoWon(Pchoice, Cchoice);

    }
    public void whoWon(OP player, OP pc){
        //TODO: compare the choices and update scoreBoard
    }

}
