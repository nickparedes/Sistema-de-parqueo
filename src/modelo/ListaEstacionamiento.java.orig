
package modelo;

import java.io.Serializable;
import java.util.Scanner;

public class ListaEstacionamiento implements Serializable, Busqueda{
    //atributos
    private Estacionamiento listaEst [];
    
    public ListaEstacionamiento(){
       listaEst = new Estacionamiento[30];
    }
    //llenar un estacionamiento
    public Estacionamiento leerEst(int i){
        String codigo;
        boolean disponibilidad;
        i=i+1;
        Estacionamiento est= new Estacionamiento();
        //se captura datos del estacionamiento
        codigo = "A"+i;
        est.setCodEsp(codigo);
        est.setDisponibilidad(true);
        
        return est;
    }
    
    public boolean mostrarDisponibilidad(String cod){
        int pos;
        pos=buscar(cod);
        return listaEst[pos].isDisponibilidad();
    }
    
    //agregar un elemento a la ListaEstacionamiento
    public void llenadoEst(){
      
        int i;
        Estacionamiento est;
        
        for(i=0;i<30;i=i+1){
            est=leerEst(i);
            listaEst[i]=est;
            
        }
    }


    //retorna la posicion del estacionamiento, pasando por parametro
  
    public int buscar(String cod){
        int i=0;
        boolean ban=false;
        int pos=-1;
        while(i<30 && ban==false){
            if(listaEst[i].getCodEsp().equals(cod)){
                ban = true;
                pos=i;
            }
            i++;
        }
        return pos;
    }
    
 
    //mostar busqueda a partir de un codigo
  
    public void buscarDatos(){
        Scanner entrada = new Scanner(System.in);
        String idCodigo;
        System.out.println("Escriba Codigo -> ");
        idCodigo=entrada.nextLine();
        int pos=buscar(idCodigo);
        System.out.println("Estacionamiento: "+listaEst[pos].getCodEsp());
        if(pos!=-1){
            if(listaEst[pos].isDisponibilidad()==true){
                System.out.println("Disponible");
            }
            else{
                System.out.println("Ocupado");
            } 
        }else
            System.out.println("No existe el estacionamiento");
  
    }
    
    //con nombre de estacionamiento, modificar estacionamiento
    public Estacionamiento modDis(String cod){
        Estacionamiento est = new Estacionamiento();
        int pos;
        pos=buscar(cod);
        if(pos != -1){
            listaEst[pos].modificarDisponibilidad();
            est = listaEst[pos];
        }
        else{
            System.out.println("El estacionamiento no existe");
        }
        return est;
    }
    
   
    
    /*public void verificarLista () throws ExcepcionEstLleno {
       
        int aux =0;
        for (int i =0;i<30; i++ ){
          if (listaEst[i].isDisponibilidad()== false){
               aux = aux + 1;
          }
        }
        if (aux == 30){
          throw new ExcepcionEstLleno  ("Error");
        }
        
    }*/
}
