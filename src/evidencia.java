import java.util.Scanner;

public class evidencia {
    
    public static void main(String[] args) {
        /*1.	Si el nombre inicia por A o E me muestra un mensaje que muestre el nombre, 
        si inicia por I o O me muestra un mensaje ADSI 2020
        y si inicia en U me muestra el segundo y tercer carácter del nombre.*/

        System.out.println("Ejercicio 1");

        Scanner enter = new Scanner(System.in);
        System.out.println("digite una palabra: ");
        String palabra = enter.nextLine();
                
        if (palabra.startsWith("A") || palabra.startsWith("E")) {
             System.out.println("El resultado a mostrar es: " +palabra);
        }else if (palabra.startsWith("I") || palabra.startsWith("O")) {
                    System.out.println("El resultado a mostrar es: ADSI 2021");
                } else if (palabra.startsWith("U")) {
                    System.out.println("El segundo y tercer caracter es: " +palabra.subSequence(1, 3));
                }
            
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*************************************************************************");
        //********************************************************************************************

        /*2. Digitar un nombre y si este termina en “rt” 
        me muestra un mensaje que me diga “Termina en las letras”, 
        de lo contrario “No termina en las letras”.*/

        System.out.println("Ejercicio 2");

        if (palabra.endsWith("rt")) {
            System.out.println("La palabra termina en las letras rt");            
        } else {
            System.out.println("La palabra no termina en las letras rt");
            
        }

        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*************************************************************************");

        //********************************************************************************************

        /*3. crear un programa con la sentencia switch con 4 opciones 
        – suma, resta, multiplicación y división. El usuario deberá digitar 2 números
         y dependiendo la opción elegida el programa debe realizar la operación. 
         Cabe anotar que para la resta no puede dar número negativo y 
         en la división no se puede por cero.*/

        System.out.println("Ejercicio 3");

        System.out.println("seleccione una operación a resolver: 1. Suma 2. Resta 3. Multiplicación 4. División ");
        int opccion = enter.nextInt();
        
        switch (opccion) {
            
            case 1: System.out.println("Digito la opción suma");
                    System.out.println("ingrese un numero: ");
                    int num1 = enter.nextInt();
                    System.out.println("ingrese otro numero: ");
                    int num2 = enter.nextInt();               
                    System.out.println("la suma es: " +(num1+num2));                
                break;
            case 2: System.out.println("Digito la opción resta");
                    System.out.println("ingrese un numero: ");
                    num1 = enter.nextInt();
                    System.out.println("ingrese otro numero: ");
                    num2 = enter.nextInt();
                    System.out.println("la resta es: " +(num1-num2));                
                break;
            case 3: System.out.println("Digito la opción multiplicación");
                    System.out.println("ingrese un numero: ");
                    num1 = enter.nextInt();
                    System.out.println("ingrese otro numero: ");
                    num2 = enter.nextInt();
                    System.out.println("la multiplicación es: " +(num1*num2));                
                break;
            case 4: System.out.println("Digito la opción división");
                    System.out.println("ingrese un numero: ");
                    float num3 = enter.nextInt();
                    System.out.println("ingrese otro numero: ");
                    float num4 = enter.nextInt();
                    System.out.println("la división es: " +(num3/num4));                
                break;   
            default: System.out.println("Digito la opción incorrecta");
                break;
        }

        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*************************************************************************");

         //********************************************************************************************

        /* 4. Pedirle al usuario que digite un valor que me representara el 
        valor de la moneda colombiana, luego debe elegir de 3 opciones a su criterio 
        a qué tipo de moneda lo desea convertir y mostrar el resultado final.*/

        System.out.println("Ejercicio 4");

        System.out.println("ingrese valor en pesos colombianos: ");
        float moneda = enter.nextFloat();
        System.out.println("seleccione la moneda para realizar la conversión: 1. dolar($) 2. euro(€) 3. libra(£)");
        int opc = enter.nextInt();
        switch (opc) {
            case 1: System.out.println(moneda+ " pesos equivalen a: " +(moneda*0.00027)+ " dolares");                
                break;
            case 2: System.out.println(moneda+ " pesos equivalen a: " +(moneda*0.00022)+ " euros");                
                break;
            case 3: System.out.println(moneda+ " pesos equivalen a: " +(moneda*0.00019)+ " libras");                
                break;
        
            default: System.out.println("digitó la opción incorrecta");
                break;
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*************************************************************************");

         //********************************************************************************************
        /*5.	Leer un número entero de dos dígitos menor que 30 y determinar si es primo. 
        Validar que solo reciba números de 2 dígitos menores a 30.*/

         System.out.println("Ejercicio 5");

        System.out.println("ingrese un numero entero de dos digitos: ");
        int primo = enter.nextInt();

         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("*************************************************************************");
         //********************************************************************************************
        /*6.	Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos. 
        Validar que solo reciba números de 2 dígitos.*/

         System.out.println("Ejercicio 6");

         System.out.println("ingrese un numero entero de dos digitos: ");
         int primo1 = enter.nextInt();
         


         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("*************************************************************************");
         //********************************************************************************************
         /*7.	Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro. 
         Validar que solo reciba números de 2 dígitos.*/

         System.out.println("Ejercicio 7");
         
         System.out.println("ingrese un numero entero de dos digitos: ");
         int multiplo = enter.nextInt();

         Float error de sintaxis;

         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("*************************************************************************");
         //********************************************************************************************



        enter.close();
    }
    
}
