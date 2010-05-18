package it.lorenzoingrilli.dns4j.protocol.rr.impl;

import it.lorenzoingrilli.dns4j.protocol.Clazz;
import it.lorenzoingrilli.dns4j.protocol.Type;
import it.lorenzoingrilli.dns4j.protocol.rr.Mx;

public class MxImpl extends RRSpecificImpl implements Mx {

	private String exchange;
	private int preference;
	
    public MxImpl() {
        super(Clazz.IN, Type.MX);
    }
    
    @Override
    public String toString() {
        return "MX(name="+getName()+", ttl="+getTtl()+", preference="+preference+", exchange="+exchange+")";
    }
    
	@Override
	public String getExchange() {
		return exchange;
	}

	@Override
	public int getPreference() {
		return preference;
	}

	@Override
	public void setExchange(String exchange) {
		this.exchange = exchange;		
	}

	@Override
	public void setPreference(int preference) {
		this.preference = preference;
	}

}
