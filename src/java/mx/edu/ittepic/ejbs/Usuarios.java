/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.ejbs;

import javax.ejb.Stateful;
import javax.ejb.Remote;

/**
 *
 * @author Erick Everaldo
 */
@Stateful
@Remote (UsuariosRemote.class)

public class Usuarios implements UsuariosRemote {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}