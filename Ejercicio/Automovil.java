import java.util.Random;
/**
* clase Automovil
*/
class Automovil{
  /**
  * Variables que comprenden el estado del coche
  * asi como su marca y serie
  */
  private String marca;
  private int serie;
  private Boolean estadoMotor;
  private Boolean estadoFrenos;
  /**
  * Constructor del Automovil el cual utiliza las funciones privadas
  * para dotar de datos aleatorios al coche y su estado
  * y luego imprimirlos en consola
  */
  public Automovil(){
    setMarca();
    setSerie();
    setFalla(); // falla aleatoria
    System.out.println(this.toString());
  }
  /**
  * Método toString la cual retorna una cadena con la marca, serie y
  * estado del coche en funcion del estado actual del mismo
  */
  public String toString(){
    Boolean estadoGen = getEstado();
    if(estadoGen)
      return "\nmarca: "+marca+"\tserie: "+serie+"\tEstado: "+"Bueno\n";
    else
      return "\nmarca: "+marca+"\tserie: "+serie+"\tEstado: "+"Malo\n";
  }
  /**
  * getter de estado retorna un Boolean el cual es la operación logica
  * and de los dos estados del automovil (frenos y motor)
  */
  public Boolean getEstado(){
    return estadoFrenos && estadoMotor;
  }
  /**
  * setter de fallas con un valor aleatorio
  */
  private void setFalla(){
    Random rand = new Random();
    estadoMotor = rand.nextBoolean();
    estadoFrenos = rand.nextBoolean();
  }
  /**
  * setter de marca del automovil
  */
  private void setMarca(){
    Random rand = new Random();
    int i = rand.nextInt(10);
    String[] marcas = { "Nissan",
                        "General Motors",
                        "Volkswagen",
                        "Toyota","KIA",
                        "Honda","Mazda",
                        "Ford Motor",
                        "Chrysler",
                        "Hyundai"
                      };
    marca = marcas[i];
  }
  /**
  * setter del numero de serie del automovil con un valor entero
  * aleatorio
  */
  private void setSerie(){
    Random rand = new Random();
    serie = rand.nextInt(50000);
  }
  /**
  * setter de reparación al coche
  * @param op es un entero para dar valor de reparacion
  * en funcion de op arregla partes del automovil
  */
  public void setReparacion(int op){
    switch(op){
      case 1:
        estadoMotor = true;
        break;
      case 2:
        estadoFrenos = true;
        break;
      default:
        estadoFrenos = true;
        estadoMotor = true;
    }

  }
}
