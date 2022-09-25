public class Main {
    public static void main(String[] args) {

        coche miCoche =new coche();
        miCoche.aum_puertas();
        System.out.println(miCoche.num_puertas);
    }
}
class coche {
    public int num_puertas=4;
    public void aum_puertas(){
        this.num_puertas++;
    }
}