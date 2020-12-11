package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class ConsultorioControl {
    Vista.RegConsultorioInternalFrame consultorioVista;
    Modelo.Consultorio consultorioModelo;
    Modelo.GestorConsultorio gestorconsultorioModelo;
    public ConsultorioControl(Vista.RegConsultorioInternalFrame consultorioVista){
        this.consultorioVista=consultorioVista;
        gestorconsultorioModelo=new Modelo.GestorConsultorio();
    }
//@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(consultorioVista.btn_Registrar)){
            String ConNumero=consultorioVista.txt_conNumero.getText();
            String ConNombre=consultorioVista.txt_conNombre.getText();
            consultorioModelo = new Modelo.Consultorio(ConNumero, ConNombre);
            gestorconsultorioModelo.RegistrarConsultorio(consultorioModelo);
        }
        else if(e.getSource().equals(consultorioVista.btn_Nuevo)){
            consultorioVista.txt_conNumero.setText("");
            consultorioVista.txt_conNombre.setText("");
        }
    }
}
