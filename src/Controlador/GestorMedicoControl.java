package Controlador;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorMedicoControl {
    Modelo.GestorMedico medicoModelo;
    Vista.ConsMedicoInternalFrame consultarMedicoVista;
    public GestorMedicoControl(Vista.ConsMedicoInternalFrame consultarMedicoVista){
        this.consultarMedicoVista = consultarMedicoVista;
        medicoModelo=new Modelo.GestorMedico();
    }
//@Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor=consultarMedicoVista.txt_valor.getText();
        int parametro=0;
        if(consultarMedicoVista.rdb_identificacion.isSelected()){
            parametro=1;
        }
        else if(consultarMedicoVista.rdb_nombres.isSelected()){
            parametro=2;
        }
        else if(consultarMedicoVista.rdb_apellidos.isSelected()){
            parametro=3;
        }
        LinkedList<Modelo.Medico> medico = medicoModelo.getMedicobyParametro(parametro, valor);
        String registro[]=new String[5];
        String []Titulos = {"Identificacion","Nombre","Apellidos"};
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        for(Modelo.Medico m:medico){
            registro[0]=m.getMedIdentificacion();
            registro[1]=m.getMedNombre();
            registro[2]=m.getMedApellidos();
        }
        consultarMedicoVista.Tbl_datos.setModel(tmodelo);
    }
}
