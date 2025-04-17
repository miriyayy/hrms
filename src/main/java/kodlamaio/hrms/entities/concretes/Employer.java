package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employers")

@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "users_id")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {
	
	/*@Id
	@Column(name="employer_id")
	private int id;
	user sınfıından miras alıyor zaten*/
	
	@Column(name="website")
	private String webSite;
	
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "industry")
    private String industry;

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@Override
	public String getUserType() {
		// TODO Auto-generated method stub
		return null;
	}
}
