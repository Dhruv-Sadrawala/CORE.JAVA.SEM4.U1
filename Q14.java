import javax.swing.*;
import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {

        String num= JOptionPane.showInputDialog(null,"Enter a three number.","INPUT",JOptionPane.QUESTION_MESSAGE);
        int num_int=parseInt(num);

        int reversedNum = 0, remainder;
        int originalNum = num_int;

        while (num_int != 0) {
            remainder = num_int % 10;
            reversedNum = reversedNum * 10 + remainder;
            num_int /= 10;
        }

        if (originalNum == reversedNum) {
            JOptionPane.showMessageDialog(null,originalNum+" is a palindrome number.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,originalNum+" is a not palindrome number.","RESULT",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}