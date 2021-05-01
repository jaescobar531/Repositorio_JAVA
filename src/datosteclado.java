import java.util.Scanner;



public class datosteclado {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);//se recomienda hacerlo despues del main para pedir datos por consola..enter es una variable
        //datos de texto
        System.out.println("digite un nombre: ");
        String nom = enter.nextLine();
        System.out.println("el nombre de la variable nom es: " +nom);

        //datos enteros
        System.out.println("digite edad: ");
        int edad = enter.nextInt();
        System.out.println("el doble de la variable edad es: " +(edad*2));

        enter.close();
    }
    
    
}
