package home;

class Circle extends Processor {

	@Override
	void process() {
		// TODO Auto-generated method stub
		double area = 3.14 *data*data;
		System.out.println("Area of circle with radius"+ data +"is "+area);
	}

}
