package controllers;

import java.util.List;

import models.Drzava;
import models.NaseljenoMesto;
import play.mvc.Controller;

public class NaseljenaMesta extends Controller{

	public static void show(){
		List<NaseljenoMesto> naseljenaMesta = NaseljenoMesto.findAll();
		List<Drzava> drzave = Drzava.findAll();
		render(naseljenaMesta, drzave);
	}

}
