public class Calculator {
int numberFirst;
int numberSacond;

    public Calculator(int numberFirst, int numberSacond) {
        this.numberFirst = numberFirst;
        this.numberSacond = numberSacond;
    }

    public int add(int numberFirst, int numberSacond) {
        return (numberFirst + numberSacond);
    }


    public int multiply(int numberFirst, int numberSacond) {
        return (numberFirst * numberSacond);
    }
}