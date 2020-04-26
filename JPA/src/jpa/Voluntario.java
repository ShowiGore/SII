package jpa;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voluntario extends Usuario implements Serializable {
	
        @Column(unique=true)
	private String email;
	
	public Voluntario() {
		super();
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
        
        public int hashCode() {
            int hash = 0;
            hash += (email != null ? email.hashCode() : 0);
            return hash;
        }
        
        public boolean equals(Object object) {
             
            if (!(object instanceof Voluntario)) {
                return false;
            }
            Voluntario other = (Voluntario) object;

            if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
                return false;
            }
            return true;
        }
        
}
