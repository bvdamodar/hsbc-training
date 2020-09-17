package tv;
/**
 * 
 * @author bvdam
 *
 */

public class AppleTV implements TVRemote{

	@Override
	public int channelDiscoveryNo() {
		return 158;
	}

	@Override
	public boolean hasNDTV() {
		return true;
	}

	@Override
	public boolean hasHDMIport() {
		return true;
	}

	@Override
	public int channelBBCno() {
		return 22;
	}

	
}
