package lab1.ex2;
import java.util.ArrayList;

public class Experienced extends Employee {
	private String expInYear;
	private String proSkill;
	ArrayList<Certificate> cer = new ArrayList<Certificate>();
	
	public Experienced(String id, String fullName, String birthDay, String phone, String email) {
		super(id,fullName,birthDay, phone, email);
		super.setEmployeeType(0);
		employeeCount++;		
	}
	public void showMe(String expInYear, String proSkill) {
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	
	public String getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(String expInYear) {
		this.expInYear = expInYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	public void setCertificate(String certificateID, String certificateName, String certificateRank, String certificateDate) {
		cer.add(new Certificate(certificateID, certificateName, certificateRank, certificateDate));
	}
	public Certificate getCertificate(String id_certificate) {
		for(int i=0; i<cer.size();i++) {
			if(id_certificate.equals(cer.get(i).getCertificateID())) {
				return cer.get(i);
			} 		
		}
		return null;
	}
	public void showCertificate(String id_emp) {
		System.out.println("Bang cap cua nhan vien co id " + id_emp + " la: "  );
		for(int i=0; i<cer.size();i++) {
			System.out.println("ID: " + cer.get(i).getCertificateID() + " Name: " + cer.get(i).getCertificateName() + " Rank: " + cer.get(i).getCertificateRank() + " Date: " + cer.get(i).getCertificateDate());
		}
	}
	@Override
	public void showInfo() {
		System.out.println("id= " + super.getId() + ", fullName: " + super.getFullName() + ", birthDay: " + super.getBirthDay() + ", phone: " + super.getPhone() + ", email: " + super.getEmail() + ", Type: " + super.getEmployeeType() + ", ExpYear: " + this.getExpInYear() + ", ProSkill:" + this.getProSkill());
	}
	
	
}
