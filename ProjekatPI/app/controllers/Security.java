package controllers;

import models.Drzava;

public class Security extends Secure.Security {
	
	static boolean authenticate(String username, String password) {
		if (username.equals("milos") && password.equals("admin"))
			return true;
		else if (username.equals("milos") && password.equals("admin"))
			return true;
		else if (username.equals("milos") && password.equals("admin"))
			return true;
		else if (username.equals("milos") && password.equals("admin"))
			return true;
		return false;
    }
}
