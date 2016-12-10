package controllers;

import java.util.List;

import models.Drzava;
import play.data.validation.Required;
import play.mvc.Controller;

public class Drzave extends Controller{

    public static void show(){
    	List<Drzava> drzave = Drzava.findAll();
    	render(drzave);
    }
    
    
}
