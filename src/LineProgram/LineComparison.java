package LineProgram;

public class LineComparison {
	public static void main(String[]args) {
	Line line=new Line();
	line.setX1(12);
	line.setX2(1);
	line.setY1(10);
	line.setY2(14);
	Line line2=new Line();
	line2.setX1(5);
	line2.setX2(4);
	line2.setY1(4);
	line2.setY2(7);
	System.out.println(line.toString());
	System.out.println(line2.toString());
	if(line==line2) {
		System.out.println("both the lines are equal");
		
	}
	else {
		
	System.out.println("both are not equal");
	}
	}
}


	
