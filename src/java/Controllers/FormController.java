/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;


import Models.ConexionMotor;
import Models.Motores;
import Models.ValidarMotor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author yo
 */
@Controller
//@RequestMapping("formMotor.htm")
public class FormController {
    
    private JdbcTemplate jdbc;
    private ValidarMotor validar;
    
    public FormController(){
        ConexionMotor con= new ConexionMotor();
        jdbc=new JdbcTemplate(con.conectar());
        validar=new ValidarMotor();   
    }
    
    @RequestMapping(value="formMotor.htm",method=RequestMethod.GET)
    public ModelAndView FormMotor(){
        Motores m=new Motores();
        ModelAndView mav=new ModelAndView();
        mav.setViewName("formMotor");
        mav.addObject("m",m);
        return mav;
    }
    
    @RequestMapping(value="formMotor.htm",method=RequestMethod.POST)
    public ModelAndView FormMotor(@ModelAttribute("m") Motores m,BindingResult result){
        
        validar.validate(m, result);
        if(result.hasErrors()){
            
            ModelAndView mav=new ModelAndView();
            mav.setViewName("formMotor");
            mav.addObject("m",new Motores());
            return mav;
        }else{
            jdbc.update("insert into motores (modelo,fabricante,potencia,peso,cantidad) values(?,?,?,?,?)"
                    ,m.getModelo(),m.getFabricante(),m.getPotencia(),m.getPeso(),m.getCantidad());
            return new ModelAndView("redirect:/listadoMotor.htm");
        }
        
    }
    
}
