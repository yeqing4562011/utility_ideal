package com.ideal.utility.remote.rmiobject;

import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.support.RemoteExporter;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;

import com.ideal.utility.remote.RemoteFactory;

/**
 * @ClassName: HessianRemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:29:50
 * 
 */
public class HessianRemoteFactory extends RemoteFactory{

	/* 
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getAccessor()
     */
    @Override
    public UrlBasedRemoteAccessor getAccessor() {
        // nginx 报411错误
        HessianProxyFactoryBean hessianAccessor = new HessianProxyFactoryBean();
        hessianAccessor.setChunkedPost(false);
        return hessianAccessor;
    }

    /*
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.RemoteFactory#getExporter()
     */
    @Override
    public RemoteExporter getExporter() {
        return new HessianServiceExporter();
    }
	
	

}
