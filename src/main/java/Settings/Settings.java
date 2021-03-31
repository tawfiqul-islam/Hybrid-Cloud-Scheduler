package Settings;

/*
 * Holds the settings for the Profiler 
 * 
 * @author: Muhammed Tawfiqul Islam
 */
public class Settings {

	public static String sparkHome;
	public static String mesosMasterURI;
	public static String mesosMasterSpark;
	public static String onosURI="http://127.0.0.1:8181/onos/v1/";

	public static void printSettings() {
		System.out.println("sparkHome= "+sparkHome);
		System.out.println("mesosMasterURI= "+mesosMasterURI);
		System.out.println("mesosMasterSpark= "+mesosMasterSpark);
	}
}
