
package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class TicTacToe implements ActionListener{
    
    JFrame frame = new JFrame();
    JButton[] button = new JButton[9];
    JPanel grid = new JPanel();
    JPanel title = new JPanel();
    JPanel paner = new JPanel();
    JPanel paner2 = new JPanel();
    JLabel text = new JLabel();
    JButton newGame = new JButton("New Game");
    JButton xButton = new JButton("X");
    JButton oButton = new JButton("O");
    String computerChoice;
    String humanChoice;
    
    
    TicTacToe(){
        
        title.setLayout(new BorderLayout());
        title.setPreferredSize(new Dimension(100,100));
        
        paner.setPreferredSize(new Dimension(100,25));
        paner.setBackground(Color.red);
        paner.setBackground(new Color(25,25,25));
        paner2.setLayout(new FlowLayout());
        paner2.setBackground(new Color(25,25,25));

        xButton.setPreferredSize(new Dimension(100,50));
        newGame.setFont(new Font("Consolas",Font.PLAIN,25));
        newGame.setFocusable(false);
        newGame.setForeground(new Color(200,200,24));
        newGame.setBackground(new Color(50,50,50));
        newGame.addActionListener(this);
        
        xButton.setPreferredSize(new Dimension(50,50));
        xButton.setFont(new Font("Consolas",Font.PLAIN,25));
        xButton.setFocusable(false);
        xButton.setForeground(new Color(200,200,24));
        xButton.setBackground(new Color(50,50,50));
        xButton.addActionListener(this);
        
        oButton.setPreferredSize(new Dimension(50,50));
        oButton.setFont(new Font("Consolas",Font.PLAIN,25));
        oButton.setFocusable(false);
        oButton.setForeground(new Color(200,200,24));
        oButton.setBackground(new Color(50,50,50));
        oButton.addActionListener(this);
        
        
        text.setFont(new Font("Consolas",Font.PLAIN,35));
        text.setText("X-turn");
        text.setForeground(new Color(200,200,24));
        text.setPreferredSize(new Dimension(150,50));

        
        grid.setLayout(new GridLayout(3,3));
        grid.setBackground(Color.gray);
        
        for(int i=0; i<9; i++){
            button[i] = new JButton();
            grid.add(button[i]);
            button[i].setBackground(new Color(50,50,50));
            button[i].setFont(new Font("MV Boli",Font.BOLD,80));
            button[i].setFocusable(false);
            button[i].addActionListener(this);
            button[i].setEnabled(false);
        }
        
        
        
        
        title.add(paner, BorderLayout.NORTH);
        title.add(paner2);
        paner2.add(newGame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(900,150);
        frame.setLayout(new BorderLayout());
        frame.setSize(400,500);
        frame.getContentPane().setBackground(Color.gray);
        frame.add(title,BorderLayout.NORTH);
        frame.add(grid);
        frame.setVisible(true);
        
        
    }
    
    void check(){
        //check X win conditions
		if(
				(button[0].getText()=="X") &&
				(button[1].getText()=="X") &&
				(button[2].getText()=="X")
				) {
			xWins(0,1,2);
		}
		if(
				(button[3].getText()=="X") &&
				(button[4].getText()=="X") &&
				(button[5].getText()=="X")
				) {
			xWins(3,4,5);
		}
		if(
				(button[6].getText()=="X") &&
				(button[7].getText()=="X") &&
				(button[8].getText()=="X")
				) {
			xWins(6,7,8);
		}
		if(
				(button[0].getText()=="X") &&
				(button[3].getText()=="X") &&
				(button[6].getText()=="X")
				) {
			xWins(0,3,6);
		}
		if(
				(button[1].getText()=="X") &&
				(button[4].getText()=="X") &&
				(button[7].getText()=="X")
				) {
			xWins(1,4,7);
		}
		if(
				(button[2].getText()=="X") &&
				(button[5].getText()=="X") &&
				(button[8].getText()=="X")
				) {
			xWins(2,5,8);
		}
		if(
				(button[0].getText()=="X") &&
				(button[4].getText()=="X") &&
				(button[8].getText()=="X")
				) {
			xWins(0,4,8);
		}
		if(
				(button[2].getText()=="X") &&
				(button[4].getText()=="X") &&
				(button[6].getText()=="X")
				) {
			xWins(2,4,6);
		}
		//check O win conditions
		if(
				(button[0].getText()=="O") &&
				(button[1].getText()=="O") &&
				(button[2].getText()=="O")
				) {
			oWins(0,1,2);
		}
		if(
				(button[3].getText()=="O") &&
				(button[4].getText()=="O") &&
				(button[5].getText()=="O")
				) {
			oWins(3,4,5);
		}
		if(
				(button[6].getText()=="O") &&
				(button[7].getText()=="O") &&
				(button[8].getText()=="O")
				) {
			oWins(6,7,8);
		}
		if(
				(button[0].getText()=="O") &&
				(button[3].getText()=="O") &&
				(button[6].getText()=="O")
				) {
			oWins(0,3,6);
		}
		if(
				(button[1].getText()=="O") &&
				(button[4].getText()=="O") &&
				(button[7].getText()=="O")
				) {
			oWins(1,4,7);
		}
		if(
				(button[2].getText()=="O") &&
				(button[5].getText()=="O") &&
				(button[8].getText()=="O")
				) {
			oWins(2,5,8);
		}
		if(
				(button[0].getText()=="O") &&
				(button[4].getText()=="O") &&
				(button[8].getText()=="O")
				) {
			oWins(0,4,8);
		}
		if(
				(button[2].getText()=="O") &&
				(button[4].getText()=="O") &&
				(button[6].getText()=="O")
				) {
			oWins(2,4,6);
		}
                boolean draw=false;
                for(int i=0; i<9; i++){
                    draw=true;
                    if(button[i].getText()==""){
                        draw=false;
                        break;
                    }
                }
                if(draw)draw();
    }
    
    void draw(){
        for(JButton button : button)button.setEnabled(false);
        newGame();
    }
    
    void xWins(int a, int b, int c){
        button[a].setBackground(Color.green);
        button[b].setBackground(Color.green);
        button[c].setBackground(Color.green);
        for(JButton button : button)button.setEnabled(false);
        newGame();
        
    }
    
    void oWins(int a, int b, int c){
        button[a].setBackground(Color.green);
        button[b].setBackground(Color.green);
        button[c].setBackground(Color.green);
        for(JButton button : button)button.setEnabled(false);
        newGame();
    }
    
    int[] Evaluation(){
        
        
        
        int winEvaluation=0;
        int loseEvaluation=0;
        int highestWinEvaluation=0;
        int highestLoseEvaluation=0;
        int[] bestCompination = new int[3];
        int[] worstCompination = new int[3];
        int[][] compinations = {
                                {6,8,7},
                                {0,6,3},
                                {2,8,5},
                                {0,2,1},
                                {4,3,5},
                                {4,1,7},
                                {4,0,8},
                                {4,2,6}
                                };
        
        boolean[] isValid = new boolean[8];
        for(int i=0; i<8; i++){isValid[i]=true;}
        
        for(int i=0; i<8; i++){
            
            winEvaluation=0;
            loseEvaluation=0;
            int counter=0;
            if(isValid[i]){
                for(int j=0; j<3; j++){
                    if(button[compinations[i][j]].getText()==computerChoice){
                        counter++;
                        loseEvaluation=0;
                        winEvaluation++;
                        if(winEvaluation>=highestWinEvaluation&&counter<3){
                            highestWinEvaluation=winEvaluation;
                            bestCompination=compinations[i];
                        }
                    }
                    if(button[compinations[i][j]].getText()==humanChoice){
                        counter++;
                        winEvaluation=0;
                        loseEvaluation++;
                        if(loseEvaluation>=highestLoseEvaluation&&counter<3){
                            highestLoseEvaluation=loseEvaluation;
                            worstCompination=compinations[i];
                        }
                    }
                    if(counter>=3){
                        isValid[i]=false;
                        highestLoseEvaluation=0;
                        highestWinEvaluation=0;
                        i=-1;
                    }
                }
            }
            
        }
        
        if(highestWinEvaluation>=highestLoseEvaluation){
            return bestCompination;
        }
        else{
            return worstCompination;
        }
        
    }
    
    void computerMove(int[] compination){
        for(int i=0; i<3; i++){
            if(button[i].isEnabled()){
                if(button[compination[i]].getText()==""){
                    button[compination[i]].setText(computerChoice);
                    button[compination[i]].setForeground(new Color(200,150,50));
                    text.setText(computerChoice+"-turn");
                    check();
                    break;
                }
            }
            
        }
    }
    
    void newGame(){
        paner2.remove(text);
        paner2.add(newGame);
        frame.validate();
        frame.repaint();
        
    }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<9; i++){
            if(e.getSource()==button[i]){
                if(button[i].getText()==""){
                    button[i].setText(humanChoice);
                    button[i].setForeground(new Color(50,150,200));
                    text.setText(humanChoice+"-turn");
                    check();
                    computerMove(Evaluation());
                }
            }
        }
        
        if(e.getSource()==newGame){
            paner2.add(xButton);
            paner2.add(oButton);
            paner2.remove(newGame);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==xButton){
            humanChoice="X";
            computerChoice="O";
            text.setText("X-turn");
            paner2.remove(xButton);
            paner2.remove(oButton);
            paner2.add(text);
            for(int i=0; i<9; i++){
                button[i].setEnabled(true);
                button[i].setText("");
                button[i].setBackground(new Color(50,50,50));
                
            }
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==oButton){
            humanChoice="O";
            computerChoice="X";
            text.setText("O-turn");
            paner2.remove(xButton);
            paner2.remove(oButton);
            paner2.add(text);
            for(int i=0; i<9; i++){
                button[i].setEnabled(true);
                button[i].setText("");
                button[i].setBackground(new Color(50,50,50));
            }
            frame.revalidate();
            frame.repaint();
            computerMove(Evaluation());
        }

    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        new TicTacToe();
    }

}

