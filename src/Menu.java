import java.io.Serializable;
import java.util.Random;

public class Menu implements Serializable {
    private String entrante;
    private String primero;
    private String segundo;
    private String postre;
    private int precio = 15;

    public Menu() {
        File reader = new File();
        String[] entrantes = (reader.fileReader("src/entrantes.txt")).split("\n");
        String[] primeros = (reader.fileReader("src/primeros.txt")).split("\n");
        String[] segundos = (reader.fileReader("src/segundos.txt")).split("\n");
        String[] postres = (reader.fileReader("src/postres.txt")).split("\n");

        Random rdm = new Random();
        this.entrante = entrantes[rdm.nextInt(entrantes.length)];
        this.primero = primeros[rdm.nextInt(primeros.length)];
        this.segundo = segundos[rdm.nextInt(segundos.length)];
        this.postre = postres[rdm.nextInt(postres.length)];
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
        return "Menú del día:" + "\n" +
                "Entrante: " + entrante + "\n" +
                "Primero: " + primero + "\n" +
                "Segundo: " + segundo + "\n" +
                "Postre: " + postre + "\n" +
                "Precio: " + precio;
    }
}
