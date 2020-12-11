package Controlador;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorPacienteControl {
    Modelo.GestorPaciente pacientesModelo;
    Vista.ConsPacienteInternalFrame consultarPacienteVista;
    public GestorPacienteControl(Vista.ConsPacienteInternalFrame consultarPacienteVista){
        this.consultarPacienteVista=consultarPacienteVista;
        pacientesModelo=new Modelo.GestorPaciente();
    }
//@Override
    public void actionPerformed(ActionEvent e){
        //public void ConsultarPacientes(GestorPaciente gestorPaciente){
        DefaultTableModel tmodelo;
        String valor=consultarPacienteVista.txt_valor.getText();
        int parametro=0;
        if(consultarPacienteVista.rdb_identificacion.isSelected()){
            parametro=1;
        }
        else if(consultarPacienteVista.rdb_nombres.isSelected()){
            parametro=2;
        }
        else if(consultarPacienteVista.rdb_apellidos.isSelected()){
            parametro=3;
        }
        else if(consultarPacienteVista.rdb_genero.isSelected()){
            parametro=4;
        }
        LinkedList<Modelo.Paciente> pacientes = pacientesModelo.getPacientebyParametro(parametro, valor);
        String registro[]=new String[5];
        String []Titulos = {"Identificacion","Nombre","Apellidos","Fecha Nacimiento","Genero"};
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        for(Modelo.Paciente p:pacientes){
            registro[0]=p.getIdentificacion();
            registro[1]=p.getNombre();
            registro[2]=p.getApellido();
            registro[3]=p.getFechaNacimiento();
            registro[4]=p.getSexo();
            tmodelo.addRow(registro);
        }
        consultarPacienteVista.Tbl_datos.setModel(tmodelo);
    }
}
