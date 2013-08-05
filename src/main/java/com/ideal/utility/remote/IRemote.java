package com.ideal.utility.remote;

import org.springframework.remoting.support.RemoteExporter;
import org.springframework.remoting.support.UrlBasedRemoteAccessor;

/**
 * @ClassName: IRemote
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:19:11
 * 
 */
public interface IRemote {
	
	/**
     * @return
     */
    public UrlBasedRemoteAccessor getAccessor();

    /**
     * @return
     */
    public RemoteExporter getExporter();
    
    /**
     * @return the authorization
     */
    public Authorization getAuthorization();

    /**
     * @param authorization the authorization to set
     */
    public void setAuthorization(Authorization authorization);

}
