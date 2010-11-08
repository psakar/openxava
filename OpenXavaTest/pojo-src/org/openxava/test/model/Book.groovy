package org.openxava.test.model
import org.openxava.model.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
class Book extends Identifiable {
	
	String titulo
	
	@ManyToOne
	Author author
	
	@Stereotype("MEMO")
	String synopsis

}
