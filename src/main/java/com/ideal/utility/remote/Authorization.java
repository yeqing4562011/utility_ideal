package com.ideal.utility.remote;

/**
 * @ClassName: Authorization
 * @Description: TODO
 * @author yq
 * @date 2013��8��5�� ����10:20:05
 * 
 */

public interface Authorization {
	
	/**
     * ����ͷ���
     * @return
     */
    public String getHeaderKey();
    
    /**
     * ����
     * @return
     */
    public String encode();
    
    /**
     * ����
     * @param str
     * @return
     */
    public boolean valid(String str);

}
