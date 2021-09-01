/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;

import Models.ConexionMotor;
import Models.ValidarMotor;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author yo
 */
@Controller
public class ListadoController {
     private JdbcTemplate jdbc;
    private ValidarMotor validar;
    
    public ListadoController(){
        ConexionMotor con= new ConexionMotor();
        jdbc=new JdbcTemplate(con.conectar());
        validar=new ValidarMotor();   
    }
    @RequestMapping("listadoMotor.htm")
    public ModelAndView listado(){
        ModelAndView mav= new ModelAndView();
        String sql="Select * from motores";
       
        List motores= this.jdbc.queryForList(sql);
        
        mav.addObject("motores",motores);
        mav.setViewName("listadoMotor");
        
        return mav;
    }
    
}
