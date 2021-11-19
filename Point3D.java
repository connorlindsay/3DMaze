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

    public void translate(double delta){
        zCoord += delta;
    }

    public void rotate(double theta){

    }

}
