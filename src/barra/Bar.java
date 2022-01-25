
package barra;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Bar extends Thread {
    
    private JProgressBar barra;
    private JLabel labelPerc;

    public Bar(JProgressBar barra, JLabel label) {
        this.barra = barra;
        this.labelPerc = label;
    }
    
    public void barLoad(){
        start();
    }
    
    @Override
    public void run() {
        for(int i = 0; i <=100; i++){
            barra.setValue(i);
            labelPerc.setText(Integer.toString(i));
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bar.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
