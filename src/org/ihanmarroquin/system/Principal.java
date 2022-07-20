package org.ihanmarroquin.system;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.ihanmarroquin.controller.AdministracionController;
import org.ihanmarroquin.controller.CargosController;
import org.ihanmarroquin.controller.ClientesController;
import org.ihanmarroquin.controller.CuentaPorCobrarController;
import org.ihanmarroquin.controller.CuentaPorPagarController;
import org.ihanmarroquin.controller.DatosProgramadorController;
import org.ihanmarroquin.controller.DepartamentosController;
import org.ihanmarroquin.controller.DisponibilidadController;
import org.ihanmarroquin.controller.EmpleadoController;
import org.ihanmarroquin.controller.HorarioController;
import org.ihanmarroquin.controller.LocalesController;
import org.ihanmarroquin.controller.LoginController;
import org.ihanmarroquin.controller.MenuPrincipalController;
import org.ihanmarroquin.controller.ProveedoresController;
import org.ihanmarroquin.controller.TipoClienteController;
import org.ihanmarroquin.controller.UsuarioController;


/**
 *
 * @author HP
 */
public class Principal extends Application {
   private final String PAQUETE_VISTA = "/org/ihanmarroquin/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    
    @Override
    public void start(Stage escenarioPrincipal) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("KinalMall 2017441");
//        Parent root = FXMLLoader.load(getClass().getResource("/org/ihanmarroquin/view/MenuPrincipalView.fxml"));
//        Scene escena = new Scene(root);
//        escenarioPrincipal.setScene(escena);
//        menuPrincipal();
        ventanaLogin();
        escenarioPrincipal.show();
    }  
   
    public void menuPrincipal(){
        try{
            MenuPrincipalController menu = (MenuPrincipalController)cambiarEscena("MenuPrincipalView.fxml",674,450);
            menu.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ventanaProgramador(){
        try{
            DatosProgramadorController programador = (DatosProgramadorController)cambiarEscena("DatosProgramadorView.fxml",600,400);
            programador.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ventanaAdministracion(){
        try{
            AdministracionController admin = (AdministracionController)cambiarEscena("AdministracionView.fxml", 800, 400);
            admin.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ventanaTipoCliente(){
        try{
            TipoClienteController tipoCliente = (TipoClienteController)cambiarEscena("TipoClienteView.fxml", 1050, 400);
            tipoCliente.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void ventanaLocales(){
        try{
            LocalesController locales = (LocalesController)cambiarEscena("LocalesView.fxml", 1450, 400);
            locales.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
    public void ventanaDisponibilidad(){
        try{
            DisponibilidadController disponibilidad = (DisponibilidadController)cambiarEscena("DisponibilidadView.fxml", 400, 200);
            disponibilidad.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaClientes(){
        try{
            ClientesController clientes = (ClientesController)cambiarEscena("ClientesView.fxml", 1400, 400);
            clientes.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaDepartamentos(){
        try{
            DepartamentosController departamento = (DepartamentosController)cambiarEscena("DepartamentosView.fxml", 900, 400);
            departamento.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCargos(){
        try{
            CargosController cargos = (CargosController)cambiarEscena("CargosView.fxml", 1050, 400);
            cargos.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaProveedores(){
        try{
            ProveedoresController provee = (ProveedoresController)cambiarEscena("ProveedoresView.fxml", 1600, 400);
            provee.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCuentasPorPagar(){
        try{
            CuentaPorPagarController cuentas = (CuentaPorPagarController)cambiarEscena("CuentasPorPagarView.fxml", 1200, 400);
            cuentas.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaHorario(){
        try{
            HorarioController horario = (HorarioController)cambiarEscena("HorariosView.fxml", 1200, 400);
            horario.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaUsuario(){
        try{
            UsuarioController usuario = (UsuarioController)cambiarEscena("UsuariosView.fxml", 700, 450);
            usuario.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaCuentasPorCobrar(){
        try{
            CuentaPorCobrarController cobrar = (CuentaPorCobrarController)cambiarEscena("CuentasPorCobrarView.fxml", 1200, 400);
            cobrar.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaEmpleados(){
        try{
            EmpleadoController emple = (EmpleadoController)cambiarEscena("EmpleadosView.fxml", 1600, 400);
            emple.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ventanaLogin(){
        try{
            LoginController login = (LoginController)cambiarEscena("LoginView.fxml", 700, 400);
            login.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws IOException{
         Initializable resultado = null;
         FXMLLoader cargadorFXML = new FXMLLoader();
         InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
         cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
         cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
         escena = new Scene((AnchorPane)cargadorFXML.load(archivo), ancho, alto);
         escenarioPrincipal.setScene(escena);
         escenarioPrincipal.sizeToScene();
         resultado = (Initializable)cargadorFXML.getController();
         return resultado;
    
    }
}