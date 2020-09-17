package tv;
/**
 * 
 * @author bvdam
 *
 */

public class MainTV {

	public static void main(String[] args) {

		TVRemote s = new SonyBravia();
		TVRemote a = new AppleTV();
		TVRemote p = new Panasonic();
		
		System.out.println("SonyTV BBC Channel Number is "+s.channelBBCno());
		System.out.println("Does SonyTV has a HDMI Port? - "+s.hasHDMIport());
		System.out.println("SonyTV Discovery Channel Number  is "+s.channelDiscoveryNo());
		System.out.println("Does SonyTV has a NDTV Channel? -"+s.hasNDTV());
		
		System.out.println("\nAppleTV BBC Channel Number is "+a.channelBBCno());
		System.out.println("Does AppleTV has a HDMI Port? - "+a.hasHDMIport());
		System.out.println("AppleTV Discovery Channel Number  is "+a.channelDiscoveryNo());
		System.out.println("Does AppleTV has a NDTV Channel? -"+a.hasNDTV());
		
		System.out.println("\nPanasonicTV BBC Channel Number is "+p.channelBBCno());
		System.out.println("Does PanasonicTV has a HDMI Port? - "+p.hasHDMIport());
		System.out.println("PanasonicTV Discovery Channel Number  is "+p.channelDiscoveryNo());
		System.out.println("Does PanasonicTV has a NDTV Channel? -"+p.hasNDTV());
		
		
		
	}

}
