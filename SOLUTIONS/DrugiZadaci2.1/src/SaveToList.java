import java.util.ArrayList;
import java.util.List;

public class SaveToList {
	
	List<EnterpriseClassSpaceShip> eships;
	List<DiscoveryClassSpaceShip> dships;
	
	
	public SaveToList() {
		eships=new ArrayList<EnterpriseClassSpaceShip>();
		dships=new ArrayList<DiscoveryClassSpaceShip>();
		
	}
	
	public void setEshipToList(EnterpriseClassSpaceShip eship) {
		eships.add(eship);
	}
	
	public void setDshipToList(DiscoveryClassSpaceShip dship) {
		dships.add(dship);
	}
	
	public void printListE() {
		for(int i=0; i<eships.size();i++) {
			System.out.println(eships.get(i)+"");
		}
	}
	
	public void printListD() {
		for(int i=0;i<dships.size();i++) {
			System.out.println(dships.get(i)+"");
		}
	}
	
	

}
