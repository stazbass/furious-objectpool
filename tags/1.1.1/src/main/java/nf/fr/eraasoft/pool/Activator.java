package nf.fr.eraasoft.pool;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("End ");
		PoolSettings.shutdown();
		
	}

}
