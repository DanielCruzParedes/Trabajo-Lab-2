/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Main {
    
    

    public static void main(String[] args) {
        
        Tigo tigo = new Tigo();
        Visual visual = new Visual(tigo);
        AgregarAmigo ag = new AgregarAmigo(tigo);
        AgregarPlan ap = new AgregarPlan(tigo);
        Listar listar = new Listar(tigo);
        PagoPlan pagoplan = new PagoPlan(tigo);
        
        visual.setVisible(true);
        
    }
    
     
    
}
