class inClase{
  static class Circunferencia{
    private final double PI = 3.15;
    private float radio;

    public float getRadio(){
      return radio;
    }
    public void setRadio(float radio){
      if(radio < 0){
        System.out.println("el valor de radio no puede ser negativo\n"
                            +"Colocando valor por defecto (0)");
        radio = 0;
      }
      this.radio = radio;
    }
    public float perimetro(){
      return radio*2*(float)PI;
    }
    public String toString(){
      return "\n\tradio: "    + radio+
             "\n\tperimetro: "+ perimetro();
    }
    public static void main(String[] args) {
      Circunferencia circulo = new Circunferencia();
      circulo.setRadio(15);
      System.out.println(circulo.toString());
    }
  }

  public static void main(String[] args) {
    Circunferencia circulo = new Circunferencia();
    circulo.setRadio(15);
    System.out.println(circulo.toString());
  }
}
