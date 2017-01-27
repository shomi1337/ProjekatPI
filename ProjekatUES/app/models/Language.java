package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Language extends Model {
	
	@Column(nullable = false, unique = true,length = 30)
	public String name;

	public Language(String name) {
		super();
		this.name = name;
	}
}
