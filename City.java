package tsppso01;

public class City {
	
	    public double x;
	    public double y;
	    public String name;

	    public City(double x , double y , String n){
	        this.x=x;
	        this.y=y;
	        this.name=n;
	    }
    
	    public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double distanceTo(City city)
	    {
			return Math.sqrt(((getX() - city.getX()) * (getX() - city.getX())) + ((getY() - city.getY()) * (getY() - city.getY())));
	    }
}
