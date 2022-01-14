package PitchAnalysis;

public class Pace implements Runnable{

	private double friction;
	private double restitution;



	public Pace(double friction, double restitution) {
		this.friction = friction;
		this.restitution = restitution;
	}



	public double getFriction() {
		return friction;
	}



	public void setFriction(double friction) {
		this.friction = friction;
	}



	public double getRestitution() {
		return restitution;
	}



	public void setRestitution(double restitution) {
		this.restitution = restitution;
	}


	public void run()
	{
		find();
	}

	void find()
	{
		double pace = 400*this.friction - (this.friction*10 + Math.pow(Math.E,this.restitution))/ this.friction-this.restitution;

		System.out.println("Pace:"+ pace);
	}

	@Override
	public String toString() {
		return "Friction:" + friction +
				", Restitution:" + restitution;
	}
}
