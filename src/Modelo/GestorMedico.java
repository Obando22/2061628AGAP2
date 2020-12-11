package Modelo;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class GestorMedico {
    private static LinkedList<Medico> medicos;
    Connection con;
    Conexion conectar = new Conexion();
    PreparedStatement pst;
    public GestorMedico(){
        medicos=new LinkedList<Medico>();
    }
    public void RegistrarMedicos(Medico medico){
        try {
            con = conectar.getConnection();
            pst = con.prepareStatement("INSERT INTO medicos VALUES(?,?,?)");
            pst.setString(1,medico.getMedIdentificacion());
            pst.setString(2,medico.getMedNombre());
            pst.setString(3,medico.getMedApellidos());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Médico Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        medicos.add(medico);
    }
    public static LinkedList<Medico> getMedicobyParametro(int parametro, String valor){
        LinkedList<Medico> resultado=new LinkedList<Medico>();
        for(Medico med:medicos){
            switch(parametro){
                case 1: if(med.getMedIdentificacion().equals(valor))
                    resultado.add(med);
                break;
                case 2: if(med.getMedNombre().equals(valor))
                    resultado.add(med);
                break;
                case 3: if(med.getMedApellidos().equals(valor))
                    resultado.add(med);
                break;
            }
        }
        return null;
    }
}
