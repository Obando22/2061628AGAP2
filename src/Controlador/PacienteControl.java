package Controlador;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import Vista.RegPacienteInternalFrame;
import java.text.SimpleDateFormat;

public class PacienteControl {
    Vista.RegPacienteInternalFrame pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;
    
    public PacienteControl(Vista.RegPacienteInternalFrame pacienteVista){   
        this.pacienteVista=pacienteVista;
        gestorpacienteModelo = new Modelo.GestorPaciente();   
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(pacienteVista.RegistrarBtn)){
            String identificacion=pacienteVista.txt_identificacion.getText();
            String nombres=pacienteVista.txt_nombre.getText();
            String apellidos=pacienteVista.txt_apellido.getText();
            SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
            String fecha_nacimiento=formato.format(pacienteVista.Dtd_Fecha_Nacimiento1.getDate());
            String genero="";
            if(pacienteVista.rdb_masculino.isSelected()){
                genero="M";
            }
            if(pacienteVista.rdb_femenino.isSelected()){
                genero="F";
            }
            pacienteModelo=new Modelo.Paciente(identificacion,nombres,apellidos,fecha_nacimiento,genero);
            gestorpacienteModelo.RegistrarPacientes(pacienteModelo);    
        }
        if(e.getSource().equals(pacienteVista.NuevoBtn)){
            pacienteVista.txt_identificacion.setText("");
            pacienteVista.txt_nombre.setText("");
            pacienteVista.txt_apellido.setText("");
            pacienteVista.Dtd_Fecha_Nacimiento1.setDate(null);
            pacienteVista.rdb_masculino.setSelected(true);
            pacienteVista.rdb_femenino.setSelected(false);
            pacienteVista.txt_identificacion.requestFocus();      
        }
    }
}
