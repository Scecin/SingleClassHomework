public class Calculator {

    private int firstIntNumber;
    private int secondIntNumber;

    // Instant
    public Calculator(int firstIntNumber, int secondIntNumber) {
        this.firstIntNumber = firstIntNumber;
        this.secondIntNumber = secondIntNumber;
    }

    public int addTwoNumbers() {
        int total = firstIntNumber + secondIntNumber;
        return total;
    }

    public int subtractTwoNumbers() {
        int total = firstIntNumber - secondIntNumber;
        return total;
    }

    public int multiplyTwoNumbers() {
        int total = firstIntNumber * secondIntNumber;
        return total;
    }

    public double divideTwoNumbers() {
        double total = (double) firstIntNumber / (double) secondIntNumber;
        return total;
    }
}
