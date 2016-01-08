/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Connect4.java
 *
 * Created on 25.01.2010., 20.57.05
 */

package Connect4;

import java.awt.FontMetrics;
import javax.swing.JLabel;
import javax.swing.UIManager;
import Minimax.AMinimax;
import Minimax.AlphaBeta;
import Minimax.AlphaBetaHTT;
import Minimax.AlphaBetaTT;
import Minimax.AlphaBetaVDHTT;
import Minimax.Minimax;
import java.awt.Color;

public class Connect4 extends javax.swing.JFrame implements IGameMonitor{

    /** Creates new form Connect4 */
    public Connect4() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        initMyComponents();
        initMyVComponents();
        initAdditionalVisualComponent();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connect4");

        jTextArea1.setColumns(6);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(4);
        jTextArea1.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTextArea1);

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

        jMenuItem4.setText("Komjuter-Kompjuter");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseReleased(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuItem8.setText("Prekini");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Potez");

        jMenuItem6.setText("Vrati potez žutog");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Vrati potez plavog");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseReleased(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Podešavanja");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu4MouseReleased(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        startManVsComputer();
    }//GEN-LAST:event_jMenuItem1MouseReleased

    private void jMenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseReleased
        startManVsMan();
    }//GEN-LAST:event_jMenuItem3MouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        startComputerVsMain();
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void jMenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseReleased
        startComputerVsComputer();
    }//GEN-LAST:event_jMenuItem4MouseReleased

    private void jMenuItem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseReleased
        game.undoMove(1, true);
    }//GEN-LAST:event_jMenuItem6MouseReleased

    private void jMenuItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseReleased
        game.undoMove(1, false);
    }//GEN-LAST:event_jMenuItem7MouseReleased

    private void jMenu4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseReleased

    }//GEN-LAST:event_jMenu4MouseReleased

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
        podesavanja.setVisible(true);
        podesavanja.requestFocusInWindow();
    }//GEN-LAST:event_jMenu4MousePressed

    private void jMenuItem8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseReleased
        if (game!=null) {
            game.stopGame();
            vBoard.setWhitePlayerEnabled(false);
            vBoard.setBlackPlayerEnabled(false);
        }
    }//GEN-LAST:event_jMenuItem8MouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connect4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    //my cpomonents
    C4Player white;
    C4Player black;
    C4Board board;
    C4Game game;
    C4VBoard vBoard = null;
    AMinimax ai;

    //additional visual comonents
    JLabel [] verticalMarks = new JLabel[6];
    JLabel [] horizontalMarks = new JLabel[7];

    Podesavanja podesavanja = new Podesavanja();
    boolean useSettings = true;

    

    private void initMyComponents() {

        if (useSettings){
            settingsBasedAIInit();
        }
        else {
            //initM();
            //initAB();
            //initABTT();
            //initABHTT();
            //initABVDHTT(5);

            //initMTL();
            //initABTL();
            //initABTTTL();
            //initABHTTTL();
            initABVDHTTTL(10000, 5);
        }

        game.setGameMonitor(this);

        white.setOponent(black);
        white.setGame(game);
        black.setOponent(white);
        black.setGame(game);
        board.setGame(game);
        board.setVBoard(vBoard);

        initMyVComponents();

        board.initialize();
        white.initialize();
        black.initialize();



        ai.setWinValue(white.getWINValue());

        if (useSettings){
            settingsBasedAIInit2();
        }
        else {
            //additionalMSetup(7);
            //additionalABSetup(9);
            //additionalABTTSetup(9);
            //additionalABHTTSetup(9);
            //additionalABVDHTTSetup(7);

            //additionalMTLSetup();
            //additionalABTLSetup();
            //additionalABTTTLSetup();
            //additionalABHTTTLSetup();
            additionalABVDHTTTLSetup();
        }
    }

    private void settingsBasedAIInit() {
        switch (podesavanja.getAlgorithm()) {
            case 0:
                {
                    if (podesavanja.isTimed()) {
                        initMTL(podesavanja.getTimeLimit());
                    } else {
                        initM();
                    }
                    break;
                }
            case 1:
                {
                    if (podesavanja.isTimed()) {
                        initABTL(podesavanja.getTimeLimit());
                    } else {
                        initAB();
                    }
                    break;
                }
            case 2:
                {
                    if (podesavanja.isTimed()) {
                        initABTTTL(podesavanja.getTimeLimit());
                    } else {
                        initABTT();
                    }
                    break;
                }
            case 3:
                {
                    if (podesavanja.isTimed()) {
                        initABHTTTL(podesavanja.getTimeLimit());
                    } else {
                        initABHTT();
                    }
                    break;
                }
            case 4:
                {
                    if (podesavanja.isTimed()) {
                        initABVDHTTTL(podesavanja.getTimeLimit(), podesavanja.getAdditionalDepth());
                    } else {
                        initABVDHTT(podesavanja.getAdditionalDepth());
                    }
                    break;
                }
        }
    }

    private void settingsBasedAIInit2() {
        if (podesavanja.timed) {
            white.setSearchDepth(42);
            black.setSearchDepth(42);
        } else {
            white.setSearchDepth(podesavanja.getDepth());
            black.setSearchDepth(podesavanja.getDepth());
        }
    }

    private void startManVsComputer() {
        if (game!=null) game.stopGame();
        initMyComponents();
        vBoard.setWhitePlayerEnabled(true);
        vBoard.setBlackPlayerEnabled(false);
        white.setAi(null);
        black.setAi(ai);
        game.startGame();
        vBoard.setTestMode(false);
        vBoard.repaint();
        clearGameLog();
    }

    private void startManVsMan() {
        if (game!=null) game.stopGame();
        initMyComponents();
        vBoard.setWhitePlayerEnabled(true);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(null);
        black.setAi(null);
        game.startGame();
        vBoard.setTestMode(false);
        vBoard.repaint();
        clearGameLog();
    }

    private void startComputerVsMain() {
        if (game!=null) game.stopGame();
        initMyComponents();
        vBoard.setWhitePlayerEnabled(false);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(ai);
        black.setAi(null);
        game.startGame();
        vBoard.setTestMode(false);
        vBoard.repaint();
        clearGameLog();
    }

    private void startComputerVsComputer() {
        if (game!=null) game.stopGame();
        initMyComponents();
        vBoard.setWhitePlayerEnabled(false);
        vBoard.setBlackPlayerEnabled(false);
        white.setAi(ai);
        black.setAi(ai);
        game.startGame();
        vBoard.setTestMode(false);
        vBoard.repaint();
        clearGameLog();
    }

    private void startTestMode() {
        vBoard.setWhitePlayerEnabled(true);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(null);
        black.setAi(null);
        game.startGame();
        vBoard.setTestMode(true);
        vBoard.repaint();
        clearGameLog();
    }

    private void switchToComputerVsMan() {
        vBoard.setWhitePlayerEnabled(false);
        vBoard.setBlackPlayerEnabled(true);
        white.setAi(ai);
        black.setAi(null);
        white.yourTurn();
    }

    private void clearGameLog() {
        jTextArea1.setText("");
    }

    private void initAdditionalVisualComponent() {
        for(int i = 0; i < verticalMarks.length; i++) {
            verticalMarks[i] = new JLabel("" + (i + 1));
            FontMetrics fm = this.getFontMetrics(this.getFont());
            int width = fm.stringWidth(verticalMarks[i].getText());
            int height = fm.getHeight();
            verticalMarks[i].setSize(width+2, height+2);
            verticalMarks[i].setBounds(5, 187 - 30 * i, verticalMarks[i].getWidth(), verticalMarks[i].getHeight());
            this.add(verticalMarks[i]);
        }

        for(char i = 0; i < horizontalMarks.length; i++) {
            char ch = (char)('A' + i);
            horizontalMarks[i] = new JLabel("" + Character.valueOf(ch));
            FontMetrics fm = this.getFontMetrics(this.getFont());
            int width = fm.stringWidth(horizontalMarks[i].getText());
            int height = fm.getHeight();
            horizontalMarks[i].setSize(width+2, height+2);
            horizontalMarks[i].setBounds(32 + 30*i, 215, horizontalMarks[i].getWidth(), horizontalMarks[i].getHeight());
            this.add(horizontalMarks[i]);
        }
    }

    public void setGameOver(String message) {
        setTitle("Connect4 " + message);
    }

    public void setWhosOnMove(String message) {
        setTitle("Connect4 " + message);
    }

    private void initM() {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new Minimax();
        ai.setWinValue(white.getWINValue());
    }

    private void additionalMSetup(int searchDepth) {
        white.setSearchDepth(searchDepth);
        black.setSearchDepth(searchDepth);
    }

    private void initAB() {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBeta();
        ai.setWinValue(white.getWINValue());
    }

    private void additionalABSetup(int searchDepth) {
        white.setSearchDepth(searchDepth);
        black.setSearchDepth(searchDepth);
    }

    private void initABTT() {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaTT();
        ai.setWinValue(white.getWINValue());
    }

    private void additionalABTTSetup(int searchDepth) {
        white.setSearchDepth(searchDepth);
        black.setSearchDepth(searchDepth);
    }

    private void initABHTT() {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaHTT();
        ai.setWinValue(white.getWINValue());
    }

    private void additionalABHTTSetup(int searchDepth) {
        white.setSearchDepth(searchDepth);
        black.setSearchDepth(searchDepth);
    }

    private void initABVDHTT(int additionalDepth) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaVDHTT();
        ai.setWinValue(white.getWINValue());
        ai.setAdditionalDepth(5);
        ai.setBoundsForAdditionalSearch(99999, 99999);
    }

    private void additionalABVDHTTSetup(int searchDepth) {
        white.setSearchDepth(searchDepth);
        black.setSearchDepth(searchDepth);
    }

    private void initMTL(int limit) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new Minimax();
        ai.setWinValue(white.getWINValue());
        ai.setTimeLimit(limit);
    }

    private void additionalMTLSetup() {
        white.setSearchDepth(42);
        black.setSearchDepth(42);
    }

    private void initABTL(int limit) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBeta();
        ai.setWinValue(white.getWINValue());
        ai.setTimeLimit(limit);
    }

    private void additionalABTLSetup() {
        white.setSearchDepth(42);
        black.setSearchDepth(42);
    }

    private void initABTTTL(int limit) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaTT();
        ai.setWinValue(white.getWINValue());
        ai.setTimeLimit(limit);
    }

    private void additionalABTTTLSetup() {
        white.setSearchDepth(42);
        black.setSearchDepth(42);
    }

    private void initABHTTTL(int limit) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaHTT();
        ai.setWinValue(white.getWINValue());
        ai.setTimeLimit(limit);
    }

    private void additionalABHTTTLSetup() {
        white.setSearchDepth(42);
        black.setSearchDepth(42);
    }

    private void initABVDHTTTL(int limit, int additionalDepth) {
        white = new C4Player(1);
        black = new C4Player(2);
        board = new C4Board();
        game = new C4Game(board, white, black);
        if (vBoard!=null) this.remove(vBoard);
        vBoard = new C4VBoard(game);

        ai = new AlphaBetaVDHTT();
        ai.setWinValue(white.getWINValue());
        ai.setAdditionalDepth(5);
        ai.setBoundsForAdditionalSearch(99999, 99999);
        ai.setTimeLimit(limit);
    }

    private void additionalABVDHTTTLSetup() {
        white.setSearchDepth(42);
        black.setSearchDepth(42);
    }

    private void initAI1(){

    }

    private void initMyVComponents() {
        vBoard.setBounds(20, 30, vBoard.getWidth(), vBoard.getHeight());
        vBoard.setGameLog(jTextArea1, null);
        this.add(vBoard);
        this.setLocation(350, 250);
    }

}