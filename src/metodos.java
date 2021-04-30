public class metodos {
    //metodo String

    public static void main(String[] args) throws Exception {
        //length = sirve para mostrar la cantidad de caracteres en una palabra

        String pal = "ADSI";
        System.out.println("La cantidad de caracteres es: " +pal.length());// con el .length muestra la cantidad de caracteres de la palabra

        //substring = muestra la posicion donde se encuentra la palabra, empezando desde cero

        String pal1 = "ADSI";
        System.out.println("El caracter en la posicion 1 es: " +pal1.subSequence(1, 2));

        //toLowerCase = convierte texto de mayuscula a miniscula
        
        String pal2 = "ADSI MAYUSCULA";
        System.out.println("La palabra en minuscula es: " +pal2.toLowerCase());

        //toUpperCase = convierte texto de minuscula a mayuscula

        String pal3 = "ADSI MINUSCULA";
        System.out.println("La palabra en minuscula es: " +pal3.toUpperCase());

        //equalsIgnoreCase = compara dos cadenas de texto sin importar mayusculas y minuscula

        String pal4 = "ADSI1", pal5 = "adsi1";
        System.out.println("Los datos son iguales: " +pal4.equalsIgnoreCase(pal5));

        //replaceAll = reemplaza caracteres por los que quiera poner, no importa la longitud de lo que quiera poner

        String pal6 = "ADSI";
        System.out.println("El texto a reemplazar es DS: " +pal6.replaceAll("DS", "JAEC"));



    }
}
