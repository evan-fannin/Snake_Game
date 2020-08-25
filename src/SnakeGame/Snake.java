package SnakeGame;

import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        
        initializeUI();
    }
    
    private void initializeUI() {
        
        this.add(new Board());
               
        this.setResizable(false);
        this.pack();
        
        this.setTitle("Snake");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {

        JFrame game = new Snake();
        game.setVisible(true);
    }
}
