import java.util.Scanner;



public class ejemploscondicionales {

    public static void main(String[] args) {
        //condicional if ***solicitar dos numeros y mostrar el mayor
        Scanner enter = new Scanner(System.in);
        System.out.println("digite el primer numero: ");
        int num1 = enter.nextInt();
        System.out.println("digite el segundo numero: ");
        int num2 = enter.nextInt();
        if (num1 > num2) {
            System.out.println(num1+ " es mayor");
        }else
        {
            System.out.println(num2+ " es mayor");
        }
        
        
        //else if ****** solicitar edad y decir si es mayor de edad y adicional si es niño  niña

        String sexo = "masculino";
        System.out.println("digite edad: ");
        int edad = enter.nextInt();
        /*System.out.println("digite el sexo: ");
        String sexo = enter.nextLine();*/
        if (num1 > 18) {
            System.out.println("es mayor de edad");
        }else if (edad <=18 && edad >= 12) {
            System.out.println("es adolescente");
        }else
        {
            if (sexo == "masculino") {
                System.out.println("es un niño");
            }else{
                System.out.println("es una niña");
            }

        }
        
        

        //swith

        System.out.println("digite un dia del 1 al 7: ");
        int dia = enter.nextInt();
        String nombredia;

        switch (dia) {
            case 1: nombredia = "lunes";                
                break;
            case 2: nombredia = "martes";
                break;
            case 3: nombredia = "miercoles";                
                break;
            case 4: nombredia = "jueves";
                break;
            case 5: nombredia = "viernes";                
                break;
            case 6: nombredia = "sabado";
                break;
            case 7: nombredia = "domingo";
                break;

            default: nombredia = "dia invalido";
                break;
                      
        }
        System.out.println(nombredia);

        enter.close();
        }
        
    }

    
