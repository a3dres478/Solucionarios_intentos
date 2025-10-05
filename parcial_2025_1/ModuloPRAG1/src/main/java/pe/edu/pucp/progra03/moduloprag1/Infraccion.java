/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.moduloprag1;

/**
 *
 * @author andre
 */
public class Infraccion {

    public int getInfraccionId() {
        return InfraccionId;
    }

    public void setInfraccionId(int InfraccionId) {
        this.InfraccionId = InfraccionId;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getMontoMulta() {
        return MontoMulta;
    }

    public void setMontoMulta(double MontoMulta) {
        this.MontoMulta = MontoMulta;
    }

    public Gravedad getGravedad() {
        return Gravedad;
    }

    public void setGravedad(Gravedad Gravedad) {
        this.Gravedad = Gravedad;
    }

    public double getPuntos() {
        return Puntos;
    }

    public void setPuntos(double Puntos) {
        this.Puntos = Puntos;
    }
    private int InfraccionId;
    private String Descripcion;
    private double MontoMulta;
    private Gravedad Gravedad;
      
    private double Puntos;
        
    
}
