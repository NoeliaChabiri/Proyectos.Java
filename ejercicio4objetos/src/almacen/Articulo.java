package almacen;

public class Articulo {

    private String nombre;
    private double precio;

    /* Metodo Constructor: para darle valor a los atributos, inicializar. */

    public Articulo(String nombre, double precio ) {

        this.nombre=nombre;
        this.precio=precio;

    }

    /* Metodos Accesores: Son los get, son para devolver valor de lo que hay en el atributo del objeto indicado */

    public double getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }


    public boolean masBaratoQue(Articulo a){

        return a.getPrecio()>this.precio;
    }

    public void asignarPrecio(double valor){
        precio=valor;
    }

    public void asignarNombre(String nombreArticulo){

        nombre=nombreArticulo;
    }

}



