package Controlador;
import Modelo.GestorConsultorio;
import Modelo.Consultorio;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class GestorConsultorioControl {
    Modelo.GestorConsultorio consultoriosModelo;
    Vista.ConsConsultorioInternalFrame consultarConsultorioVista;
    public GestorConsultorioControl(Vista.ConsConsultorioInternalFrame consultarConsultorioVista){
        this.consultarConsultorioVista = consultarConsultorioVista;
        consultoriosModelo=new Modelo.GestorConsultorio();
    }
//@Override
    public void actionPerformed(ActionEvent e){
        DefaultTableModel tmodelo;
        String valor=consultarConsultorioVista.txt_valor.getText();
        int parametro=0;
        if(consultarConsultorioVista.rdb_identificacion.isSelected()){
            parametro=1;
        }
        else if(consultarConsultorioVista.rdb_nombres.isSelected()){
            parametro=2;
        }
        LinkedList<Modelo.Consultorio> consultorio = consultoriosModelo.getConsultoriosbyParametro(parametro, valor);
        String registro[]=new String[5];
        String []Titulos = {"Numero","Nombre"};
        tmodelo = new DefaultTableModel();
        tmodelo.setColumnIdentifiers(Titulos);
        for(Modelo.Consultorio c:consultorio){
            registro[0]=c.getConNumero();
            registro[1]=c.getConNombre();
        }
        consultarConsultorioVista.tbl_datos.setModel(tmodelo);
    }
}
