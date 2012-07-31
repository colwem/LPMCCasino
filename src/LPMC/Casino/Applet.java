package LPMC.Casino;


import java.awt.Container;
import javax.swing.JApplet;
import LPMC.Casino.view.*;


public class Applet extends JApplet {
    
    public Container Page;


    public void init() {
   
        resize(640,480);
        Page = getContentPane();
        Page.add(new LoginPage());
        setContentPane(Page);
    }
}
