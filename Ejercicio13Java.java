import java.util.Scanner;

public class Ejercicio13Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int totalSuma = 0;
        double totalDivision = 0;
        String escoger = "";

        do{
            System.out.println("MENU_________________________________________________________");
            System.out.println("");
            System.out.println("a. Sumar dos números");
            System.out.println("b. Dividir dos números (no se puede dividir por cero)");
            System.out.println("c. Salir");
            escoger = getString("Escoger una opción");

            if(escoger.equals("a")){
                int var1 = getInt("Ingrese primero número");
                int var2 = getInt("Ingrese segundo número");
                totalSuma = var1 + var2;
                System.out.println("El resultado de la suma es: " + totalSuma);
                System.out.println("aceptar");
                String aceptar = leer.nextLine();

            }

            else if(escoger.equals("")){
                int var1 = getInt("Ingrese el dividendo");
                int var2 = getInt("Ingrese el divisor");
                if(var2 == 0){
                    System.out.println("Esponja, enloqueciste?!");
                    System.out.println("aceptar");
                    String aceptar = leer.nextLine();
                }
                else{
                    totalDivision = (double) var1 / var2;
                    System.out.println("El resultado de la división es: " + totalDivision);
                    System.out.println("aceptar");
                    String aceptar = leer.nextLine();
                }
                
            }

        } while(!escoger.equals("c"));

        System.out.println("Bye :3"); 
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }

    public static String getString(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("^[A-Za-z ]*$")){
                n = "";
            }
        }
        
        return n;
    }
}