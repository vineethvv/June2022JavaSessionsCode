package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		
		fh.medicalReasearch();
		fh.publishMedicalNews();
	
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.pediaServices();
		us.emergencyServices();
		us.OrthoServices();
		us.physioServices();

	}

}
