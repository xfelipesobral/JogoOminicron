/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fases;

import static fases.fase1.fase1;
import static fases.fase2.fase2;
import java.io.IOException;

/**
 *
 * @author Biblioteca bc
 */
public class carregarFase {
    
    public static boolean menu_principal = true;
    public static boolean fase1 = false;
    public static boolean fase2 = false;
    
    
    public static void selecionarFase(int id) throws IOException{
        if(id==1){
            menu_principal = false;
            fase1 = true;
            fase2 = false;
            fase1();
        }
        
        if(id==2){
            menu_principal = false;
            fase1 = false;
            fase2 = true;
            fase2();
        }
    }
}
