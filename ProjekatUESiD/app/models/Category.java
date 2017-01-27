package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.data.validation.MinSize;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Category {
	
	@Column(nullable = false, unique = true, length = 30)
	public String name;

	public Category(String name) {
		super();
		this.name = name;
	}
}
