package com.tasksoops.HospitalBill;

public class Patient {
	private int patientId;
	private String name;
	private int daysAdmitted;
	private double dailyCharges;
	private double medicineCharges;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysAdmitted() {
		return daysAdmitted;
	}

	public void setDaysAdmitted(int daysAdmitted) {
		this.daysAdmitted = daysAdmitted;
	}

	public double getDailyCharges() {
		return dailyCharges;
	}

	public void setDailyCharges(double dailyCharges) {
		this.dailyCharges = dailyCharges;
	}

	public double getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.medicineCharges = medicineCharges;
	}

	public double calculateBill() {
		return (getDaysAdmitted() * getDailyCharges()) + getMedicineCharges();
	}

	public double calculateDiscount() {
		if (getDaysAdmitted() >= 10) {
			return calculateBill() * 0.10;
		} else if (getDaysAdmitted() >= 5) {
			return calculateBill() * 0.05;
		}

		return calculateBill();
	}

	public double displayBill() {
		return calculateBill() - calculateDiscount();
	}

}
