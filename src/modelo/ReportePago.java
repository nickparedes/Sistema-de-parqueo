/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;


public class ReportePago implements Serializable {
    TRegistro ticket; 
    private final float pago_minuto;
    private final String numRuc;
    private final String direccion;
    private double pago_total;
    private int codigoBoleta;
    private int dia_Salida;
    private int mes_Salida;
    private int anio_Salida=0;
    private int hora_Salida;
    private int min_Salida;

    public TRegistro getTicket() {
        return ticket;
    }

    public void setTicket(TRegistro ticket) {
        this.ticket = ticket;
    }

    public double getPago_total() {
        return pago_total;
    }

    public void setPago_total(double pago_total) {
        this.pago_total = pago_total;
    }

    public int getCodigoBoleta() {
        return codigoBoleta;
    }

    public void setCodigoBoleta(int codigoBoleta) {
        this.codigoBoleta = codigoBoleta;
    }

    public int getDia_Salida() {
        return dia_Salida;
    }

    public void setDia_Salida(int dia_Salida) {
        this.dia_Salida = dia_Salida;
    }

    public int getMes_Salida() {
        return mes_Salida;
    }

    public void setMes_Salida(int mes_Salida) {
        this.mes_Salida = mes_Salida;
    }

    public int getAnio_Salida() {
        return anio_Salida;
    }

    public void setAnio_Salida(int anio_Salida) {
        this.anio_Salida = anio_Salida;
    }

    public int getHora_Salida() {
        return hora_Salida;
    }

    public void setHora_Salida(int hora_Salida) {
        this.hora_Salida = hora_Salida;
    }

    public int getMin_Salida() {
        return min_Salida;
    }

    public void setMin_Salida(int min_Salida) {
        this.min_Salida = min_Salida;
    }

    
    public ReportePago(){
        pago_minuto=0.12f;
        numRuc="2098285937001";
        direccion="Av. Iquitos 169";
    }

    public ReportePago(int dia_Salida, int mes_Salida, int anio_Salida,int hora_Salida, int min_Salida){
        this.dia_Salida = dia_Salida;
        this.mes_Salida = mes_Salida;
        this.anio_Salida = anio_Salida;
        this.hora_Salida = hora_Salida;
        this.min_Salida = min_Salida;
        pago_minuto=0.12f;
        numRuc="2098285937001";
        ticket = new TRegistro();
        direccion="Av. Iquitos 169";
    }
    
    
    public int minTotal(){
        String fEntrada, fSalida;
        int minutosT=0;
        boolean fechaMayor=false;
        
        if(mes_Salida-ticket.getMes()==0 && dia_Salida-ticket.getDia()==0){         
            minutosT=(hora_Salida*60+min_Salida)-(ticket.getHora()*60+ticket.getMin()); //870-570=300
            
        }else{
           
           if(mes_Salida-ticket.getMes()==0){
              int numDias=(dia_Salida-ticket.getDia())-1;
              int minFtran=(24-ticket.getHora())*60-ticket.getMin();//minutos que faltan transcurrir para que acabe el dia de entrada
              int minTran=hora_Salida*60+min_Salida;//minutos transcurridos del dia de salida
              minutosT=numDias*24*60+minFtran+minTran;
          }else{
              if(mes_Salida-ticket.getMes()==1){
                  int cantDme,cantDms;
                  cantDme=cantDiasxMes(ticket.getMes());//cantidad de dias del mes entrada
                  //cantDms=cantDiasxMes(mes_Salida);
                  
                int minFtran=(24-ticket.getHora())*60-ticket.getMin();
                int minTran=hora_Salida*60+min_Salida;
                minutosT=(cantDme-ticket.getDia())*24*60+minFtran+minTran+(dia_Salida-1)*24*60; 
                
              }else{
                  int   cantMinxMesInt=0;
                  int numMesnt=mes_Salida-ticket.getMes()-1;
                  int cont=ticket.getMes()+1;
                  while(cont<= mes_Salida-1){
                      cantMinxMesInt=cantMinxMesInt+cantDiasxMes(cont)*24*60;
                      cont++;
                  }
                  int cantDme=cantDiasxMes(ticket.getMes());
                  int minFtran=(24-ticket.getHora())*60-ticket.getMin();
                  int minTran=hora_Salida*60+min_Salida;
                  minutosT=(cantDme-ticket.getDia())*24*60+minFtran+minTran+(dia_Salida-1)*24*60+cantMinxMesInt;
              }
          }
        }   
        
        return minutosT;
    }
    
    //Muestras la horas transcurridas, el cual se mostrara en la boleta
    public String horaTranscurrida(){
        int minT=minTotal();
        int horaTranscurrida;
        int minTranscurrido;
        String horas;
    
        horaTranscurrida= minT/60;
        minTranscurrido=minT%60;
        horas=horaTranscurrida+"h :"+minTranscurrido+"m";
        return horas;
    }
    
    //El monto a pagar por el cliente
    public double calculoPago(){
        int minTotales;
        double pagoT;
        minTotales=minTotal();
        pagoT=pago_minuto*minTotales;  
        pagoT=Math.round(pagoT*10.0)/10.0;
        return pagoT; 
    }
    

    
    public String getDni(){
        return ticket.dni();
    }
    
        public int cantDiasxMes(int mes){
        int cantDias=0;
        
        switch(mes){
            case 1: cantDias=31;
                break;
            case 2: cantDias=28;
                break;
            case 3:cantDias=31;
                break;
            case 4:cantDias=30;
                break;
            case 5:cantDias=31;
                break;
            case 6:cantDias=30;
                break;
            case 7:cantDias=31;
                break;
            case 8:cantDias=31;
                break;
            case 9:cantDias=30;
                break;
            case 10:cantDias=31;
                break;
            case 11:cantDias=30;
                break;
            case 12:cantDias=31; 
                break;
        }
        return cantDias;       
    }
        
    public String pago(){
        String total;
        pago_total=calculoPago();
        total = "S/. "+ pago_total;
        return total;
    }        
}
