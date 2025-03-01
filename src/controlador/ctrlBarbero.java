
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Barbero;
import vista.frmMenu;


public class ctrlBarbero implements MouseListener {
    frmMenu vista;
    Barbero modelo;
    
    
    
    //constructor
    public ctrlBarbero(frmMenu Vista, Barbero Modelo){
        this.vista = Vista;
        this.modelo = Modelo;
        
        vista.btnAgregar.addMouseListener(this);
        modelo.MostrarBar(vista.tbBarbero);
        vista.btnEliminar.addMouseListener(this);
        vista.tbBarbero.addMouseListener(this);
        vista.btnActualizar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());


            modelo.limpiar(vista);
            modelo.GuardarBar();
            modelo.MostrarBar(vista.tbBarbero);

        }
        
        
        if(e.getSource() == vista.btnEliminar){
            modelo.EliminarBar(vista.tbBarbero);
            modelo.MostrarBar(vista.tbBarbero);
            modelo.ActualizarBar(vista.tbBarbero);
        }
        
        
         if(e.getSource() == vista.tbBarbero){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());

            
            modelo.MostrarBar(vista.tbBarbero);
            modelo.ActualizarBar(vista.tbBarbero);

        }
        
        
    
        
        
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
