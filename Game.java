import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Game extends JFrame{
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    int ACmilan = 0;
    int Rmadrid = 0;
    String lastS = "N/A";
    String win = "Winner: DRAW";

    public Game(){
        super("Game");
        setSize(700, 500);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JPanel());
        add(last);
        add(new JPanel());
        add(milan);

        milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ACmilan++;
                lastS = "AC Milan";
                win = ((ACmilan > Rmadrid) ? "Winner: AC Milan" : "Winner: Real Madrid");
                if (ACmilan == Rmadrid) win = "Winner: DRAW";
                result.setText("Result: " + ACmilan + " X " + Rmadrid);
                last.setText("Last Scorer: " + lastS);
                winner.setText(win);
            }

        });

        add(result);
        add(madrid);

        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Rmadrid++;
                lastS = "Real Madrid";
                win = ((ACmilan > Rmadrid) ? "Winnder: AC Milan" : "Winner: Real Madrid");
                if (ACmilan == Rmadrid) win = "Winner: DRAW";
                result.setText("Result: " + ACmilan + " X " + Rmadrid);
                last.setText("Last Scorer: " + lastS);
                winner.setText(win);
            }

        });

        add(new JPanel());
        add(winner);
        add(new JPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}
