import java.util.*;
class Patient{
	int a;
	int P_id; String P_name;int P_age;String Reason_for_visit;
	Patient(int a,int P_id,String P_Name, int P_age, String Reason_for_visit){
	this.a= a;
	this.P_id = P_id;
	this.P_name = P_name;
	this.P_age = P_age;
	this.Reason_for_visit= Reason_for_visit;
	}
	void display(){
		System.out.println("S_ No: "+a+"\nPatient ID: "+P_id +"\n Patient Name: "+P_name
	                        + "\nP_age: "+ P_age + "\nP_Reason For Visit: "+ Reason_for_visit);

	}
}
class Node{
	Patient patient;
	Node next;
	Node(Patient patient){
		this.patient = patient;
		this.next = null;
	}
}
class EmergencyHospita{
  Node rear;
  Node front;
  EmergencyHospita(){
  	this.rear =null;
  	this.front= null;
  }
  void Add(Patient patient){
  	Node newPatient = new Node(patient);
  	if(rear == null){
  		rear = newPatient;
  		front = newPatient;
  		return;
  	}
  	newPatient.next = rear;
  	rear = newPatient;

  }

  void displays()
  {
Node cur = front;
   while(cur!= null){
   	cur.patient.display();
   	cur = cur.next;
   }


  }

}


class main{
	public static void main(String arg[]){
		EmergencyHospita list = new EmergencyHospita();

Scanner input = new Scanner(System.in);
int b;
System.out.println("\n\t==== Emergency Hospital System === ");
System.out.println("\n\t1. Add Patient");
System.out.println("\n\t2. Call Next Patient");
System.out.println("\n\t3. View Waiting Patients");
System.out.println("\n\t4. View Total Waiting Patients");
System.out.println("\n\t5. Exit");
System.out.println("\n Enter any key!!");
b = input.nextInt();

int a;

int P_id;
String P_name;
int P_age;
String Reason_for_visit;
if(b==1){
	System.out.println("== Welcome to Add Patient Portal ==");
	System.out.println("S.No: ");
	a = input.nextInt();
	System.out.println("Enter Patient ID: ");
	P_id = input.nextInt();
	   input.nextLine();
	System.out.println("Enter Patient Name: ");
	P_name = input.nextLine();
	System.out.println("Patient Age: ");
	P_age = input.nextInt();
	input.nextLine();
	System.out.println("Reason for visit: ");
	Reason_for_visit = input.nextLine();
Patient p = new Patient(a,P_id,P_name,P_age,Reason_for_visit);
list.Add(p);
return;
}
if(b== 2){
	list.displays();
	return;
}


	}
}