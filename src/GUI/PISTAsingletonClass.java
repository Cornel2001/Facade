package GUI;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PISTAsingletonClass implements Factory {
	
	public void Create() {
	      System.out.println("Inside PISTAsingletonClass::Create() method.");
	   }
	   
	private static PISTAsingletonClass singleton = new PISTAsingletonClass( );
	
	private static volatile PISTAsingletonClass obj  = null;
	 
   PISTAsingletonClass() {
    	
    }
 
    public static PISTAsingletonClass getInstance()
    {
        if (obj == null)
        {
            synchronized (PISTAsingletonClass.class)
            {
                if (obj==null)
                    obj = new PISTAsingletonClass();
            }
        }
        return obj;
    }
    
    
};
