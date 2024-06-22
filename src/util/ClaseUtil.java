package util;
public class ClaseUtil {
    public String negro = "\033[30m";
    public String rojo = "\033[31m";
    public String verde = "\033[32m";
    public String amarillo = "\033[33m";
    public String azul = "\033[34m";
    public String magenta = "\033[35m";
    public String cian = "\033[36m";
    public String blanco = "\033[37m";
    public String reset = "\u001B[0m";
    public String coloresRGB(int n){
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
    public void fraseAnimadaRGB(){
        try {
            String frase = "te amo mucho Dariangel <3";
            char[] vectorChar = frase.toCharArray();
            int longitud = vectorChar.length -1 ;
            int[] numeroAsociado = new int[longitud];
            int nota = 5;
            for(int i = 0; i < longitud; i ++){
                numeroAsociado[i] = nota;
                if(nota == 0){
                    nota = 5;
                }
                nota --;
            }
            nota = 5;
            System.out.print("\n");
            for(int i = 0; i < 6; i++){
                for(int j = 0; j <= longitud; j++){
                    System.out.print(coloresRGB(numeroAsociado[nota-i])+vectorChar[j]);
                    Thread.sleep(5);
                }
                System.out.print("\r");
                if(i == 5){
                    i = 0;
                }
            }
            System.out.print("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void fraseAnimadaRGB1(){
        try {
            String frase = "te amo mucho Dariangel <3";
            char[] vectorChar = frase.toCharArray();
            int longitud = vectorChar.length;
            int[] numeroAsociado = new int[longitud];
            int nota = 5;
            for(int i = 0; i < longitud; i ++){
                numeroAsociado[i] = nota;
                if(nota == 0){
                    nota = 5;
                }
                nota --;
            }
            nota = 5;
            System.out.print("\n");
            int variablecolor = 0;
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < longitud; j++){
                    System.out.print(coloresRGB(variablecolor)+vectorChar[j]);
                    Thread.sleep(5);
                    variablecolor++;
                    if(variablecolor==6){
                        variablecolor = 0;
                    }
                }
                System.out.print("\r");
                if(i == 5){
                    i = 0;
                }
            }
            System.out.print("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public String colores(int n){
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
}