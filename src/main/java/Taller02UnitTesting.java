import java.util.Random;
import java.util.Scanner;

public class Taller02UnitTesting {
    public int dias;
    public int lecturas = 24;
    public double[][] datos;
    private Random rnum = new Random();
    private Scanner in = new Scanner(System.in);


    public Taller02UnitTesting() {
        System.out.println("Ingrese la cantidad de dias deseados");
        this.dias = in.nextInt();
        this.datos = new double[dias][lecturas];
        llenarDatos();
    }
    public void llenarDatos(){
        double aux = rnum.nextDouble()-0.5;
        for(int i= 0; i<dias;i++){
            for(int j=0; j<lecturas;i++){
                if(aux<0){
                    this.datos[i][j] = (aux*-1)+ rnum.nextInt(10);
                }else{
                    this.datos[i][j] = aux+ rnum.nextInt(10);
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
