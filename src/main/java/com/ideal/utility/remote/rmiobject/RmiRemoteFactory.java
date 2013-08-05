package com.ideal.utility.remote.rmiobject;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.ideal.utility.remote.RemoteFactory;

/**
 * @ClassName: RmiRemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:38:22
 * 
 */
public class RmiRemoteFactory extends RemoteFactory{
	
	/* 
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getAccessor()
     */
    @Override
    public RmiProxyFactoryBean getAccessor() {
        return new RmiProxyFactoryBean();
    }

    /* 
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getExporter()
     */
    @Override
    public RmiServiceExporter getExporter() {
        return new RmiServiceExporter();
    }

}
