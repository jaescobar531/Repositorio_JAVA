public class conversion {

    public static void main(String[] args) {
        //string a int

        String let1 = "3";
        int num1 = 5;
        int num2 = Integer.parseInt(let1);

        System.out.println("La suma de las variables es: "+(num1+num2));

        //int a string

        int num3 = 8;
        String let2 = Integer.toString(num3);
        System.out.println("de int a string es: "+let2);

        //string a double
        String let3 ="12.4";
        double num4 = Double.parseDouble(let3);//el Double con D mayuscula es el metodo para usar el parseDouble
        System.out.println("de string a double: "+num4);

        //double astring
        double num5 = 5.7;
        String let4 = String.valueOf(num5);
        System.out.println("de double a string: "+let4);

        //string a float
        String let5 = "9.5";
        float num6 = Float.parseFloat(let5);
        System.out.println("de string a float es: "+num6);

        //float a string
        float num7 = 3.2f;
        String let6 = Float.toString(num7);
        System.out.println("de float a string es: "+let6);
    }
}
