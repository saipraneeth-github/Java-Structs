package com.cal.form;

import org.apache.struts.action.ActionForm;

public class CalForm extends ActionForm {
	private String parameter;
	private float result;
	private float val1;
	private float val2;
	private String error;
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public float getVal1() {
		return val1;
	}
	public void setVal1(float val1) {
		this.val1 = val1;
	}
	public float getVal2() {
		return val2;
	}
	public void setVal2(float val2) {
		this.val2 = val2;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
