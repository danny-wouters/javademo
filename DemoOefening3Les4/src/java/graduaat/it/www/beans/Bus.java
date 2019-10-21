/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Danny
 */
@Named("bus")
@SessionScoped
public class Bus implements Serializable {;
    private ArrayList<Reiziger> reizigers = new ArrayList<>();

    public Bus() {
    }

    public ArrayList<Reiziger> getReizigers() {
        return reizigers;
    }

    public void setReizigers(ArrayList<Reiziger> reizigers) {
        this.reizigers = reizigers;
    }
    
    public String add(Reiziger reiziger) {
        if (reizigers.size() < 5) {
            reizigers.add(reiziger);
            return "lijst";
        }
        return "error";
    }
}
