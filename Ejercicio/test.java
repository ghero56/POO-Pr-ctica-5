import java.util.Random;

public class test{

  public static void main(String[] args) {

    Random r = new Random();
    Automovil auto = new Automovil();
    Mecanico meca = new Mecanico();

    do{
      meca.getFalla(auto);
      System.out.println(auto.toString());
    }while(!auto.getEstado());

  }

}
