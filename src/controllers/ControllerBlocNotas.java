/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewBlocNotas;
import models.ModelBlocNotas;
import extras.DataValidation;
/**
 *clase que tiene el objeto de modelo y vista del bloc de notas y realiza un evento acorde a cada accion que realicemos
 * @author manl_
 */
public class ControllerBlocNotas {
    ModelBlocNotas modelBlocnotas;
    ViewBlocNotas viewBlocnotas;
    DataValidation dataValidation = new DataValidation();

    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== viewBlocnotas.jMI_abrir)
             jmi_abrir_actionPerformed();   
            else if(e.getSource()== viewBlocnotas.jMI_guardar)
                jmi_guardar_actionPerformed();
            else if(e.getSource() == viewBlocnotas.jMI_cifrar)
                jmi_cifrar_actionPerformed();
            else if(e.getSource() == viewBlocnotas.jMI_descifrar)
                jmi_descifrar_actionPerformed();
        }
    };
    /**
     * metodo que lee el archivo de texto y lo muestra en el area de texto
     */
    public void jmi_abrir_actionPerformed(){
        modelBlocnotas.openFile();
        modelBlocnotas.readFile();
        viewBlocnotas.jta_texto.setText(modelBlocnotas.getLinea());
    }
    /**
     * metodo que guarda todo el texto en una variable de tipo cadena y lo guarda en el archivo de texto 
     */
    public void jmi_guardar_actionPerformed(){
        modelBlocnotas.setMessage(viewBlocnotas.jta_texto.getText());
        modelBlocnotas.writeFile();
    }
    
    /**
     * constructor que permite la interaccion de los modelos y las vistas para su manipulacion
     * @param modelBlocnotas objeto modelo que contiene variables y metodos para leer y agregar texto el archivo
     * @param viewBlocnotas  objeto vista que permite visualizar el archivo de texto 
     */
     public ControllerBlocNotas(ModelBlocNotas modelBlocnotas, ViewBlocNotas viewBlocnotas) {
        this.modelBlocnotas = modelBlocnotas;
        this.viewBlocnotas = viewBlocnotas;
        this.viewBlocnotas.jMI_abrir.addActionListener(al);
        this.viewBlocnotas.jMI_guardar.addActionListener(al);
        this.viewBlocnotas.jMI_cifrar.addActionListener(al);
        this.viewBlocnotas.jMI_descifrar.addActionListener(al);
        initComponents();
    }
     /**
      * Metodo que permite el cifrar y guardar el archivo leido, tomando como referencia un numero indicado 
      * por el usuario
      */
     public void jmi_cifrar_actionPerformed(){
         modelBlocnotas.setMessage(viewBlocnotas.jta_texto.getText());
         modelBlocnotas.setCriptacion(dataValidation.string2Int(viewBlocnotas.jtf_cifrado.getText()));
         modelBlocnotas.encriptar();
         viewBlocnotas.jta_texto.setText(modelBlocnotas.getMessage());
         modelBlocnotas.writeFile();
     }
     /**
      * Metodo que permite leer archivos cifrados por este bloc de notas o similar tomando como
      * referencia el valor indicado por el usuario
      */
     public void jmi_descifrar_actionPerformed(){
         modelBlocnotas.setMessage(viewBlocnotas.jta_texto.getText());
         modelBlocnotas.setCriptacion(dataValidation.string2Int(viewBlocnotas.jtf_cifrado.getText()));
         modelBlocnotas.desencriptar();
         viewBlocnotas.jta_texto.setText(modelBlocnotas.getMessage());
     }
     
     /**
      * Metodo que permite la visualizacion de la aplicacion de java
      */
     public void initComponents(){
         this.viewBlocnotas.setVisible(true);
     }
}
