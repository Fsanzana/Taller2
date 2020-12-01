import java.util.Random;
import java.util.Scanner;

public class Taller02UnitTesting {
    public int dias;
    public int lecturas = 24;
    public double[][] datos;
    private Random rnum = new Random();
    private Scanner in = new Scanner(System.in);
    public boolean exceeds=false;
    public void Taller02UnitTesting(int d) { //metodo con propositos de testeo
        System.out.println("Ingrese la cantidad de dias deseados");
        this.dias = d;
        this.datos = new double[dias][lecturas];
        llenarDatos();
    }
    public void Taller02UnitTesting() {
        System.out.println("Ingrese la cantidad de dias deseados");
        this.dias = in.nextInt();
        this.datos = new double[dias][lecturas];
        llenarDatos();
    }
    public void menu(){
        this.dias =in.nextInt();
        int opcion=0;
        System.out.println("Ingrese opción");
        System.out.println("[1] Llenar datos");
        System.out.println("[2] Comparador de sísmo");
        System.out.println("[3] Contar cuantos sismos han sido mayor a 5.5");
        System.out.println("[4] Alertas sísmicas");
        System.out.println("[0] Ingrese 0 para finalizar");
        System.out.println();
        opcion =in.nextInt();
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
    public void Sismomasgrande(){
        double variable=0, sismomayor=0;
        int horadia=0;
        int dia=0;
        for (int i=0;i<dias;i++){
            for (int j=0;j<lecturas;j++){
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

    public void Contadorsismos(){
        int acumulador=0;
        for (int i=1;i<=dias;i++){
            for(int j=1;j<=lecturas;j++){
                if(datos[i][j]>=5.5){
                    acumulador++;
                }
            }
        }

        System.out.println("Hay "+acumulador+" días con más de 5 grados Richter");
        menu();
    }
    public void Alertasismica(){
        for (int i=0;i<dias;i++){
            for (int j=0;j<datos.length;j++){

            }
        }
        menu();
    }


    public void llenarDatos(){
        double aux = rnum.nextDouble()-0.5;

        for(int i= 0; i<dias;i++) {
            for (int j = 0; j < lecturas; j++) {
                if (aux < 0) {
                    this.datos[i][j] = (aux * -1) + rnum.nextInt(10);
                    if (datos[i][j] > 9.5 || datos[i][j] < 0) {
                        this.exceeds = true;
                    }
                } else {
                    this.datos[i][j] = aux + rnum.nextInt(10);
                    if (datos[i][j] > 9.5 || datos[i][j] < 0) {
                        this.exceeds = true;
                    }
                }
            }
        }

    }

    public int getDias() {
        return dias;
    }

    public int getLecturas() {
        return lecturas;
    }

    public double[][] getDatos() {
        return datos;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setLecturas(int lecturas) {
        this.lecturas = lecturas;
    }

    public void setDatos(double[][] datos) {
        this.datos = datos;
    }
}
