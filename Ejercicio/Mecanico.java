import java.util.Random;
/**
* Clase Mecánico
* contiene dos metodos para revisar y reparar un automovil
*/
class Mecanico{
  /**
  * Variable unica con el nombre del mecanico
  */
  String nombre;
  /**
  * Constructor de la clase el cual genera el nombre y lo escribe en pantalla
  */
  public Mecanico(){
    nombre = "Don Isma";
    System.out.println("Mecanico: " + nombre);
  }
  /**
  * getter de fallas en un automovil
  * @param auto que recibe un Automovil y utiliza sus getters para ejecutar
  * ciertas instrucciones, si encuentra fallas inmediatas trata de repararlas
  */
  public void getFalla(Automovil auto){
    if(auto.getEstado()){
      System.out.println("Automovil sin fallas, excelente tarde");
    }
    else{
      System.out.println("Tiene fallas, procediendo a reparar...");
      setReparacion(auto);
    }
  }
  /**
  * setter de repeaciones para un automovil
  * @param auto recibe un Automovil y genera un valor aleatorio
  * el cual manda al setter de automovil dicho valor
  */
  private void setReparacion(Automovil auto){
    Random r = new Random();
    auto.setReparacion(r.nextInt(3));
  }

}
