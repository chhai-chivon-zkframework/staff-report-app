package com.spn.staffreport.view;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;

/**
 * @author chhai.chivon on May 30, 2018
 *
 */

public class MasterView extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5665005394800575428L;
	
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		// TODO Auto-generated method stub
		super.doAfterCompose(comp);
		
		
		
		Executions.sendRedirect("login.zul");
	}
}
