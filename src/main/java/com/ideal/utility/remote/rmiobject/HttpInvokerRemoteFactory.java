package com.ideal.utility.remote.rmiobject;

import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.remoting.support.RemoteExporter;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;

import com.ideal.utility.remote.RemoteFactory;

/**
 * @ClassName: HttpInvokerRemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:37:30
 * 
 */
public class HttpInvokerRemoteFactory extends RemoteFactory{
	
	/*
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getAccessor()
     */
    @Override
    public UrlBasedRemoteAccessor getAccessor() {
        return new HttpInvokerProxyFactoryBean();
    }

    /* 
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getExporter()
     */
    @Override
    public RemoteExporter getExporter() {
        return new HttpInvokerServiceExporter();
    }

}
