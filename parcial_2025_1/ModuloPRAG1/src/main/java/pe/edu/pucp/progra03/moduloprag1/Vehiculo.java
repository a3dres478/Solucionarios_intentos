/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.progra03.moduloprag1;

/**
 *
 * @author andre
 */
public class Vehiculo {

    public int getVehiculoId() {
        return VehiculoId;
    }

    public void setVehiculoId(int VehiculoId) {
        this.VehiculoId = VehiculoId;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnho() {
        return Anho;
    }

    public void setAnho(int Anho) {
        this.Anho = Anho;
    }
    private int VehiculoId;
    private String Placa;
    private String Marca;
    private String Modelo;
    private int Anho;
    
    public Vehiculo(){
        
    }
    
}
