package com.openxava.naviox.actions;

import org.openxava.util.*;
import com.openxava.naviox.impl.*;

/**
 * 
 * @author Javier Paniza 
 */
public class SignInAction extends ForwardToOriginalURIBaseAction {
	
	public void execute() throws Exception {		
		SignInHelper.init(getRequest(), getView()); 
		String userName = getView().getValueString("user");
		String password = getView().getValueString("password");
		if (Is.emptyString(userName, password)) { 
			addError("unauthorized_user"); 
			return;
		}		
		if (!SignInHelper.isAuthorized(userName, password, getErrors())) {
			return;									
		}		
		SignInHelper.signIn(getRequest().getSession(), userName);
		getView().reset();
		forwardToOriginalURI(); 
	}
	
}
