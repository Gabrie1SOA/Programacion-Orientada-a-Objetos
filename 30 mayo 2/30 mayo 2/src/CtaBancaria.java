public class CtaBancaria {
    String cedula;
    String nombre;
    double monto;

    public CtaBancaria(String cedula, String nombre, double monto){
        this.cedula= cedula;
        this.nombre= nombre;
        this.monto= monto;
    }

    public void imp(){
    System.out.println("Cedula: "+cedula+"\nNombre: "+nombre+"\nMonto: "+monto);
    }

}

class Ahorros extends CtaBancaria {
    String numerocuenta;
    double deposito;

    public Ahorros (String cedula, String nombre, double monto, String numerocuenta,double deposito){
        super(cedula,nombre,monto);
        this.numerocuenta=numerocuenta;
        this.deposito=deposito;

    }


    public void depositar(){
        System.out.println("\nSaldo Cuenta: "+monto+"\nDeposito realizado de: "+deposito+"\nNumero de cuenta: "+numerocuenta+"\nSaldo Actual: "+(monto+deposito));

    }

}