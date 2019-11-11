package net.familiennilsen.model;

import java.util.HashMap;
import java.util.Map;

public class KFondUrler {
	
	public KFondUrler(Map<String, String> urler) {
		super();
		this.urler = urler;
	}

	private  Map<String,String> urler = new HashMap<String, String>();
	
	public KFondUrler() {
		
	//	System.out.println(env.getPropertySources().iterator().toString());
	}
	
	
	public Map<String,String> getUrler() {
		return urler;
	}

	public void setUrler(Map<String,String> urler) {
		this.urler = urler;
	}

}
