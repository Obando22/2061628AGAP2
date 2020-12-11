package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class MedicoControl {
    Vista.RegMedicoInternalFrame medicoVista;
    Modelo.Medico medicoModelo;
    Modelo.GestorMedico gestorMedicoModelo;
    public MedicoControl(Vista.RegMedicoInternalFrame medicoVista){
        this.medicoVista=medicoVista;
        gestorMedicoModelo=new Modelo.GestorMedico();
    }
//@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(medicoVista.btn_registrar)){
            String Identificacion=medicoVista.txt_medIdentificacion.getText();
            String Nombre=medicoVista.txt_medNombre.getText();
            String Apellido=medicoVista.txt_medApellido.getText();
            medicoModelo = new Modelo.Medico(Identificacion, Nombre, Apellido);
            gestorMedicoModelo.RegistrarMedicos(medicoModelo);
        }
        else if(e.getSource().equals(medicoVista.btn_nuevo)){
            medicoVista.txt_medIdentificacion.setText("");
            medicoVista.txt_medNombre.setText("");
            medicoVista.txt_medApellido.setText("");
        }
    }

}
