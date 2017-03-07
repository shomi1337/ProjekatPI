package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Magacin extends Model {
	@Column(nullable = false, length = 30)
	public String naziv;
	@OneToMany(mappedBy = "magacin")
	public List<Artikal> artikli;
	
	public Magacin(String naziv) {
		super();
		this.naziv = naziv;
		artikli = new ArrayList<Artikal>();
	}
}
