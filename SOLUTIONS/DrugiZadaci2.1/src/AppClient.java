
public class AppClient {

	public static void main(String[] args) {
		SaveToList stl=new SaveToList();
		EnterpriseClassSpaceShip ecss=new EnterpriseClassSpaceShip(214, new IonPropulsion(), "Pickard");
		System.out.println(ecss.toString());
		System.out.println("-----------------------------------------------------");
		stl.setEshipToList(ecss);
		DiscoveryClassSpaceShip dcss=new DiscoveryClassSpaceShip(221, new WarpPropulsion(), "Jenny");
        stl.setDshipToList(dcss);
        System.out.println("-----------------------------------------------------");
        EnterpriseClassSpaceShip ecss1=new EnterpriseClassSpaceShip(68, new WarpPropulsion(), "Janeway");
		System.out.println(ecss1.toString());
		System.out.println("-----------------------------------------------------");
		DiscoveryClassSpaceShip dcss1=new DiscoveryClassSpaceShip(1, new TransWarpPropulsion(), "John");
		stl.setDshipToList(dcss1);
		System.out.println("After changing propulsion for-> DiscoverySpaceShip");
		System.out.println("");
		System.out.println(ecss.toString());
		stl.setEshipToList(ecss);
		System.out.println("------------------------------------------------------");
		System.out.println(ecss1);
		stl.setEshipToList(ecss1);
		
		System.out.println("<<<<<<>>>>>>>>");
		
		stl.printListD();
		stl.printListE();
	}

}
