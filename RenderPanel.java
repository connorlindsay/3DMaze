import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Component;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Main panel for rendering polygons
 */
public class RenderPanel extends JPanel{

    public static final double FOV_SCALE = 1/10;
    public static final double DEPTH = 20;
    public static final int THICKNESS = 2;

    // Initialize this render panel
    public RenderPanel(){

        // Key pressed event
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                // Action based on key pressed
                switch (e.getKeyCode()){
                    case KeyEvent.VK_W:
                        for (Component c : getComponents()){
                            if (c instanceof QuadFace){}
                        }
                        break;
                    case KeyEvent.VK_A:
                        for (Component c : getComponents()){
                            if (c instanceof QuadFace){}
                        }
                        break;
                    case KeyEvent.VK_S:
                        for (Component c : getComponents()){
                            if (c instanceof QuadFace){}
                        }
                        break;
                    case KeyEvent.VK_D:
                        for (Component c : getComponents()){
                            if (c instanceof QuadFace){}
                        }
                        break;
                }

            }
        });

    }

    // Hanldes render order of faces
    public void repaint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        for (Component c : getComponents()){
            c.repaint();
        }

        g2.setStroke(new BasicStroke(RenderPanel.THICKNESS));
        g2.setColor(Color.CYAN);
        g2.draw3DRect(20, 20, 200, 200, false);
    }

}
