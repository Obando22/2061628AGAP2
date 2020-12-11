package Modelo;


public class Paciente {
    public String Identificacion;
    public String Nombre;
    public String Apellido;
    public String FechaNacimiento;
    public String Sexo;

    public Paciente(String id, String nom, String ape, String fec, String sex) {
        Identificacion=id;
        Nombre = nom;
        Apellido = ape;
        FechaNacimiento = fec;
        Sexo = sex;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }


    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }


    public String getSexo() {
        return Sexo;
    }


    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}
