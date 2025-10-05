/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.moduloprag1;

/**
 *
 * @author andre
 */
public class TipoLicencia {

    public int getTipoLicenciaId() {
        return TipoLicenciaId;
    }

    public void setTipoLicenciaId(int TipoLicenciaId) {
        this.TipoLicenciaId = TipoLicenciaId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    private int TipoLicenciaId;
    private String Nombre;
    private String Descripcion;
    
    public TipoLicencia(){
        
    }
}
