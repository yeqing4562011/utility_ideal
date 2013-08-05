package com.ideal.utility.remote;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.remoting.support.RemoteExporter;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;

import com.ideal.utility.remote.rmiobject.HessianRemoteFactory;

/**
 * @ClassName: RemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:28:06
 * 
 */
public abstract class RemoteFactory implements IRemote{
	
	/**
	 * Logger for this class
	 */
	protected static final Log log = LogFactory.getLog(RemoteFactory.class);

	protected RemoteFactory() {
	}

	protected static Map<Integer, Class<? extends RemoteFactory>> remoteFactoryMap = new HashMap<Integer, Class<? extends RemoteFactory>>();
	
	static {
		remoteFactoryMap.put(1, HessianRemoteFactory.class);/*
		remoteFactoryMap.put(2, BurlapRemoteFactory.class);
		remoteFactoryMap.put(3, HttpInvokerRemoteFactory.class);
		remoteFactoryMap.put(4, RmiRemoteFactory.class);
		remoteFactoryMap.put(5, HessianSecureRemoteFactory.class);
		remoteFactoryMap.put(6, CasProxyHessianRemoteFactory.class);*/
	}
	
	/**
	 * @param type
	 * @param clazz
	 */
	public static void registerRemoteFactory(int type, Class<? extends RemoteFactory> clazz){
	    remoteFactoryMap.put(type, clazz);
	}

	/**
	 * 返回默认实例(Hessian)
	 * 
	 * @return
	 */
	public static RemoteFactory getInstance() {
		return getInstance(1);
	}

	/**
	 * 根据类型返回实例 1: Hessian 2: Burlap 3: HttpInvoker 4: Rmi
	 * 
	 * @param type
	 * @return
	 */
    public static RemoteFactory getInstance(int type) {
        try {
            RemoteFactory factory = remoteFactoryMap.get(type).newInstance();
            return factory;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * @return
     */
    public abstract UrlBasedRemoteAccessor getAccessor();

    /**
     * @return
     */
    public abstract RemoteExporter getExporter();
    
    
    /**
     * @return the authorization
     */
    public Authorization getAuthorization(){
		throw new RuntimeException("not implement.");
	}

	/**
	 * @param authorization the authorization to set
	 */
	public void setAuthorization(Authorization authorization) {
		throw new RuntimeException("not implement.");
	}

}
