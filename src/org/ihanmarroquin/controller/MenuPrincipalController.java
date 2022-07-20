package org.ihanmarroquin.controller;

// Hecho el 19/05/2021 ---- Terminado 20/05/2021

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.ihanmarroquin.system.Principal;

/**
 *
 * @author HP
 */
public class MenuPrincipalController implements Initializable{
    private Principal escenarioPrincipal;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void ventanaProgramador(){
        escenarioPrincipal.ventanaProgramador();
    }
    
    public void ventanaAdministracion(){
        escenarioPrincipal.ventanaAdministracion();
    }
    
    public void ventanaTipoCliente(){
        escenarioPrincipal.ventanaTipoCliente();
    }
    
    public void ventanaLocales(){
        escenarioPrincipal.ventanaLocales();
    }
    
    public void ventanaClientes(){
        escenarioPrincipal.ventanaClientes();
    }
    
    public void ventanaDepartamentos(){
        escenarioPrincipal.ventanaDepartamentos();
    }
    
    public void ventanaCargos(){
        escenarioPrincipal.ventanaCargos();
    }
    
    public void ventanaProveedores(){
        escenarioPrincipal.ventanaProveedores();
    }
    
    public void ventanaCuentasPorPagar(){
        escenarioPrincipal.ventanaCuentasPorPagar();
    }
    
    public void ventanaHorario(){
        escenarioPrincipal.ventanaHorario();
    }
    
    public void ventanaCuentasPorCobrar(){
        escenarioPrincipal.ventanaCuentasPorCobrar();
    }
    
    public void ventanaEmpleados(){
        escenarioPrincipal.ventanaEmpleados();
    }
    
    public void ventanaLogin(){
        escenarioPrincipal.ventanaLogin();
    }
}
