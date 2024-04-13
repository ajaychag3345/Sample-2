package bcvfsldhvf;

import org.orienteer.core.OrienteerWebApplication;
import org.orienteer.core.module.PerspectivesModule;

public class MyWebApplication extends OrienteerWebApplication
{
	@Override
	public void init()
	{
		super.init();
		mountPackage("bcvfsldhvf.web");
		registerModule(DataModel.class);
	}
	
}
