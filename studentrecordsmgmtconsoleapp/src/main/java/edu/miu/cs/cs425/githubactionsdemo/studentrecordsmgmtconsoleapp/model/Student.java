package edu.miu.cs.cs425.githubactionsdemo.studentrecordsmgmtconsoleapp.model;

import java.time.LocalDate;

public clas Student {
	private String studentId;
	private String name;
	private LocalDate dateOfAdmission;

	public Student(String studentId, String name, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = dateOfAdmission;
	}

	public Student() {
		this(null, null, null);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return String.format("Student [studentId=%s, name=%s, dateOfAdmission=%s]", studentId, name, dateOfAdmission);
	}
	
	

}
