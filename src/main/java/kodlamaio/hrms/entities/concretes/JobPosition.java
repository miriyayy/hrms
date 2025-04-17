package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kodlamaio.hrms.entities.concretes.JobPosition;
import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")

public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name = "job_positions_id")
	private int id;
	
	@Column(name="position_name")
	private String position_name;
	
	public JobPosition() {
		
	}

	public JobPosition(int id, String position_name) {
		super();
		this.id = id;
		this.position_name = position_name;
	}
}
