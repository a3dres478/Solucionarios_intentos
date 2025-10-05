/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.test;

import java.util.List;
import pe.edu.pucp.progra03.moduloprag1.Conductor;
import pe.edu.pucp.progra03.moduloprag1.Infraccion;
import pe.edu.pucp.progra03.moduloprag1.RegistroInfraccion;
import pe.edu.pucp.progra03.moduloprag1.TipoLicencia;
import pe.edu.pucp.progra03.moduloprag1.Vehiculo;
import pe.edu.pucp.progra03.moduloprag1.VehiculoConductor;

/**
 *
 * @author andre
 */
public interface Estrategia {
    //vehiculo,conductor la 1
    //
    void Ejecutar(List<Vehiculo>a,List<Conductor>b,List<VehiculoConductor>c,List<Infraccion>d,List<TipoLicencia>e,List <RegistroInfraccion>f);
}
