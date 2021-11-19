import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * AWrapper class for KeyPressed event
 */
public abstract class KeyAdapter implements KeyListener{
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
