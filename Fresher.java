package lab1.ex2;

import java.util.ArrayList;

public class Fresher extends Employee {
	private String graduation_date;
	private String graduation_rank;
	private String education;
	ArrayList<Certificate> cer = new ArrayList<Certificate>();
	public Fresher(String id, String fullName, String birthDay, String phone, String email) {
		super(id, fullName, birthDay, phone, email);
		super.setEmployeeType(1);
		employeeCount++;
	}
	
	public void showMe(String graduation_date, String graduation_rank, String education) {
		this.graduation_date = graduation_date;
		this.graduation_rank = graduation_rank;
		this.education = education;
	}
	public String getGraduation_date() {
		return graduation_date;
	}


	public void setGraduation_date(String graduation_date) {
		this.graduation_date = graduation_date;
	}


	public String getGraduation_rank() {
		return graduation_rank;
	}


	public void setGraduation_rank(String graduation_rank) {
		this.graduation_rank = graduation_rank;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
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
		System.out.println("id= " + super.getId() + ", fullName: " + super.getFullName() + ", birthDay: " + super.getBirthDay() + ", phone: " + super.getPhone() + ", email: " + super.getEmail() + ", Type: " + super.getEmployeeType() + ", Graduation_date: " + this.getGraduation_date() + ", Graduation_rank: " + this.getGraduation_rank() + ", Education: " + this.getEducation());

	}

}
