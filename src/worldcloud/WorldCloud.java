/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcloud;

import worldcloud.ui.MainFrame;

/**
 *
 * @author marcowerner
 */
public class WorldCloud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame frame=new MainFrame(); 
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }
    
}
