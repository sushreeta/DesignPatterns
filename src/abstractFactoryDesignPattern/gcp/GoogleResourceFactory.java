package abstractFactoryDesignPattern.gcp;

import abstractFactoryDesignPattern.Instance;
import abstractFactoryDesignPattern.Instance.Capacity;
import abstractFactoryDesignPattern.ResourceFactory;
import abstractFactoryDesignPattern.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
