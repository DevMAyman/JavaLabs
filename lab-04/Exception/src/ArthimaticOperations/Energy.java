package ArthimaticOperations;
import  EnergyArthimaticException.EnergyArthimaticException;
public class Energy {
    public float mass;
    public float time;
    public float distance;
    public double energy;
    private static final double MAX_ENERGY = 4.8*Math.pow(10,20);
public Energy(float mass, float time, float distance){
    //System.out.println("You should enter /n the mass in Kg /n the time in seconds /n the distance in meter !");
    this.time=time;
    this.mass=mass;
    this.distance=distance;
}
public double calculateEnergy() throws EnergyArthimaticException{
    if(this.time==0){
        throw new EnergyArthimaticException(1);
    }
    else if(this.time<0){
        throw new EnergyArthimaticException(2);
    }
    this.energy=0.5*this.mass*Math.pow(distance/time,2);
    if(this.energy<1 && this.energy>0){
        throw new EnergyArthimaticException(3);
    }
    else if(this.energy > MAX_ENERGY){
        throw new EnergyArthimaticException(4);
    }
return energy ;
}
}
