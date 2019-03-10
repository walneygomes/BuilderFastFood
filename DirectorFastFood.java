
public class DirectorFastFood {
	protected FastFoodBuilder fast;
	
	public DirectorFastFood(FastFoodBuilder fastfood){
		this.fast=fastfood;
	}
	public void criar(){
		fast.nome();
		fast.tempo();
		fast.valor();
	}
	public FastFoodBuilder getFastFood(){
		return fast;
	}

}
