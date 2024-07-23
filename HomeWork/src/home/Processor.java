package home;
abstract class Processor {
	int data;
	
	void showData()

	{
		System.out.println("Data: "+data);
	}
	abstract void process();
}
