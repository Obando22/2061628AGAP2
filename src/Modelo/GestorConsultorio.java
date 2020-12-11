package Modelo;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GestorConsultorio {
    private static LinkedList<Consultorio> consultorios;
    Connection con;
    Conexion conectar = new Conexion();
    PreparedStatement pst;
    public GestorConsultorio(){
        consultorios = new LinkedList<Consultorio>();
    }
    public void RegistrarConsultorio(Consultorio consultorio){
        try {
            con = conectar.getConnection();
            pst = con.prepareStatement("INSERT INTO consultorios VALUES(?,?)");
            pst.setString(1,consultorio.getConNumero());
            pst.setString(2,consultorio.getConNombre());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Médico Registrado");
        } catch (SQLException ex) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultorios.add(consultorio);
    }
    public static LinkedList<Paciente> getConsultoriobyParametro(int parametro, String valor){
        LinkedList<Consultorio> resultado=new LinkedList<Consultorio>();
        for(Consultorio con:consultorios){
            switch(parametro){
                case 1: if(con.getConNumero().equals(valor))
                    resultado.add(con);
                break;
                case 2: if(con.getConNombre().equals(valor))
                    resultado.add(con);
                break;
            }
        }
        return null;
    }

    public LinkedList<Consultorio> getConsultoriosbyParametro(int parametro, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
