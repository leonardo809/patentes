/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Fran
 */
public class Screenscreen {
    
    public static void main(String [] args) {
    InicioSesion Inicio=new InicioSesion();
    SplashScreen Splash=new SplashScreen();
    Splash.setVisible(true);
    try {
        for (int i=0; i<= 100; i++) {
            Thread.sleep(40);
            Splash.loadingnum.setText(Integer.toString(i)+"%");
            Splash.loadingbar.setValue(i);
            if(i==100) {
                Splash.setVisible(false);
                Inicio.setVisible(true);
            }
        }
     } catch (Exception e) {
     }
  }
}
