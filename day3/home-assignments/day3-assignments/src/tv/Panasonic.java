package tv;
/**
 * 
 * @author bvdam
 *
 */

public class Panasonic implements TVRemote{

	@Override
	public int channelDiscoveryNo() {
		return 2;
	}

	@Override
	public boolean hasNDTV() {
		return false;
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
