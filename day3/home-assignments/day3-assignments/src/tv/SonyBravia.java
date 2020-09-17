package tv;
/**
 * 
 * @author bvdam
 *
 */

public class SonyBravia implements TVRemote{

	@Override
	public int channelDiscoveryNo() {
		return 48;
	}

	@Override
	public boolean hasNDTV() {
		return true;
	}

	@Override
	public boolean hasHDMIport() {
		return false;
	}

	@Override
	public int channelBBCno() {
		return 111;
	}

	
}
