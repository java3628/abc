package com.szt.container;


public class ServiceProvider {
	//load the xml file
	
	public static ServiceProviderCore spc;
	
	static{
		spc=new ServiceProviderCore();
		
		spc.load("com/szt/beans/MyBean.xml");
	}
	
	
	public static Object getService(String serviceName){
		Object object=null;
		if(spc.ac.containsBean(serviceName)){
			object=spc.ac.getBean(serviceName);
		}
		
		if(object==null){
			throw new RuntimeException("error serviceName ");
			
		}
		
		return object;
	}
}
