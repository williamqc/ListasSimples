/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.LinkedList;

/**
 *
 * @author lilek
 */
public class Persona {
    LinkedList nombre = new LinkedList();
    LinkedList dni = new LinkedList();

public void ingresaPersona(String xNombre, int xdni){
nombre.offer(xNombre);
dni.offer(xdni);
 }
public LinkedList retornarPersona(){
    return nombre;
}   
public LinkedList retornarDni(){
    return dni;
}
}