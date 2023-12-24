import java.util.*;
import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

class prime {

    prime(int num_int){
        boolean b = false;
       for (int i=2;i<=num_int/2;i++){
           if (num_int%i==0){
               b=true;
               break;
           }
       }
if (!b){
JOptionPane.showMessageDialog(null,num_int+" is a prime number.","RESULT",JOptionPane.INFORMATION_MESSAGE);
}
else JOptionPane.showMessageDialog(null,num_int+" is a not prime number.","RESULT",JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {

        String num;
        num= JOptionPane.showInputDialog(null,"Enter a number","NUMBER INPUT",JOptionPane.QUESTION_MESSAGE);
        int num_int=parseInt(num);

        new prime(num_int);

    }
}