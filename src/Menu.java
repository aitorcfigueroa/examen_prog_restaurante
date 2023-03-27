public class Menu {
    private String nombre;
    private String entrante;
    private String primero;
    private String segundo;
    private String postre;
    private int precio = 15;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrante() {
        return entrante;
    }

    public void setEntrante(String entrante) {
        this.entrante = entrante;
    }

    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Menu" + nombre + '\'' +
                "Entrante='" + entrante + '\'' +
                "Primero='" + primero + '\'' +
                "Segundo='" + segundo + '\'' +
                "Postre='" + postre + '\'' +
                "Precio=" + precio;
    }
}
