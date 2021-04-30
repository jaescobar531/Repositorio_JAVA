public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("ADSI 2104630");//sirve para mostrar mensaje

        //variables

        //tipo de variable = nombre de variable 
        byte edad; //-128 hasta 127
        short precio; //-32768 hasta 32767
        int num_doc; 
        long valor; 
        float dolar;
        double valor_d;

        //asignar valor a las variables
        System.out.println("************************************");
        edad = 35;
        precio= 10000;
        num_doc= 70143135;
        valor=20000000;
        dolar= 12.2f;
        valor_d=23.5f;

        System.out.println("Edad: " +edad);
        System.out.println("Precio: " +precio);
        System.out.println("Numero Documento" +num_doc);
        System.out.println("Valor: " +valor);
        System.out.println("Dolar: " +dolar);
        System.out.println("Valor d: " +valor_d);


        //incremento y decremento
        System.out.println("************************************");
        System.out.println("La edad actual es : " +edad);
        edad++;
        System.out.println("La edad sumando uno es: " +edad);
        edad--;

        System.out.println("La edad restando uno es: " +edad);
        edad+=5;
        System.out.println("La edad aumentando 5 es: " +edad);

        //operaciones
        System.out.println("************************************");
        edad = 35;
        int suma = edad + 10;

        System.out.println("La suma es: " +suma);

        int resta = edad - 20;
        int mult = edad * 5;
        float div = edad / 2;
        int modulo = edad % 2;

        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicación es: " +mult);
        System.out.println("La división es: " +div);
        System.out.println("el residuo es: " +modulo);

        //variables y constantes
        System.out.println("************************************");

        int num = 5;
        //final int num1 = 7;//con final al principio, nunca va a cambiar de valor lo que definamos
        num +=3;
        System.out.println("el valor de num es: " +num);


        //clases
        //clase math
        System.out.println("************************************");
        //raiz cuadrada
        double raiz = Math.sqrt(16);
        System.out.println("la raiz cuadrada de 16 es: " +raiz);
        //raiz cubica
        double raiz1 = Math.cbrt(27);
        System.out.println("la raiz cuadrada de 27 es: " +raiz1);
        //exponente
        double elevado = Math.pow(3, 2);
        System.out.println("3 al cuadrado es: " +elevado);
        //redondear valores
        double redondear = Math.round(12.5);
        System.out.println("12.5 sin dedimal es: " +redondear);







    }
}
