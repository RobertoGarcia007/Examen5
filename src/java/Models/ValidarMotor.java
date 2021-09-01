/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author yo
 */
public class ValidarMotor implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Motores.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
       Motores m=(Motores) o;
       if (m.getModelo().length()<=5){
           errors.rejectValue("modelo", "verificarModelo","Modelo: debe tener mas de 5 caracteres");
       }
       if(m.getPeso()<=0.0){
           errors.rejectValue("peso", "validarPeso", "Peso: debe pesar mas de 0");
       }
       if(m.getPotencia()<=0.0){
           errors.rejectValue("potencia", "validarPotencia", "Potencia: debe superar 0");
       }
       if(m.getCantidad()<=0){
           errors.rejectValue("cantidad", "validarCantidad", "Cantidad: debe superar  0");
       }
       
    }

    
    
}
