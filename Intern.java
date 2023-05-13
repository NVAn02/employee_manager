package lab1.ex2;

import java.util.ArrayList;

public class Intern extends Employee {
	private String majors;
	private String semester;
	private String university_name;
	ArrayList<Certificate> cer = new ArrayList<Certificate>();
	public Intern(String id, String fullName, String birthDay, String phone, String email) {
		super(id, fullName, birthDay, phone, email);
		super.setEmployeeType(2);
		employeeCount++;
	}
	public void showMe(String majors, String semester, String university_name) {
		this.majors = majors;
		this.semester = semester;
		this.university_name = university_name;
	}
	
	public String getMajors() {
		return majors;
	}
	public void setMajors(String majors) {
		this.majors = majors;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getUniversity_name() {
		return university_name;
	}
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
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
		System.out.println("id= " + super.getId() + ", fullName: " + super.getFullName() + ", birthDay: " + super.getBirthDay() + ", phone: " + super.getPhone() + ", email: " + super.getEmail() + ", Type: " + super.getEmployeeType() + ", Majors: " + this.getMajors() + ", Semester:" + this.getSemester() + "University: " + this.getUniversity_name());

	}

}
