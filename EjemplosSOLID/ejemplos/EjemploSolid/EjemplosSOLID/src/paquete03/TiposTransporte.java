/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class TiposTransporte {
    private double promedioTarifas;
    private TransporteTaxi ttaxi;
    private TransporteBus ttbus;
    private TransporteTransvia transvia;
    /*private TransporteAereo aereo;
    private TransporteMaritimo maritimo;*/

    public TransporteTransvia obtenerTransvia() {
        return transvia;
    }

    public void establecerTransvia(TransporteTransvia x) {
        transvia = x;
    }
    
    
    public void establecerTransporteTaxi(TransporteTaxi taxi){
        ttaxi = taxi;
    }
    
    public void establecerTransporteBus(TransporteBus bus){
        ttbus = bus;
    }
    
    public TransporteTaxi obtenerTransporteTaxi(){
        return ttaxi;
    }
    
    public TransporteBus obtenerTransporteBus(){
        return ttbus;
    }
    
    public void establecerPromedioTarifas(){
        promedioTarifas = (obtenerTransporteBus().obtenerTarifa() + 
                obtenerTransporteTaxi().obtenerTarifa()+
                obtenerTransvia().obtenerTarifa())/3;
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    
}
