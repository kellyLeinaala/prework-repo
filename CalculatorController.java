package MVCsamp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// The Controller coordinates interactions
// between the View and Model
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;
    public CalculatorController(CalculatorView theView, CalculatorModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;
// Tell the View that when ever the calculate button
// is clicked to execute the actionPerformed method
// in the CalculateListener inner class
        this.theView.addCalculateListener(new CalculateListener());
        this.theView.subCalculateListener(new CalculateListener());
        this.theView.multiCalculateListener(new CalculateListener());
        this.theView.divideCalculateListener(new CalculateListener());
    }
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0, thirdNumber = 0, fourthNumber = 0, fifthNumber = 0, sixthNumber = 0,
                seventhNumber = 0, eighthNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution1(theModel.getCalculationValue());

                thirdNumber = theView.getThirdNumber();
                fourthNumber = theView.getFourthNumber();
                theModel.subTwoNumbers(thirdNumber, fourthNumber);
                theView.setCalcSolution2(theModel.getCalculationValue());

                fifthNumber = theView.getFifthNumber();
                sixthNumber = theView.getSixthNumber();
                theModel.multiTwoNumbers(fifthNumber, sixthNumber);
                theView.setCalcSolution3(theModel.getCalculationValue());

                seventhNumber = theView.getSeventhNumber();
                eighthNumber = theView.getEighthNumber();
                theModel.divideTwoNumbers(seventhNumber, eighthNumber);
                theView.setCalcSolution4(theModel.getCalculationValue());


            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }
}