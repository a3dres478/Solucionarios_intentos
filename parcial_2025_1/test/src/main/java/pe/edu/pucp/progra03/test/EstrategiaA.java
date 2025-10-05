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
public class EstrategiaA implements Estrategia{
    @Override
    public void Ejecutar(List<Vehiculo>a,List<Conductor>b,List<VehiculoConductor>c,List<Infraccion>d,List<TipoLicencia>e,List <RegistroInfraccion>f){
        System.out.println("EJECUTANDO A");

        //vehiculos listaconductores adquision inf listatipolicencia reg 
        //a         b                c         d   e                 f     
        double montopuntostotal=0;
        for(RegistroInfraccion inf :f){
            //obtenermos las clases
            //obtenemos al conductor su info
            Conductor conduc=inf.getConductor();
            int idconductor=conduc.getConductorId();
            //obtenmos los puntos a sumar
            Infraccion infraccion= inf.getInfraccion();
            double cantidad=infraccion.getPuntos();
            montopuntostotal+=cantidad;
            for(Conductor conductor: b){
                int id1=conductor.getConductorId();
                if(id1==idconductor){
                    
                    double data=conductor.getPuntosAcumulados();
                    double copia=data;
                    data=data+cantidad;
                    conductor.setPuntosAcumulados(data);
                    System.out.println("el conductor con id: "+id1+" se le actualizo los puntos hasta "+data+" cuando antes tenia: "+copia);
                    break;
                }
            }
            
            
        }
        System.out.println("la cantidad de puntos que fueron contados en total fueron de: "+montopuntostotal);
        
        
    }
}
