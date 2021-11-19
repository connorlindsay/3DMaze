/**
 * Three dimensional point class.
 * Building block for three dimensional faces.
 */
public class Point3D {
    
    private double xCoord, yCoord, zCoord;

    public Point3D(double x, double y, double z){
        xCoord = x; 
        yCoord = y;
        zCoord = z;
    }

    public double x(){
        return xCoord;
    }

    public double y(){
        return yCoord;
    }

    public double z(){
        return zCoord;
    }

    // Transale in z direcation
    public void translate(double delta){
        zCoord += delta;
    }

    // Rotation about y-axis
    public void rotate(double theta){
        /*
            Rotation matrix
            |cos -sin||x|
            |sin cos ||z|
        */
        double xTemp = xCoord*Math.cos(theta) - zCoord*Math.sin(theta);
        zCoord = xCoord*Math.sin(theta) + zCoord*Math.cos(theta);
        xCoord = xTemp;
    }

}
