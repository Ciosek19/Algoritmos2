import java.util.Locale;

public class Ejercicio3 {
    public static String revertirPalabra(String palabra,int indice){
        if (indice == 0) return palabra.charAt(indice)+"";
        return palabra.charAt(indice) + revertirPalabra(palabra,indice-1);
    }

    public static void main(String[] args) {
        String palabra = "JAVA";
        System.out.println("Resultado palabra: "+revertirPalabra(palabra,palabra.length()-1));
    }
    /*
    * ["JAVA¨,4]+"A" -> "A" + ["JAVA",3] -> AVAJ
    * ["JAVA¨,3]+"V" -> "V" + ["JAVA¨,2] -> VAJ
    * ["JAVA¨,2]+"A" -> "A" + ["JAVA",1] -> AJ
    * ["JAVA¨,3]+"J" -> "J" + ["JAVA",0] -> J
    * */
}
