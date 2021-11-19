import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Driver class for 3DMaze.
 */
public class Maze{

    public static void main(String [] args){

        // Screen dimensions
        Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();

        // Frame initialization
        JFrame frame = new JFrame("Maze");
        JPanel renderPanel = new RenderPanel();
        frame.add(renderPanel);
        frame.setSize(screenDim.width, screenDim.height); // Window fit to screen
        frame.setMinimumSize(new Dimension(screenDim.width/3, screenDim.height/2)); // Minimum dimensions
        frame.setLocationRelativeTo(null); // Center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program halts on exit
        frame.setVisible(true); // Show window

    }

}