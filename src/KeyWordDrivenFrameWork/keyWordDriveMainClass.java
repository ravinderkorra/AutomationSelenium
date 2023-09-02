package KeyWordDrivenFrameWork;

public class keyWordDriveMainClass {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

		FileLib flib=new FileLib();
		
		String br=flib.readPropertyData("./Test Data/config.properties", "");
		System.out.println(br);
		
	}

}

