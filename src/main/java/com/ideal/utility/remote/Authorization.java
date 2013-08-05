package com.ideal.utility.remote;

/**
 * @ClassName: Authorization
 * @Description: TODO
 * @author yq
 * @date 2013年8月5日 上午10:20:05
 * 
 */

public interface Authorization {
	
	/**
     * 返回头标记
     * @return
     */
    public String getHeaderKey();
    
    /**
     * 编码
     * @return
     */
    public String encode();
    
    /**
     * 检验
     * @param str
     * @return
     */
    public boolean valid(String str);

}
