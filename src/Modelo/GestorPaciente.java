package Modelo;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorPaciente {
    private static LinkedList<Paciente> pacientes;
   
   // private static Connection conn;
    Connection con;
    Conexion conectar = new Conexion();
    PreparedStatement pst;
    public GestorPaciente(){
        pacientes=new LinkedList<>();
    }
    public void RegistrarPacientes(Paciente paciente){
        try {
            con = conectar.getConnection();
            pst = con.prepareStatement("INSERT INTO pacientes VALUES(?,?,?,?)");
            pst.setString(1,paciente.getIdentificacion());
            pst.setString(2,paciente.getNombre());
            pst.setString(3,paciente.getApellido());
            pst.setString(4,paciente.getFechaNacimiento());
            pst.setString(4,paciente.getSexo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Paciente Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        pacientes.add(paciente);
    }
    public static LinkedList<Paciente> getPacientebyParametro(int parametro, String valor){
        LinkedList<Paciente> resultado=new LinkedList<Paciente>();
        for(Paciente pac:pacientes){
            switch(parametro){
                case 1: if(pac.getIdentificacion().equals(valor))
                    resultado.add(pac);
                break;
                case 2: if(pac.getNombre().equals(valor))
                    resultado.add(pac);
                break;
                case 3: if(pac.getApellido().equals(valor))
                    resultado.add(pac);
                break;
                case 4: if(pac.getSexo().equals(valor))
                    resultado.add(pac);
                break;
            }
        }
        return null;
    }
}
