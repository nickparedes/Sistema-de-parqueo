/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;


public class TRegistro implements Serializable{
    private String cod;
    private Cliente idCli;
    private Estacionamiento espacio;
    private  int dia, mes, anio, hora, min;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }
    
    public String dni(){
        return idCli.getDni();
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }
    

    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Estacionamiento getEspacio() {
        return espacio;
    }

    public void setEspacio(Estacionamiento espacio) {
        this.espacio = espacio;
    }

    
    public String getCodRegistro() {
        return cod;
    }

    public void setCodRegistro(String codRegistro) {
        this.cod = codRegistro;
    }

    public Cliente getIdCli() {
        return idCli;
    }

    public void setIdCli(Cliente idCli) {
        this.idCli = idCli;
    }

     public String placa(){
         return idCli.getAutomovil().getPlaca();
     }   
    
    public String apellido(){
        return idCli.getApellido();
    }
    
    public String nombre(){
        return idCli.getNombre();
    }      

}
