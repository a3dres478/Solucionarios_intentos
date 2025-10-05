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
public class VehiculoConductor {

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

    public Date getFechaAdquisicion() {
        return FechaAdquisicion;
    }

    public void setFechaAdquisicion(Date FechaAdquisicion) {
        this.FechaAdquisicion = FechaAdquisicion;
    }
    
    private Vehiculo Vehiculo;
    private Conductor Conductor;
    private Date FechaAdquisicion;
    
    
}
