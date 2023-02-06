
package modelo;

import java.io.Serializable;


public class Vehiculo implements Serializable{
    
    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }
    
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nVehiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
}
