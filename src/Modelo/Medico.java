package Modelo;


public class Medico {
    private String MedIdentificacion;
    private String MedNombre;
    private String MedApellidos;
    
    public Medico(String id, String nom, String ape) {
        MedIdentificacion = id;
        MedNombre = nom;
        MedApellidos = ape;
    }

    public String getMedIdentificacion() {
        return MedIdentificacion;
    }

    public void setMedIdentificacion(String MedIdentificacion) {
        this.MedIdentificacion = MedIdentificacion;
    }

    public String getMedNombre() {
        return MedNombre;
    }

    public void setMedNombre(String MedNombre) {
        this.MedNombre = MedNombre;
    }

    public String getMedApellidos() {
        return MedApellidos;
    }

    public void setMedApellidos(String MedApellidos) {
        this.MedApellidos = MedApellidos;
    }

}
