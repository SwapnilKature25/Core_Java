package com.nit.polymorphism.Aug28;

class Employee
{
	String employeeName;
	int employeeId;
	double basicSalary;
	double hraPer;
	double daPer;
	
	public Employee(String employeeName,int employeeId,double basicSalary,double hraPer,double daPer){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.basicSalary=basicSalary;
		this.hraPer=hraPer;
		this.daPer=daPer;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHraPer() {
		return hraPer;
	}

	public double getDaPer() {
		return daPer;
	}

	public double calculateGrossSalary() {
		return 0.0;
	}
	
	@Override
	public String toString()
	{
		return "Employee Name : "+employeeName+"\nEmployee Id : "+ employeeId;		
	}
}

class Developer extends Employee
{
	Developer(String employeeName,int employeeId,double basicSalary,double hraPer,double daPer){
		super(employeeName,employeeId,basicSalary,hraPer,daPer);
	}
	@Override
	public double calculateGrossSalary() {
		return getBasicSalary() + getHraPer() + getDaPer();
	}
	
	// here we use super.toString() because it is printing the super class
    // properties and along with that we have to print subclass properties in this
    // class
	
	@Override
	public String toString() 
	{
		return  super.toString()+"  Gross Salary : "+calculateGrossSalary();
	}
}


class Manager extends Employee{
	double projectAllowance;
	Manager(String employeeName,int employeeId,double basicSalary,double hraPer,double daPer,double projectAllowance){
		super(employeeName,employeeId,basicSalary,hraPer,daPer);
		this.projectAllowance=projectAllowance;
	}
	
	public double getProjectAllowance()
	{
		return projectAllowance;
	}
	
	@Override
	public double calculateGrossSalary() {
		return getBasicSalary() + getHraPer()+ getDaPer()+ projectAllowance;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Gross Salary : "+calculateGrossSalary();	
	}
}



class Trainer extends Employee{
	int batchCount;
	double perkPerBatch;
	
	
	Trainer(String employeeName,int employeeId,double basicSalary,double hraPer,double daPer,int batchCount,double perkPerBatch){
		super(employeeName,employeeId,basicSalary,hraPer,daPer);
		this.batchCount=batchCount;
		this.perkPerBatch=perkPerBatch;
	}
	
	
	public int getBatchCount() {
		return batchCount;
	}

	public double getPerkPerBatch() {
		return perkPerBatch;
	}

	@Override
	public double calculateGrossSalary() {
		return getBasicSalary() + getHraPer()+ getDaPer()+ (batchCount * perkPerBatch);
	}
	
	@Override
	public String toString() {
		return  super.toString()+"  Gross Salary : "+calculateGrossSalary();	
	}
}



class Sourcing extends Employee {
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	Sourcing(String employeeName,int employeeId,double basicSalary,double hraPer,double daPer,int enrollmentTarget,int enrollmentReached,double perkPerEnrollment ){
		super(employeeName,employeeId,basicSalary,hraPer,daPer);
		this.enrollmentTarget=enrollmentTarget;
		this.enrollmentReached=enrollmentReached;
		this.perkPerEnrollment=perkPerEnrollment;
	}

	public int getEnrollmentTarget() {
		return enrollmentTarget;
	}

	public int getEnrollmentReached() {
		return enrollmentReached;
	}

	public double getPerkPerEnrollment() {
		return perkPerEnrollment;
	}


	@Override
	public double calculateGrossSalary() {
		return getBasicSalary() + getHraPer()+ getDaPer() +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
	
	@Override
	public String toString() {
		return super.toString() +"  Gross Salary : "+calculateGrossSalary();	
	}
}


class TaxUtil{
	
	
	/*
	public double calculateTax(Developer d)
	{
		double grossSalary= d.calculateGrossSalary();
//		if(grossSalary > 50000) {
//			return grossSalary*0.2;
//		}
//		else {
//			return grossSalary*0.05;
//		}
		return grossSalary>50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}
	public double calculateTax(Manager m)
	{
		double grossSalary= m.calculateGrossSalary();
		return grossSalary>50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}
	public double calculateTax(Trainer t)
	{
		double grossSalary= t.calculateGrossSalary();
		return grossSalary>50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}
	public double calculateTax(Sourcing s)
	{
		double grossSalary= s.calculateGrossSalary();
		return grossSalary>50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	}
	
	// this is what we developed but it's not recommended why or every object we are
// creating that same method again and again

// so for better programming practice we have take superclass as a parameter of
// the calculate tax which can accept all subclass object
// that method is called as polymerphic method
// this type of devlopment is called Loosely coupled runtime Polymerphism(LCRP)
// TaxUtil.java

   	*/
	
	
	 public double calculateTax(Employee e) {
	        double grossSalary = e.calculateGrossSalary();
	        return grossSalary > 50000 ? grossSalary * 0.20 : grossSalary * 0.05;
	    }
}


public class TaxCalculation {

	public static void main(String[] args) {
		Developer d=new Developer("Swap",121,40000,10,20);
		Manager m=new Manager("Gokul",11,65000,3000,1000,8000);
		Trainer t=new Trainer("Ganesh",12,10000,5000,3000,3,1500);
		Sourcing s=new Sourcing("Rohit",13,70000,9000,3000,50,40,100);
		
		TaxUtil tu=new TaxUtil();
		System.out.println(d+", Tax : "+ tu.calculateTax(d));
		System.out.println(m+", Tax : "+ tu.calculateTax(m));
		System.out.println(t+", Tax : "+ tu.calculateTax(t));
		System.out.println(s+", Tax : "+ tu.calculateTax(s));

	}

}
