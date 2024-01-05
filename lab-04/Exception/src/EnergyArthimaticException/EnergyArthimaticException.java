package EnergyArthimaticException;

public class EnergyArthimaticException extends ArithmeticException {
    public int messageCode;
    public EnergyArthimaticException(String message) {
        super(message);
    }

    public EnergyArthimaticException(int messageCode) {
        this.messageCode=messageCode;
    }

    @Override
    public String getMessage() {
        if(messageCode==1){
            return "You must not divide by zero!";
        }
        else if(messageCode==2){
            return "My program about Energy and energy can not be negative value";
        }
        else if(messageCode==3){
            return "My program about Energy and energy must not be fraction less than 1";
        }
        else if(messageCode==4){
            return "The maximun recorded energy till now is  4.8×10^20 joules!";
        }
        else{
            return "You Do something arthimatic error!";
        }
    }
}