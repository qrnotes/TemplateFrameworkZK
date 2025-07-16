package com.aplikasi;


import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Window;

@SuppressWarnings("serial")  
public class User extends Window{
	public void getLogin(String userid, String password) throws Exception{
         
		Executions.getCurrent().sendRedirect("app/","_self");
    
	}    
}
