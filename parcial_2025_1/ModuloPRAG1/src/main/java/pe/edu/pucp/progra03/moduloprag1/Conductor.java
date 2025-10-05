/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.moduloprag1;

/**
 *
 * @author andre
 */
public class Conductor {

    public String getNumLicencia() {
        return NumLicencia;
    }

    public void setNumLicencia(String NumLicencia) {
        this.NumLicencia = NumLicencia;
    }

    public int getConductorId() {
        return ConductorId;
    }

    public void setConductorId(int ConductorId) {
        this.ConductorId = ConductorId;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public TipoLicencia getTipoLicencia() {
        return TipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia TipoLicencia) {
        this.TipoLicencia = TipoLicencia;
    }

    public double getPuntosAcumulados() {
        return PuntosAcumulados;
    }

    public void setPuntosAcumulados(double PuntosAcumulados) {
        this.PuntosAcumulados = PuntosAcumulados;
    }
    private int ConductorId;
    private String Nombres;
    private String Paterno;
    private String Materno;
    private String NumLicencia;
    private TipoLicencia TipoLicencia;
    private double PuntosAcumulados;
    
    public Conductor(){
        
    } 
}
