public class Calculos {

    private double valor1;
    private double valor2;
    private double valor3;

    public Calculos (double valor1, double valor2, double valor3){
        this.valor3=valor3;
        this.valor2=valor2;
        this.valor1=valor1;
    }

    public double getValor1() {
        return this.valor1;
    }

    public double getValor2() {
        return this.valor2;
    }

    public double getValor3(){
        return this.valor3;
    }


    public void setValor1(double Nvalor1) {
        this.valor1 = Nvalor1;
    }

    public void setValor2(double Nvalor2) {
        this.valor2 = Nvalor2;
    }

    public void setValor3(double Nvalor3) {
        this.valor3 = Nvalor3;
    }

    private void mostrar(){
        System.out.println("   Valor1: "+valor1+"   Valor2: "+valor2+"   Valor3: "+valor3);
    }

}

class Sumatoria extends Calculos{


    public Sumatoria(double Nvalor1,double Nvalor2, double Nvalor3){
        super(Nvalor1,Nvalor2,Nvalor3);

    }
    public void sumar(){
        System.out.println();
    }

}
