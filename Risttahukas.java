public class Risttahukas extends KorgusegaKujund{
	double pikkus, laius;
	public Risttahukas(double korgus, double pikkus, double laius){
		super(korgus);
		
		this.pikkus=pikkus;
		this.pikkus=pikkus;
		this.laius=laius;
	}
	public double pohjaPindala(){
		return pikkus*laius;
		
	}
}