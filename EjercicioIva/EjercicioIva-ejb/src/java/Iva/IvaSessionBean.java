/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iva;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author super
 */
@WebService
@Stateless
public class IvaSessionBean implements IvaSessionBeanLocal {

    @Override
    public Double ivaMethod(double cantidad, int porcentaje) {
       int valorPorcentaje = porcentaje % 100;
        return(cantidad * valorPorcentaje);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
