/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author yo
 */
public class ConexionMotor {
    public DriverManagerDataSource conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/motorland");
        dataSource.setUsername("root");
        dataSource.setPassword("");
            
        return dataSource;

    }
}
