/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.algorithm.siwalga;

import com.zisal.algorithm.siwalga.view.Run;
import javax.swing.UIManager;

/**
 *
 * @author Fauzi
 */
public class Siwalga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            new Run().setVisible(true);
        }catch(Exception e){
            
        }
    }
}
