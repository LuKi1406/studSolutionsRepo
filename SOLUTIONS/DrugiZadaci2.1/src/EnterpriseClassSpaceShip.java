public class EnterpriseClassSpaceShip {
      
      private int id;
      private ISpacePropulsion propulsion;
      private String captain;
	
	public EnterpriseClassSpaceShip(int id,ISpacePropulsion propulsion,String captain) {
		this.id=id;
		this.propulsion=propulsion;
		this.captain=captain;
		propulsion.engagePropulsion();
		
		
		
	}

	@Override
	public String toString() {
		return "EnterpriseClassSpaceShip [id=" + id + ", propulsion=" + propulsion + ", captain=" + captain + "]";
	}
	
	



	
	
	

}
