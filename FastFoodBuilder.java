
public abstract class FastFoodBuilder {
	protected FastFood fast;
	public FastFoodBuilder(){
		this.fast= new FastFood();
		
		
	}
	
	
	public abstract void nome();
	public abstract void valor();
	public abstract void tempo();

}
