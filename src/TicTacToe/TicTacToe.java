/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TicTacToe.java
 *
 * Created on 24.01.2010., 19.51.17
 */

package TicTacToe;

import Minimax.AlphaBeta;
import Minimax.AMinimax;

/**
 *
 * @author Administrator
 */
public class TicTacToe extends javax.swing.JFrame {

    /** Creates new form TicTacToe */
    public TicTacToe() {
        initComponents();
        initMyComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iks-Oks");

        jMenu1.setText("Igra");

        jMenu3.setText("Nova");

        jMenuItem1.setText("Covek-Kompjuter");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Kompjuter-Covek");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Covek-Covek");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Kompjuter-Kompjuter");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        startManVsComputer();
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        startComputerVsMan();
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
        startManVsMan();
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void jMenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseReleased
        startComputerVsComputer();
    }//GEN-LAST:event_jMenuItem4MouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables


    //my cpomonents
    TTTPlayer white = new TTTPlayer(1);
    TTTPlayer black = new TTTPlayer(2);
    TTTBoard board = new TTTBoard(3);
    TTTGame game = new TTTGame(board, white, black, 3);

    TTTVBoard vBoard = new TTTVBoard(game, 40);

    AMinimax ai = new AlphaBeta();

    private void initMyComponents() {
        white.setOponent(black);
        white.setGame(game);
        black.setOponent(white);
        black.setGame(game);
        board.setGame(game);
        board.setVBoard(vBoard);

        board.initialize();
        white.initialize();
        black.initialize();

        vBoard.setBounds(30, 30, vBoard.getWidth(), vBoard.getHeight());
        this.add(vBoard);
        this.setLocation(350, 250);
    }

    private void startManVsComputer() {
        vBoard.setWhitePlayerEnabled(true);
        vBoard.setBlackPlayerEnabled(false);
        white.setAi(null);
        black.setAi(ai);
        game.startGame();
        vBoard.repaint();
    }

    private void startComputerVsMan() {
        vBoard.setWhitePlayerEnabled(false);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(ai);
        black.setAi(null);
        game.startGame();
        vBoard.repaint();
    }

    private void startManVsMan() {
        vBoard.setWhitePlayerEnabled(true);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(null);
        black.setAi(null);
        game.startGame();
        vBoard.repaint();
    }

    private void startComputerVsComputer() {
        vBoard.setWhitePlayerEnabled(false);
        vBoard.setBlackPlayerEnabled(false);
        white.setAi(ai);
        black.setAi(ai);
        game.startGame();
        vBoard.repaint();
    }

}
