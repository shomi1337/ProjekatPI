package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Radnik extends Model {
		@Column(nullable = false, unique = true)
		public String sifra;
		@Column(nullable = false)
		public String ime;
		@Column(nullable = false)
		public String prezime;
		@Column(nullable = true)
		public String devojacko;
		@Column(nullable = false)
		public String roditelj;
		@Column(nullable = false)
		public String nacionalnost;

		public Radnik(String ime, String prezime, String sifra) {
			super();
			this.ime = ime;
			this.prezime = prezime;
			this.sifra = sifra;
		}
	
}
