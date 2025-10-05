/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.moduloprag1;

import java.util.Date;

/**
 *
 * @author andre
 */
public class RegistroInfraccion {

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public Conductor getConductor() {
        return Conductor;
    }

    public void setConductor(Conductor Conductor) {
        this.Conductor = Conductor;
    }

    public Infraccion getInfraccion() {
        return Infraccion;
    }

    public void setInfraccion(Infraccion Infraccion) {
        this.Infraccion = Infraccion;
    }
    
    private Date Fecha;
    private Vehiculo Vehiculo;
    private Conductor Conductor;
    private Infraccion Infraccion;
    
    
}
