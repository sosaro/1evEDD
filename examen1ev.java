// Examen 1EV EDD

public class examen1ev {
  
  public static void main(String[] args) {
  
    try {

        for (int i =0 ; i <= 10; i++) {
          int resultado = 7*i;
          System.out.println(7 + " * " + i + " = " + resultado);
        }

    } catch (Exception e){
        e.printStackTrace();
      }
  }
}
