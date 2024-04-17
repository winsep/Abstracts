package advance.dev;

class Circle extends Shape{
   private double r;
   
   public Circle(double r) {
	   super();
	   this.r = r;
   }
	   @Override
	   public double chuvi() {
		   return 2 * Math.PI * r;   
   }
	   @Override
	   public double dientich() {
		   return Math.PI * Math.pow(r, 2);
	   }
}
