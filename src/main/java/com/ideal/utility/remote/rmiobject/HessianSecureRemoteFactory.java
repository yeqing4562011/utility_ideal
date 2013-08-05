/*package com.ideal.utility.remote.rmiobject;

import org.springframework.remoting.support.UrlBasedRemoteAccessor;

import com.ideal.utility.remote.Authorization;

*//**
 * @ClassName: HessianSecureRemoteFactory
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:40:45
 * 
 *//*
public class HessianSecureRemoteFactory extends HessianRemoteFactory{
	
	protected Authorization authorization;

     
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.HessianRemoteFactory#getAccessor()
     
    @Override
    public UrlBasedRemoteAccessor getAccessor() {
        HessianSecureProxyFactory proxyFactory = new HessianSecureProxyFactory();
        proxyFactory.setAuthorization(this.authorization);
       // proxyFactory.setOverloadEnabled(true);
        HessianProxyFactoryBean bean = (HessianProxyFactoryBean) super
                .getAccessor();
        bean.setProxyFactory(proxyFactory);
        return bean;
    }

    
     * (non-Javadoc)
     * @see com.desksoft.utility.remote.HessianRemoteFactory#getExporter()
     
    @Override
    public RemoteExporter getExporter() {
        HessianSecureServiceExporter exporter = new HessianSecureServiceExporter();
        exporter.setAuthorization(this.authorization);
        return exporter;
    }

    *//**
     * @return the authorization
     *//*
    public Authorization getAuthorization() {
        return authorization;
    }

    *//**
     * @param authorization the authorization to set
     *//*
    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

}
*/