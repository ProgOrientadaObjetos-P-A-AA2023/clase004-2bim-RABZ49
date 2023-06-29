/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteTransvia extends Transporte{
    private String cooperativaTransvia;

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public void establecerCooperativaTransvia(String x) {
        cooperativaTransvia = x;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }
    
    
}
