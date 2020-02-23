public class DiscoveryClassSpaceShip {
       
       private int id;
       private ISpacePropulsion propulsion;
       private String captain;
       
      
	public DiscoveryClassSpaceShip(int id,ISpacePropulsion propulsion,String captain) {
		
		this.id=id;
		this.propulsion=propulsion;
		this.captain=captain;
		propulsion.engagePropulsion();
		
		
	}


	@Override
	public String toString() {
		return "DiscoveryClassSpaceShip [id=" + id + ", propulsion=" + propulsion + ", captain=" + captain + "]";
	}


	

	
	
	
	
	
	
	

	
	
	

}
