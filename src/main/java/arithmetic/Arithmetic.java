package arithmetic;


public class Arithmetic {

	public Arithmetic()
	{}
	
	public float performOperation(float FirstNumber , float SecondNumber , char operation )
	{
		float result = 0.0f;
		
		switch(operation)
		{
			case '+':
				result = FirstNumber + SecondNumber;
				break;
			case '-':
				result = FirstNumber - SecondNumber;
				break;
			case '/':
				if(SecondNumber == 0.0f)
					throw new IllegalArgumentException("You cannot Divide by zero");
				else
					result = FirstNumber / SecondNumber;
				break;
			case '*':
					result = FirstNumber * SecondNumber;
				break;
			case '=':
				break;
			default:
				throw new IllegalArgumentException("Doesn't recognise operation");
		}
		
		return result;
	}
	
}
