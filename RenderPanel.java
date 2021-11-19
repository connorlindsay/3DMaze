import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/**
 * Main panel for rendering polygons
 */
public class RenderPanel extends JPanel{
    
    List<Face3D> faces;

    // Initialize this render panel
    public RenderPanel(){

        faces = new ArrayList<>();
        // Key pressed event
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                // Action based on key pressed
                switch (e.getKeyCode()){
                    case KeyEvent.VK_W:
                        for (Face3D face : faces){
                            // decrease z-coord
                        }
                        break;
                    case KeyEvent.VK_A:
                        for (Face3D face : faces){
                            // decrease rotate right
                        }
                        break;
                    case KeyEvent.VK_S:
                        for (Face3D face : faces){
                            // increase z-coord
                        }
                        break;
                    case KeyEvent.VK_D:
                        for (Face3D face : faces){
                            // decrease rotate left
                        }
                        break;
                }

            }
        });

    }

    // Hanldes render order of faces
    public void repaint(Graphics g){

    }

}
