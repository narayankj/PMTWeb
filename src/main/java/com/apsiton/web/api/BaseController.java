
package com.apsiton.web.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;


public class BaseController {
	protected final Log logger = LogFactory.getLog(BaseController.class);
	private static String HOSTNAME = null;

	private String getHostName() {
		if (null == HOSTNAME) {
			try {
				HOSTNAME = java.net.InetAddress.getLocalHost().getHostName();
				logger.info("Hostname of local machine: " + HOSTNAME);
			} catch (Exception uhe) {
				// handle exception
				logger.warn("BaseController.getHostName: Exception obtain in HOSTNAME");
			}
		}

		return HOSTNAME;
	}

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		ModelMap model = new ModelMap();

		// create detailed log information
		StringBuffer sb = new StringBuffer("(server=" + getHostName() + ") ");
		sb.append("APItController.resolveException: ");
		sb.append(", ex.getMessage() = " + ex.getMessage());
		sb.append(", ex.getLocalizedMessage() = " + ex.getLocalizedMessage());

		logger.error(sb.toString(), ex);

		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		return new ModelAndView("error", model);
	}

}
