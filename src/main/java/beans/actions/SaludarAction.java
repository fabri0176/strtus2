/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.actions;

import org.apache.logging.log4j.*;
import com.opensymphony.xwork2.ActionSupport;
/**
 *
 * @author Fabricio
 */
public class SaludarAction extends ActionSupport {

    Logger log = LogManager.getLogger(SaludarAction.class);

    private String saludosAtr;

    public String execute() {
        log.info("Ejecutando metodo execute desde struts2");
        this.setSaludosAtr("Saludos desde Struts2");
        return SUCCESS;
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }

}
