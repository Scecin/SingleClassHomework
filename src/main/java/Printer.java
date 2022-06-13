public class Printer {

    private int numberSheetsLeft;
    private int numberPagesPrinter;
    private int numberCopies;
    private int toner;

    public Printer(int numberSheetsLeft, int numberPagesPrinter, int numberCopies, int toner) {
        this.numberSheetsLeft = numberSheetsLeft;
        this.numberPagesPrinter = numberPagesPrinter;
        this.numberCopies = numberCopies;
        this.toner = toner;
    }

    public String print () {
        if(numberSheetsLeft > 0) {
            numberSheetsLeft -= numberCopies * numberPagesPrinter;
            toner -= numberPagesPrinter * numberCopies;
        }
        return "You have printer " + numberPagesPrinter + " and " + numberCopies + ", so the number of sheets of paper left are "
                + numberSheetsLeft + " and toner volume are equal to " + toner;

    }
}
