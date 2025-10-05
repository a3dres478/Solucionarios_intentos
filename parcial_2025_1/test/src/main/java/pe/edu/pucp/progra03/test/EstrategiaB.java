/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.test;

import java.util.Date;
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
public class EstrategiaB implements Estrategia{
    @Override
    public void Ejecutar(List<Vehiculo>a,List<Conductor>b,List<VehiculoConductor>c,List<Infraccion>d,List<TipoLicencia>e,List <RegistroInfraccion>f){
        System.out.println("EJECUTANDO B");
        
        //vehiculos listaconductores adquision inf listatipolicencia reg 
        //a         b                c         d   e                 f 
        
        for (RegistroInfraccion reg: f){
            Infraccion inf =reg.getInfraccion();
            Date fecha=reg.getFecha();
            Conductor cond=reg.getConductor();
            int id1=cond.getConductorId();
            Vehiculo veh=reg.getVehiculo();
            int idvehiculo1=veh.getVehiculoId();
            double data=inf.getPuntos();
            for(VehiculoConductor adqui: c){
                Vehiculo vehi1=adqui.getVehiculo();
                int idvehiculoadqui=vehi1.getVehiculoId();
                Conductor conduc1=adqui.getConductor();
                if(idvehiculoadqui==idvehiculo1){
                    if(id1==conduc1.getConductorId()){
                        
                         if(adqui.getFechaAdquisicion().before(fecha)){
                             
                             for(Conductor conductor:b){
                                 int idparte=conductor.getConductorId();
                                 if(id1==idparte){
                                   double puntos=conductor.getPuntosAcumulados();
                                   double copia1=puntos;
                                   puntos+=data;
                                   conductor.setPuntosAcumulados(puntos);
                                   System.out.println("el conductor con id: "+id1+" se le actualizo los puntos hasta "+puntos+" cuando antes tenia: "+copia1);
                                   break;
                                   
                                 }
                             }
                             
                             break;
                         }
                        
                    }
                }
                
            }
        }
        
    }
}
