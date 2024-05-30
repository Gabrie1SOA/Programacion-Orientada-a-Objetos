public class JugadorFutbol {
    private String cedula;
    private String nombre;
    private int camiseta;

    public JugadorFutbol(String cedula, String nombre, int camiseta){
        this.cedula=cedula;
        this.nombre=nombre;
        this.camiseta=camiseta;
    }

    private void mostrar1(){
        System.out.println("\nCedula: "+cedula+"\nNombre: "+nombre+"\nCamiseta: "+camiseta);
    }

    public void mostrar2(){
        mostrar1();
    }
}

//HIJA
class Defensa extends JugadorFutbol{
    String posicion;
    int tarjetas;
    int goles;
    int faltas;

    public Defensa(String cedula, String nombre, int camiseta,String posicion, int tarjetas, int goles, int faltas){

        super(cedula,nombre,camiseta);
        this.posicion=posicion;
        this.tarjetas=tarjetas;
        this.goles=goles;
        this.faltas=faltas;
    }
    public void mostrar3(){
        mostrar2();
        System.out.println("\nPosicion: "+posicion+"\nTarjetas: "+tarjetas+"\nGoles: "+goles+"\nFaltas: "+faltas);
    }


}




