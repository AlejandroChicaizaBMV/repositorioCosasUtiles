package util;
public class ClaseUtil {
    private static String negro = "\033[30m";
    private static String rojo = "\033[31m";
    private static String verde = "\033[32m";
    private static String amarillo = "\033[33m";
    private static String azul = "\033[34m";
    private static String magenta = "\033[35m";
    private static String cian = "\033[36m";
    private static String blanco = "\033[37m";
    private static String reset = "\u001B[0m";
    
    private static String coloresRGB(int n){
        switch (n) {
            case 0:
                return rojo;
            case 1:
                return amarillo;
            case 2:
                return verde;
            case 3:
                return cian;
            case 4:
                return azul;
            case 5:
                return magenta;
            case 6:
                return reset;
            default:
                return "Entrada no válida";
        }  
    }

    private static String colores(int n){
        switch (n) {
            case 0:
                return rojo;
            case 1:
                return amarillo;
            case 2:
                return verde;
            case 3:
                return cian;
            case 4:
                return azul;
            case 5:
                return magenta;
            case 6:
                return negro;
            case 7:
                return blanco;
            case 8:
                return reset;
            default:
                return "Entrada no válida";
        }        
    }

    public static void fraseAnimadaRGB(String frase){
        char[] vectorChar = frase.toCharArray();
        int longitud = vectorChar.length -1 ;
        int colorNumero = 0;
        do{
            for(int i = 0; i <= longitud; i++){
                System.out.print(coloresRGB(colorNumero)+vectorChar[i]);
                try {
                    Thread.sleep(7);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("\r");
            colorNumero ++;
            if(colorNumero == 6)
                colorNumero = 0; 
        }while(colorNumero < 7);
        System.out.print("\n");
    }
    public static void fraseAnimadaRGB1(String frase){
        char[] vectorChar = frase.toCharArray();
        int longitud = vectorChar.length -1 ;
        int colorNumero = 0;
        do{
            for(int i = 0; i <= longitud; i++){
                System.out.print(coloresRGB(colorNumero)+vectorChar[i]);
                colorNumero ++;
                if(colorNumero == 6)
                    colorNumero = 0; 
                try {
                    Thread.sleep(7);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("\r");
        }while(colorNumero < 7);
        System.out.print("\n");
    }

    public void palabraRGB(){
        System.out.print("\n");
        for(int i = 0; i < 6; i++){
            System.out.print(coloresRGB(i)+"\r"+"mensaje en rgb");

            if(i == 5){
                i = 0;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}