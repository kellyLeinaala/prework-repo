package MVCsamp;


//The Model performs all the calculations needed
//and that is it. It doesn't know the View
//exists

public class CalculatorModel {

    // Holds the value of the sum of the numbers
    // entered in the view

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = firstNumber + secondNumber;

    }
    public void subTwoNumbers(int thirdNumber, int fourthNumber) {

        calculationValue = thirdNumber - fourthNumber;
    }

    public void multiTwoNumbers(int fifthNumber, int sixthNumber) {

        calculationValue = fifthNumber * sixthNumber;
    }

    public void divideTwoNumbers(int seventhNumber, int eighthNumber) {

        calculationValue = seventhNumber / eighthNumber;
    }

    public int getCalculationValue(){

        return calculationValue;

    }

}