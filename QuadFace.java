import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.Polygon;
import java.awt.BasicStroke;
import java.awt.Color;

/**
 * Quadrilateral faces comprised of 3D points.
 */
public class QuadFace extends Component{
    
    Point3D first, second, third, last;

    public QuadFace(Point3D center, double rHorizontal, double rVertical, double theta){
        double x, y, z;
        x = (rVertical)*(Math.cos(theta));
        z = (rVertical)*(Math.sin(theta));
        y = rVertical;

        // Transalte points based on center
        first = new Point3D(center.x() + x, center.y() + y, center.z() + z);
        second = new Point3D(center.x() - x, center.y() + y, center.z() - z);
        third = new Point3D(center.x() - x, center.y() - y, center.z() - z);
        last = new Point3D(center.x() + x, center.y() - y, center.z() + z);

    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Dimension dim = getParent().getSize();
        Polygon poly = new Polygon();

        g2.setStroke(new BasicStroke(RenderPanel.THICKNESS));
        g2.setColor(Color.CYAN);
        poly.addPoint((int)(RenderPanel.FOV_SCALE*dim.getWidth()*(first.x() - (RenderPanel.DEPTH - first.z())/RenderPanel.DEPTH)), 
            (int)(RenderPanel.FOV_SCALE*dim.getHeight()*(first.y() - (RenderPanel.DEPTH - first.z())/RenderPanel.DEPTH)));
        poly.addPoint((int)(RenderPanel.FOV_SCALE*dim.getWidth()*(second.x() - (RenderPanel.DEPTH - second.z())/RenderPanel.DEPTH)), 
            (int)(RenderPanel.FOV_SCALE*dim.getHeight()*(second.y() - (RenderPanel.DEPTH - second.z())/RenderPanel.DEPTH)));
        poly.addPoint((int)(RenderPanel.FOV_SCALE*dim.getWidth()*(third.x() - (RenderPanel.DEPTH - third.z())/RenderPanel.DEPTH)), 
            (int)(RenderPanel.FOV_SCALE*dim.getHeight()*(third.y() - (RenderPanel.DEPTH - third.z())/RenderPanel.DEPTH)));
        poly.addPoint((int)(RenderPanel.FOV_SCALE*dim.getWidth()*(last.x() - (RenderPanel.DEPTH - last.z())/RenderPanel.DEPTH)), 
            (int)(RenderPanel.FOV_SCALE*dim.getHeight()*(last.y() - (RenderPanel.DEPTH - last.z())/RenderPanel.DEPTH)));

        g2.fill(poly);
        g2.setColor(Color.BLUE);
        g2.draw(poly);

        g2.draw3DRect(20, 20, 200, 200, false);

    }

    // Pass translation responsibility to points
    public void translate(double delta){
        first.translate(delta);
        second.translate(delta);
        third.translate(delta);
        last.translate(delta);
    }

    // Pass rotation responsibility to points
    public void rotate(double theta){
        first.rotate(theta);
        second.rotate(theta);
        third.rotate(theta);
        last.rotate(theta);
    }

    public void print(){
        System.out.println("(" + first.x() + ", " + first.y() + ", " + first.z() + ")");
        System.out.println("(" + second.x() + ", " + second.y() + ", " + second.z() + ")");
        System.out.println("(" + third.x() + ", " + third.y() + ", " + third.z() + ")");
        System.out.println("(" + last.x() + ", " + last.y() + ", " + last.z() + ")");
    }

}
