package Modelo;


public class Consultorio {
    private String ConNumero;
    private String ConNombre;

    public Consultorio (String Num, String Nom){
        ConNumero = Num;
        ConNombre = Nom;
    }
    public String getConNumero() {
        return ConNumero;
    }

    public void setConNumero(String ConNumero) {
        this.ConNumero = ConNumero;
    }

    public String getConNombre() {
        return ConNombre;
    }

    public void setConNombre(String ConNombre) {
        this.ConNombre = ConNombre;
    }
}
