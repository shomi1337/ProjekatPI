package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Zanimanje extends Model{

	@Column(nullable = false, unique = true)
	public String oznaka;
	@Column(nullable = false)
	public String naziv;
	
}
