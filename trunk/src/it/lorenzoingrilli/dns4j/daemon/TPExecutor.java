package it.lorenzoingrilli.dns4j.daemon;

import java.beans.ConstructorProperties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TPExecutor extends ThreadPoolExecutor {

	private int queueSize;

	@ConstructorProperties(value={"corePoolSize", "maximumPoolSize", "keepAliveTime", "queueSize"})
	public TPExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, int queueSize) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(queueSize, true));
	}

	public long getKeepAliveTime() {
		return getKeepAliveTime(TimeUnit.MILLISECONDS);
	}
	
	public void setKeepAliveTime(long keepAliveTime) {
		setKeepAliveTime(keepAliveTime, TimeUnit.MILLISECONDS);		
	}
	
	public int getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

}