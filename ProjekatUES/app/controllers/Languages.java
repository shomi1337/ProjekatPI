package controllers;

import java.util.List;

import models.Language;
import play.data.validation.Required;
import play.mvc.Controller;

public class Languages extends Controller{

	public static void show(String mode){
    	List<Language> lang = Language.findAll();
    	if (mode == null || mode.equals(""))
    		 mode = "edit";
    	render(lang, mode);
    }
    
   
    
    public static void create(String name) {
//		validation.required(oznaka);
//		validation.required(naziv);
//		validation.minSize(oznaka, 2);
//		validation.maxSize(oznaka, 5);
//		if(validation.hasErrors()) {
//			 for(play.data.validation.Error error : validation.errors()) {
//			 System.out.println(error.message());
//			 }
//			 validation.keep();
//			 show("add");
//			}
    	Language lang = new Language(name);
    	
		List<Language> langs = Language.findAll();
		lang.save();
		show("add");
	}

	public static void edit(String name,Long id) {
		Language l = Language.findById(id);
		if(l!=null){
			l.name=name;
			l.save();
		}
		show("");
	}

	public static void filter() {
	
	}
    
	public static void remove(Long id){
		Language lang = Language.findById(id);
		lang.delete();
		show("");
	}
    
}
