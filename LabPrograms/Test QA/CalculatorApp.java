class Calculator 
{
	double operand1,operand2;
	
	public Calculator(double operand1, double operand2)
	{
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public double add()
	{
		return this.operand1+this.operand2;
	}
	public double sub()
	{
		return this.operand1-this.operand2;
	}
	public double multi()
	{
		return this.operand1*this.operand2;
	}
	public double div()
	{
		if(this.operand2==0){
			System.err.println("Value must not be zero");
		}
		
		return this.operand1/this.operand2;
	}
	
}


class CalculatorApp
{
	Calculator calculator;
	public CalculatorApp(double operand1, double operand2) {
        this.calculator = new Calculator(operand1, operand2);
    }

    public double performAddition() {
        return this.calculator.add();
    }
	
	public double performSubstraction() {
        return this.calculator.sub();
    }
	
	public double performMultiplication() {
        return this.calculator.multi();
    }
	
	public double performDivision() {
        return this.calculator.div();
    }
	public static void main(String args[])
	{
		CalculatorApp ca=new CalculatorApp(10,5);
		System.out.println("Calculation : "+ca.performDivision());		
	}
}