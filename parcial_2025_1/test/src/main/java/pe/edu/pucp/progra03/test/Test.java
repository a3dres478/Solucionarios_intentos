/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pe.edu.pucp.progra03.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import pe.edu.pucp.progra03.moduloprag1.Conductor;
import pe.edu.pucp.progra03.moduloprag1.Gravedad;
import pe.edu.pucp.progra03.moduloprag1.Infraccion;
import pe.edu.pucp.progra03.moduloprag1.RegistroInfraccion;
import pe.edu.pucp.progra03.moduloprag1.TipoLicencia;
import pe.edu.pucp.progra03.moduloprag1.Vehiculo;
import pe.edu.pucp.progra03.moduloprag1.VehiculoConductor;
/**
 *
 * @author andre
 */
public class Test {

    public static void main(String[] args) {
        
        List<TipoLicencia> listatipolicencias=new ArrayList<>();
        
        TipoLicencia a1 = new TipoLicencia();
        a1.setTipoLicenciaId(1);
        a1.setNombre("A-I");
        a1.setDescripcion("Permite manejar autos particulares como sedanes, SUV, pickups y furgones.");
        
        listatipolicencias.add(a1);
        
        TipoLicencia a2a = new TipoLicencia();
        a2a.setTipoLicenciaId(2);
        a2a.setNombre("A-IIa");
        a2a.setDescripcion("Incluye A-I y también taxis, buses, ambulancias y transporte interprovincial.");

        listatipolicencias.add(a2a);
        
        TipoLicencia a2b = new TipoLicencia();
        a2b.setTipoLicenciaId(3);
        a2b.setNombre("A-IIb");
        a2b.setDescripcion("Incluye A-I y A-IIa, además de microbuses de hasta 16 asientos y minibuses hasta 33 asientos.");

        listatipolicencias.add(a2b);
        
        TipoLicencia a3a = new TipoLicencia();
        a3a.setTipoLicenciaId(4);
        a3a.setNombre("A-IIIa");
        a3a.setDescripcion("Incluye A-I, A-IIa y A-IIb; además permite manejar ómnibus urbanos e interurbanos.");

        listatipolicencias.add(a3a);
        
        TipoLicencia a3b = new TipoLicencia();
        a3b.setTipoLicenciaId(5);
        a3b.setNombre("A-IIIb");
        a3b.setDescripcion("Incluye A-I, A-IIa y A-IIb, además de chasis cabinado, remolques, grúas y volquetes.");

        listatipolicencias.add(a3b);
        
        TipoLicencia a3c = new TipoLicencia();
        a3c.setTipoLicenciaId(6);
        a3c.setNombre("A-IIIc");
        a3c.setDescripcion("Permite manejar todos los vehículos de las categorías anteriores.");

        listatipolicencias.add(a3c);
        
        TipoLicencia b1 = new TipoLicencia();
        b1.setTipoLicenciaId(7);
        b1.setNombre("B-I");
        b1.setDescripcion("Triciclos no motorizados de transporte público especial.");

        listatipolicencias.add(b1);
        
        TipoLicencia b2a = new TipoLicencia();
        b2a.setTipoLicenciaId(8);
        b2a.setNombre("B-IIa");
        b2a.setDescripcion("Bicimotos destinadas al transporte de pasajeros o mercancías.");

        listatipolicencias.add(b2a);
        
        TipoLicencia b2b = new TipoLicencia();
        b2b.setTipoLicenciaId(9);
        b2b.setNombre("B-IIb");
        b2b.setDescripcion("Incluye B-IIa y motocicletas de dos ruedas o motocicletas con sidecar.");

        listatipolicencias.add(b2b);
        
        TipoLicencia b2c = new TipoLicencia();
        b2c.setTipoLicenciaId(10);
        b2c.setNombre("B-IIc");
        b2c.setDescripcion("Incluye B-IIa y B-IIb, además de mototaxis y trimotos para transporte de pasajeros.");
        
        listatipolicencias.add(b2c);
        
        List <Conductor> listaconductores=new ArrayList<>();
        
        Conductor conductor1 = new Conductor();
        conductor1.setConductorId(1);
        conductor1.setNombres("JUAN CARLOS");
        conductor1.setPaterno("GARCIA");
        conductor1.setMaterno("PEREZ");
        conductor1.setNumLicencia("Q45678912");
        conductor1.setTipoLicencia(a1);
        conductor1.setPuntosAcumulados(0);
        
        listaconductores.add(conductor1);
        
        Conductor conductor2 = new Conductor();
        conductor2.setConductorId(2);
        conductor2.setNombres("ANA MARIA");
        conductor2.setPaterno("MARTINEZ");
        conductor2.setMaterno("RODRIGUEZ");
        conductor2.setNumLicencia("W78945612");
        conductor2.setTipoLicencia(a2a);
        conductor2.setPuntosAcumulados(5);

        listaconductores.add(conductor2);
        
        Conductor conductor3 = new Conductor();
        conductor3.setConductorId(3);
        conductor3.setNombres("PEDRO PABLO");
        conductor3.setPaterno("LOPEZ");
        conductor3.setMaterno(null);
        conductor3.setNumLicencia("E12345678");
        conductor3.setTipoLicencia(a2b);
        conductor3.setPuntosAcumulados(8);

        listaconductores.add(conductor3);
        
        Conductor conductor4 = new Conductor();
        conductor4.setConductorId(4);
        conductor4.setNombres("MARIA ELENA");
        conductor4.setPaterno("TORRES");
        conductor4.setMaterno("VARGAS");
        conductor4.setNumLicencia("R98765432");
        conductor4.setTipoLicencia(a3a);
        conductor4.setPuntosAcumulados(2);

        listaconductores.add(conductor4);
        
        Conductor conductor5 = new Conductor();
        conductor5.setConductorId(5);
        conductor5.setNombres("JOSE LUIS");
        conductor5.setPaterno("RAMIREZ");
        conductor5.setMaterno("SILVA");
        conductor5.setNumLicencia("T45612378");
        conductor5.setTipoLicencia(a3b);
        conductor5.setPuntosAcumulados(15);

        listaconductores.add(conductor5);
        
        Conductor conductor6 = new Conductor();
        conductor6.setConductorId(6);
        conductor6.setNombres("CARMEN ROSA");
        conductor6.setPaterno("FLORES");
        conductor6.setMaterno("CASTRO");
        conductor6.setNumLicencia("Y78912345");
        conductor6.setTipoLicencia(a3c);
        conductor6.setPuntosAcumulados(0);

        listaconductores.add(conductor6);
        
        Conductor conductor7 = new Conductor();
        conductor7.setConductorId(7);
        conductor7.setNombres("MIGUEL ANGEL");
        conductor7.setPaterno("DIAZ");
        conductor7.setMaterno("MENDOZA");
        conductor7.setNumLicencia("U14725836");
        conductor7.setTipoLicencia(b1);
        conductor7.setPuntosAcumulados(4);

        listaconductores.add(conductor7);
        
        Conductor conductor8 = new Conductor();
        conductor8.setConductorId(8);
        conductor8.setNombres("LAURA BEATRIZ");
        conductor8.setPaterno("CHAVEZ");
        conductor8.setMaterno("RIOS");
        conductor8.setNumLicencia("I36925814");
        conductor8.setTipoLicencia(b2a);
        conductor8.setPuntosAcumulados(6);

        listaconductores.add(conductor8);
        
        Conductor conductor9 = new Conductor();
        conductor9.setConductorId(9);
        conductor9.setNombres("CARLOS ALBERTO");
        conductor9.setPaterno("SANCHEZ");
        conductor9.setMaterno("ORTIZ");
        conductor9.setNumLicencia("O25836914");
        conductor9.setTipoLicencia(b2b);
        conductor9.setPuntosAcumulados(12);

        listaconductores.add(conductor9);
        
        Conductor conductor10 = new Conductor();
        conductor10.setConductorId(10);
        conductor10.setNombres("PATRICIA ELENA");
        conductor10.setPaterno("MORALES");
        conductor10.setMaterno("CRUZ");
        conductor10.setNumLicencia("P74185296");
        conductor10.setTipoLicencia(b2c);
        conductor10.setPuntosAcumulados(3);
        
        listaconductores.add(conductor10);
        
        List<Vehiculo>vehiculos=new ArrayList<>();
        
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setVehiculoId(1);
        vehiculo1.setPlaca("ABC-123");
        vehiculo1.setMarca("TOYOTA");
        vehiculo1.setModelo("COROLLA");
        vehiculo1.setAnho(2022);
        
        vehiculos.add(vehiculo1);
                
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setVehiculoId(2);
        vehiculo2.setPlaca("DEF-456");
        vehiculo2.setMarca("HYUNDAI");
        vehiculo2.setModelo("TUCSON");
        vehiculo2.setAnho(2021);

        vehiculos.add(vehiculo2);
        
        Vehiculo vehiculo3 = new Vehiculo();
        vehiculo3.setVehiculoId(3);
        vehiculo3.setPlaca("GHI-789");
        vehiculo3.setMarca("NISSAN");
        vehiculo3.setModelo("SENTRA");
        vehiculo3.setAnho(2023);

        vehiculos.add(vehiculo3);
        
        Vehiculo vehiculo4 = new Vehiculo();
        vehiculo4.setVehiculoId(4);
        vehiculo4.setPlaca("JKL-012");
        vehiculo4.setMarca("KIA");
        vehiculo4.setModelo("SPORTAGE");
        vehiculo4.setAnho(2022);

        vehiculos.add(vehiculo4);
        
        Vehiculo vehiculo5 = new Vehiculo();
        vehiculo5.setVehiculoId(5);
        vehiculo5.setPlaca("MNO-345");
        vehiculo5.setMarca("VOLKSWAGEN");
        vehiculo5.setModelo("GOL");
        vehiculo5.setAnho(2021);

        vehiculos.add(vehiculo5);
        
        Vehiculo vehiculo6 = new Vehiculo();
        vehiculo6.setVehiculoId(6);
        vehiculo6.setPlaca("PQR-678");
        vehiculo6.setMarca("CHEVROLET");
        vehiculo6.setModelo("SAIL");
        vehiculo6.setAnho(2023);

        vehiculos.add(vehiculo6);
        
        Vehiculo vehiculo7 = new Vehiculo();
        vehiculo7.setVehiculoId(7);
        vehiculo7.setPlaca("STU-901");
        vehiculo7.setMarca("SUZUKI");
        vehiculo7.setModelo("SWIFT");
        vehiculo7.setAnho(2022);

        vehiculos.add(vehiculo7);
        
        Vehiculo vehiculo8 = new Vehiculo();
        vehiculo8.setVehiculoId(8);
        vehiculo8.setPlaca("VWX-234");
        vehiculo8.setMarca("HONDA");
        vehiculo8.setModelo("CIVIC");
        vehiculo8.setAnho(2021);

        vehiculos.add(vehiculo8);
        
        Vehiculo vehiculo9 = new Vehiculo();
        vehiculo9.setVehiculoId(9);
        vehiculo9.setPlaca("YZA-567");
        vehiculo9.setMarca("MAZDA");
        vehiculo9.setModelo("CX-30");
        vehiculo9.setAnho(2023);

        vehiculos.add(vehiculo9);
        
        Vehiculo vehiculo10 = new Vehiculo();
        vehiculo10.setVehiculoId(10);
        vehiculo10.setPlaca("BCD-890");
        vehiculo10.setMarca("MITSUBISHI");
        vehiculo10.setModelo("L200");
        vehiculo10.setAnho(2022);
        
        vehiculos.add(vehiculo10);
        List<VehiculoConductor> adquision=new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            VehiculoConductor vc1 = new VehiculoConductor();
            vc1.setVehiculo(vehiculo1);
            vc1.setConductor(conductor1);
            vc1.setFechaAdquisicion(sdf.parse("2022-01-15"));
            adquision.add(vc1);
            
            
            VehiculoConductor vc2 = new VehiculoConductor();
            vc2.setVehiculo(vehiculo2);
            vc2.setConductor(conductor1);
            vc2.setFechaAdquisicion(sdf.parse("2021-12-10"));

            adquision.add(vc2);
            
            VehiculoConductor vc3 = new VehiculoConductor();
            vc3.setVehiculo(vehiculo2);
            vc3.setConductor(conductor2);
            vc3.setFechaAdquisicion(sdf.parse("2021-06-20"));

            adquision.add(vc3);
            
            VehiculoConductor vc4 = new VehiculoConductor();
            vc4.setVehiculo(vehiculo3);
            vc4.setConductor(conductor3);
            vc4.setFechaAdquisicion(sdf.parse("2023-03-10"));

            adquision.add(vc4);
            
            VehiculoConductor vc5 = new VehiculoConductor();
            vc5.setVehiculo(vehiculo4);
            vc5.setConductor(conductor3);
            vc5.setFechaAdquisicion(sdf.parse("2022-10-15"));

            adquision.add(vc5);
            
            VehiculoConductor vc6 = new VehiculoConductor();
            vc6.setVehiculo(vehiculo4);
            vc6.setConductor(conductor4);
            vc6.setFechaAdquisicion(sdf.parse("2022-08-25"));

            adquision.add(vc6);
            
            VehiculoConductor vc7 = new VehiculoConductor();
            vc7.setVehiculo(vehiculo5);
            vc7.setConductor(conductor5);
            vc7.setFechaAdquisicion(sdf.parse("2021-11-30"));

            adquision.add(vc7);
            
            VehiculoConductor vc8 = new VehiculoConductor();
            vc8.setVehiculo(vehiculo6);
            vc8.setConductor(conductor5);
            vc8.setFechaAdquisicion(sdf.parse("2023-01-08"));

            adquision.add(vc8);
            
            VehiculoConductor vc9 = new VehiculoConductor();
            vc9.setVehiculo(vehiculo6);
            vc9.setConductor(conductor6);
            vc9.setFechaAdquisicion(sdf.parse("2023-02-05"));

            adquision.add(vc9);
            
            VehiculoConductor vc10 = new VehiculoConductor();
            vc10.setVehiculo(vehiculo7);
            vc10.setConductor(conductor7);
            vc10.setFechaAdquisicion(sdf.parse("2022-07-12"));

            adquision.add(vc10);
            
            VehiculoConductor vc11 = new VehiculoConductor();
            vc11.setVehiculo(vehiculo8);
            vc11.setConductor(conductor7);
            vc11.setFechaAdquisicion(sdf.parse("2021-08-20"));

            adquision.add(vc11);
            
            VehiculoConductor vc12 = new VehiculoConductor();
            vc12.setVehiculo(vehiculo8);
            vc12.setConductor(conductor8);
            vc12.setFechaAdquisicion(sdf.parse("2021-09-18"));

            adquision.add(vc12);
            
            VehiculoConductor vc13 = new VehiculoConductor();
            vc13.setVehiculo(vehiculo9);
            vc13.setConductor(conductor9);
            vc13.setFechaAdquisicion(sdf.parse("2023-01-22"));

            adquision.add(vc13);
            
            VehiculoConductor vc14 = new VehiculoConductor();
            vc14.setVehiculo(vehiculo10);
            vc14.setConductor(conductor10);
            vc14.setFechaAdquisicion(sdf.parse("2022-04-28"));
        
            adquision.add(vc14);
        }
        
        catch (ParseException ex) {
            ex.printStackTrace();
        }
        List<Infraccion> inf=new ArrayList<>();
        
        Infraccion infraccion1 = new Infraccion();
        infraccion1.setInfraccionId(1);
        infraccion1.setDescripcion("Conducir con exceso de velocidad");
        infraccion1.setMontoMulta(950.00);
        infraccion1.setGravedad(Gravedad.GRAVE);
        infraccion1.setPuntos(50);
        
        inf.add(infraccion1);
        
        Infraccion infraccion2 = new Infraccion();
        infraccion2.setInfraccionId(2);
        infraccion2.setDescripcion("Conducir en estado de ebriedad");
        infraccion2.setMontoMulta(4300.00);
        infraccion2.setGravedad(Gravedad.MUY_GRAVE);
        infraccion2.setPuntos(100);

        inf.add(infraccion2);
        
        Infraccion infraccion3 = new Infraccion();
        infraccion3.setInfraccionId(3);
        infraccion3.setDescripcion("Estacionar en zona rígida");
        infraccion3.setMontoMulta(240.00);
        infraccion3.setGravedad(Gravedad.LEVE);
        infraccion3.setPuntos(20);

        inf.add(infraccion3);
        
        Infraccion infraccion4 = new Infraccion();
        infraccion4.setInfraccionId(4);
        infraccion4.setDescripcion("No usar cinturón de seguridad");
        infraccion4.setMontoMulta(240.00);
        infraccion4.setGravedad(Gravedad.LEVE);
        infraccion4.setPuntos(20);

        inf.add(infraccion4);
        
        Infraccion infraccion5 = new Infraccion();
        infraccion5.setInfraccionId(5);
        infraccion5.setDescripcion("Usar celular mientras conduce");
        infraccion5.setMontoMulta(950.00);
        infraccion5.setGravedad(Gravedad.GRAVE);
        infraccion5.setPuntos(50);
        
        inf.add(infraccion5);
        
        List<RegistroInfraccion>reg=new ArrayList<>();
        
        try {
            RegistroInfraccion ri1 = new RegistroInfraccion();
            ri1.setFecha(sdf.parse("2025-01-15"));
            ri1.setVehiculo(vehiculo1);
            ri1.setConductor(conductor1);
            ri1.setInfraccion(infraccion1);
            
            reg.add(ri1);
            
            RegistroInfraccion ri2 = new RegistroInfraccion();
            ri2.setFecha(sdf.parse("2025-02-20"));
            ri2.setVehiculo(vehiculo2);
            ri2.setConductor(conductor2);
            ri2.setInfraccion(infraccion4);  // Cinturón

            reg.add(ri2);
            
            RegistroInfraccion ri3 = new RegistroInfraccion();
            ri3.setFecha(sdf.parse("2025-03-10"));
            ri3.setVehiculo(vehiculo3);
            ri3.setConductor(conductor3);
            ri3.setInfraccion(infraccion1);  // Velocidad

            reg.add(ri3);
            
            RegistroInfraccion ri4 = new RegistroInfraccion();
            ri4.setFecha(sdf.parse("2025-03-15"));
            ri4.setVehiculo(vehiculo4);
            ri4.setConductor(conductor4);
            ri4.setInfraccion(infraccion5);  // Celular

            reg.add(ri4);
            
            RegistroInfraccion ri5 = new RegistroInfraccion();
            ri5.setFecha(sdf.parse("2025-04-01"));
            ri5.setVehiculo(vehiculo5);
            ri5.setConductor(conductor5);
            ri5.setInfraccion(infraccion2);  // Ebriedad

            reg.add(ri5);
            
            RegistroInfraccion ri6 = new RegistroInfraccion();
            ri6.setFecha(sdf.parse("2025-04-15"));
            ri6.setVehiculo(vehiculo2);
            ri6.setConductor(conductor1);
            ri6.setInfraccion(infraccion1);  // Velocidad

            reg.add(ri6);
            
            RegistroInfraccion ri7 = new RegistroInfraccion();
            ri7.setFecha(sdf.parse("2025-04-20"));
            ri7.setVehiculo(vehiculo4);
            ri7.setConductor(conductor3);
            ri7.setInfraccion(infraccion2);  // Ebriedad
        
            reg.add(ri7);
        }
        catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        //List listaconductores<Conductor>
       
    
        //vehiculos listaconductores adquision inf listatipolicencia reg 
        //a         b                c         d   e                 f
        Contexto contexto=new Contexto(new EstrategiaA());
        contexto.ejecutarEstrategia(vehiculos,listaconductores, adquision, inf ,listatipolicencias, reg);
        
        /*
        EJECUTANDO A
el conductor con id: 1 se le actualizo los puntos hasta 50.0 cuando antes tenia: 0.0
el conductor con id: 2 se le actualizo los puntos hasta 25.0 cuando antes tenia: 5.0
el conductor con id: 3 se le actualizo los puntos hasta 58.0 cuando antes tenia: 8.0
el conductor con id: 4 se le actualizo los puntos hasta 52.0 cuando antes tenia: 2.0
el conductor con id: 5 se le actualizo los puntos hasta 115.0 cuando antes tenia: 15.0
el conductor con id: 1 se le actualizo los puntos hasta 100.0 cuando antes tenia: 50.0
el conductor con id: 3 se le actualizo los puntos hasta 158.0 cuando antes tenia: 58.0
        */
//        
//        Contexto contexto=new Contexto(new EstrategiaB());
//        contexto.ejecutarEstrategia(vehiculos,listaconductores, adquision, inf ,listatipolicencias, reg);




/*EJECUTANDO B
el conductor con id: 1 se le actualizo los puntos hasta 50.0 cuando antes tenia: 0.0
el conductor con id: 2 se le actualizo los puntos hasta 25.0 cuando antes tenia: 5.0
el conductor con id: 3 se le actualizo los puntos hasta 58.0 cuando antes tenia: 8.0
el conductor con id: 4 se le actualizo los puntos hasta 52.0 cuando antes tenia: 2.0
el conductor con id: 5 se le actualizo los puntos hasta 115.0 cuando antes tenia: 15.0
el conductor con id: 1 se le actualizo los puntos hasta 100.0 cuando antes tenia: 50.0
el conductor con id: 3 se le actualizo los puntos hasta 158.0 cuando antes tenia: 58.0*/
        
    }
}
