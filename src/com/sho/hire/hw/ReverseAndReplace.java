package com.sho.hire.hw;

import java.util.logging.Logger;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * @author Hersh Naroliwalla
 *
 */

public class ReverseAndReplace {

	private static Logger LOGGER = Logger.getLogger(ReverseAndReplace.class.getName());

	public static void main (String args []) {
		
		//Response is the String which is revered and replaced
		String response = null;
		try {
			response = new ReplaceLastnameFirstname().escapeReverser("hersh","eY","E");
			LOGGER.info("Response Text is : "+ response);
		} catch(Exception e) {
			LOGGER.warning(ExceptionUtils.getStackTrace(e));
		} 
		
	}
}
