package clasesProyecto;

import java.util.Objects;

public class Ropa extends Articulo{

    private int talla;
    private String color;
    private String tipoCierre;

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ropa ropa = (Ropa) o;
        return talla == ropa.talla && Objects.equals(color, ropa.color) && Objects.equals(tipoCierre, ropa.tipoCierre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), talla, color, tipoCierre);
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "talla=" + talla +
                ", color='" + color + '\'' +
                ", tipoCierre='" + tipoCierre + '\'' +
                '}';
    }

    public Ropa(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen,
                boolean activo, int talla, String tipoCierre, String color) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
        this.talla = talla;
        this.tipoCierre = tipoCierre;
        this.color = color;



    }
}
