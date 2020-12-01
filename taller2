import java.util.Random;
import java.util.Scanner;

public class Taller02 {
    public static Random rnum= new Random();
    public static Scanner t=new Scanner(System.in);
    public static int dias, horas=24;
    public static int[][] datos =new int[dias][horas];
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        dias =t.nextInt();
        int opcion=0;
        System.out.println("Ingrese opción");
        System.out.println("[1] Llenar datos");
        System.out.println("[2] Comparador de sísmo");
        System.out.println("[3] Contar cuantos sismos han sido mayor a 5.5");
        System.out.println("[4] Alertas sísmicas");
        System.out.println("[0] Ingrese 0 para finalizar");
        System.out.println();
        opcion =t.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    llenarDatos();
                    break;
                case 2:
                    Sismomasgrande();
                    break;
                case 3:
                    Contadorsismos();
                    break;
                case 4:
                    Alertasismica();
                    break;
                default:
                    System.out.println("Valor ingresado fuera del rango");
            }
    }

    public static void Sismomasgrande(){
        double variable=0, sismomayor=0;
        int horadia=0;
        int dia=0;
        for (int i=0;i<dias;i++){
            for (int j=0;j<horas;j++){
                variable = datos[i][j];
                if (variable>sismomayor){
                    sismomayor=variable;
                    horadia=j;
                    dia=i;
                }
            }
        }
        System.out.println("El mayor sismo fue el día: "+dia+" a la hora "+horadia+" con una magnitud de: "+variable+" grados richter");
        menu();
    }

    public static void Contadorsismos(){
        int acumulador=0;
        for (int i=1;i<=dias;i++){
            for(int j=1;j<=horas;j++){
                if(datos[i][j]>=5.5){
                    acumulador++;
                }
            }
        }

        System.out.println("Hay "+acumulador+" días con más de 5 grados Richter");
        menu();
    }
    public static void Alertasismica(){
        for (int i=0;i<dias;i++){
            for (int j=0;j<datos.length;j++){

            }
        }
        menu();
    }

}
