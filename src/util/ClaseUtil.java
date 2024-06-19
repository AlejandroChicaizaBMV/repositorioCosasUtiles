package util;

public class ClaseUtil {
    public String coloresRGB(int n){
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String cian = "\033[36m";
        String reset = "\u001B[0m";
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
        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String cian = "\033[36m";
        String blanco = "\033[37m";
        String reset = "\u001B[0m";
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