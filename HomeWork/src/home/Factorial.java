package home;
class Factorial extends Processor {

	@Override
	void process() {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=1;i<=data;i++)
		{
			result *=i;
		}
		System.out.println("Factorial of "+ data +"  is " +result);
	}

}
