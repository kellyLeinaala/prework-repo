package MVCsamp;
//This is the View
//Its only job is to display what the user sees
//It performs no calculations, but instead passes
//information entered by the user to whomever needs
//it.
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton1 = new JButton("Calculate");
    private JTextField calcSolution1 = new JTextField(10);

    //sub
    private JTextField thirdNumber = new JTextField(10);
    private JLabel subLabel = new JLabel("-");
    private JTextField fourthNumber = new JTextField(10);
    private JButton calculateButton2 = new JButton("Calculate");
    private JTextField calcSolution2 = new JTextField(10);

    //multiply
    private JTextField fifthNumber = new JTextField(10);
    private JLabel multiLabel = new JLabel("*");
    private JTextField sixthNumber = new JTextField(10);
    private JButton calculateButton3 = new JButton("Calculate");
    private JTextField calcSolution3 = new JTextField(10);

    //Divide

    private JTextField seventhNumber = new JTextField(10);
    private JLabel divideLabel = new JLabel("/");
    private JTextField eighthNumber = new JTextField(10);
    private JButton calculateButton4 = new JButton("Calculate");
    private JTextField calcSolution4 = new JTextField(10);


    CalculatorView() {
// Sets up the view and adds the components

        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);


        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton1);
        calcPanel.add(calcSolution1);


        calcPanel.add(thirdNumber);
        calcPanel.add(subLabel);
        calcPanel.add(fourthNumber);
        calcPanel.add(calculateButton2);
        calcPanel.add(calcSolution2);


        calcPanel.add(fifthNumber);
        calcPanel.add(multiLabel);
        calcPanel.add(sixthNumber);
        calcPanel.add(calculateButton3);
        calcPanel.add(calcSolution3);


        calcPanel.add(seventhNumber);
        calcPanel.add(divideLabel);
        calcPanel.add(eighthNumber);
        calcPanel.add(calculateButton4);
        calcPanel.add(calcSolution4);

        this.add(calcPanel);


// End of setting up the components --------
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution1.getText());
    }

    public void setCalcSolution1(int solution) {
        calcSolution1.setText(Integer.toString(solution));
    }

    //subtract
    public int getThirdNumber() {
        return Integer.parseInt(thirdNumber.getText());
    }

    public int getFourthNumber() {
        return Integer.parseInt(fourthNumber.getText());
    }

    public int getCalcSolution2() {
        return Integer.parseInt(calcSolution2.getText());
    }

    public void setCalcSolution2(int solution) {
        calcSolution2.setText(Integer.toString(solution));
    }
    //multiply

    public int getFifthNumber() {
        return Integer.parseInt(fifthNumber.getText());
    }

    public int getSixthNumber() {
        return Integer.parseInt(sixthNumber.getText());
    }

    public int getCalcSolution3() {
        return Integer.parseInt(calcSolution3.getText());
    }

    public void setCalcSolution3(int solution) {
        calcSolution3.setText(Integer.toString(solution));
    }

    //divide
    public int getSeventhNumber() {
        return Integer.parseInt(seventhNumber.getText());
    }

    public int getEighthNumber() {
        return Integer.parseInt(eighthNumber.getText());
    }

    public int getCalcSolution4() {
        return Integer.parseInt(calcSolution4.getText());
    }

    public void setCalcSolution4(int solution) {
        calcSolution4.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
// in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton1.addActionListener(listenForCalcButton);

    }
    void subCalculateListener(ActionListener listenForCalcButton) {
        calculateButton2.addActionListener(listenForCalcButton);

    }

    void multiCalculateListener(ActionListener listenForCalcButton) {
        calculateButton3.addActionListener(listenForCalcButton);

    }

    void divideCalculateListener(ActionListener listenForCalcButton) {
        calculateButton4.addActionListener(listenForCalcButton);

    }



    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}