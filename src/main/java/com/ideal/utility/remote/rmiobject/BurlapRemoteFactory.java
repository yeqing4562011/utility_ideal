package com.ideal.utility.remote.rmiobject;

import org.springframework.remoting.caucho.BurlapProxyFactoryBean;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.remoting.support.RemoteExporter;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;

import com.ideal.utility.remote.RemoteFactory;

/**
 * @ClassName: BurlapRemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:35:57
 * 
 */
public class BurlapRemoteFactory extends RemoteFactory{

	 /*
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getAccessor()
     */
    @Override
    public UrlBasedRemoteAccessor getAccessor() {
        BurlapProxyFactoryBean hessianAccessor = new BurlapProxyFactoryBean();
        return hessianAccessor;
    }

    /*
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getExporter()
     */
    @Override
    public RemoteExporter getExporter() {
        return new BurlapServiceExporter();
    }
    
}
