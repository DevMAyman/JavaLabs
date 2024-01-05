package ComplexNumber;

public class ComplexNumber<T extends Number> {
    public T real;
    public T imag;
    public ComplexNumber(T real, T imag){
        this.real=real;
        this.imag=imag;
    }
    public String displayComplex (){
        if(this.imag.doubleValue()==0){
            return ""+this.real;
        }
        else if(this.imag.doubleValue()>0){
            return this.real+"+"+this.imag+"i";
        }
        else{
            return this.real+""+this.imag+"i";
        }
    }
    public ComplexNumber<T> addComplex(ComplexNumber<T> anotherComplex) {
        T realPart = add(this.real, anotherComplex.real);
        T imagPart = add(this.imag, anotherComplex.imag);
        return new ComplexNumber(realPart, imagPart);
    }
    public ComplexNumber<T> substractComplex(ComplexNumber<T> anotherComplex) {
        T realPart = substract(this.real, anotherComplex.real);
        T imagPart = substract(this.imag, anotherComplex.imag);
        return new ComplexNumber(realPart, imagPart);
    }
    public ComplexNumber<T> multipleComplex(ComplexNumber<T> anotherComplex) {
        T realPart = (T)Double.valueOf(multiple(this.real, anotherComplex.real).doubleValue()+-1*multiple(this.imag, anotherComplex.imag).doubleValue());
        T imagPart = (T)Double.valueOf(multiple(this.real, anotherComplex.imag).doubleValue()+multiple(this.imag, anotherComplex.real).doubleValue());

        return new ComplexNumber(realPart, imagPart);
    }
    private T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    private T substract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    private T multiple(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

}
