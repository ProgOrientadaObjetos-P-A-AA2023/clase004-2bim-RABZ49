/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author SALA I
 */
class TransporteTransvia {
    private String cooperativaTransvia;
    public double tarifa;

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
        tarifa = 0.20;
    }
    
}
