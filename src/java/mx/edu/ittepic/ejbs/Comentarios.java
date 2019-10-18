/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.ejbs;

import javax.ejb.Remote;
import javax.ejb.Stateful;

/**
 *
 * @author Erick Everaldo
 */


@Stateful
@Remote (ComentariosRemote.class)
public class Comentarios implements ComentariosRemote {
    
}
