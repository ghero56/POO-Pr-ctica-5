import java.util.Random;

class Mecanico{

  String nombre;

  public Mecanico(){
    nombre = "Don Isma";
    System.out.println("Mecanico: " + nombre);
  }

  public void getFalla(Automovil auto){
    if(auto.getEstado()){
      System.out.println("Automovil sin fallas, excelente tarde");
    }
    else{
      System.out.println("Tiene fallas, procediendo a reparar...");
      setReparacion(auto);
    }
  }

  private void setReparacion(Automovil auto){
    Random r = new Random();
    auto.setReparacion(r.nextInt(3));
  }

}
