package com.cal.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.cal.form.CalForm;

public class CalAction extends DispatchAction {
	public ActionForward add(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		CalForm Aform = (CalForm) form;
		Aform.setParameter("+");
		Float result = Aform.getVal1()+Aform.getVal2();
		Aform.setResult(result);
		return mapping.findForward("result");
	}
	public ActionForward sub(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		CalForm Aform = (CalForm) form;
		Aform.setParameter("-");
		Float result = Aform.getVal1() - Aform.getVal2();
		Aform.setResult(result);
		return mapping.findForward("result");
	}
	public ActionForward mul(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		CalForm Aform = (CalForm) form;
		Aform.setParameter("*");

		Float result = Aform.getVal1()*Aform.getVal2();
		Aform.setResult(result);
		return mapping.findForward("result");
	}
	public ActionForward div(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		CalForm Aform = (CalForm) form;
		Aform.setParameter("/");
		try{
			Float result = Aform.getVal1()/Aform.getVal2();
			Aform.setResult(result);
    		System.out.println(Aform.getResult());
    		return mapping.findForward("result");
		}
		catch(ArithmeticException e){
		    System.out.println("Caught ArithmeticException: " + e.getMessage());
			Aform.setError(e.toString());
			return mapping.findForward("error");

			
		}

	}
}
