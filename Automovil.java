import java.util.Random;
/**
*
*
*
*
*
*/
class Automovil{
  private String marca;
  private int serie = 10;
  private Boolean estadoMotor;
  private Boolean estadoFrenos;

  public Automovil(){
    setMarca();
    setSerie();
    setFalla(); // falla aleatoria
    System.out.println(this.toString());
  }

  public String toString(){
    Boolean estadoGen = getEstado();
    if(estadoGen)
      return "\nmarca: " + marca + "\tserie: " + serie + "\tEstado: " + "Bueno\n";
    else
      return "\nmarca: " + marca + "\tserie: " + serie + "\tEstado: " + "Malo\n";
  }
  
  public Boolean getEstado(){
    return estadoFrenos && estadoMotor;
  }

  private void setFalla(){
    Random rand = new Random();
    estadoMotor = rand.nextBoolean();
    estadoFrenos = rand.nextBoolean();
  }

  private void setMarca(){
    Random rand = new Random();
    int i = rand.nextInt(10);
    String[] marcas = {"Nissan","General Motors","Volkswagen","Toyota","KIA","Honda","Mazda","Ford Motor","Chrysler","Hyundai"};
    marca = marcas[i];
  }

  private void setSerie(){
    Random rand = new Random();
    serie = rand.nextInt(50000);
  }

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
