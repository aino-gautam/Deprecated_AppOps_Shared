/**
 * 
 */
package in.appops.platform.core.operation;

import java.io.Serializable;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 *
 */
public class Result<T extends Serializable> implements Serializable{
	
	private Operation resultOf ;
	private T operationResult ;
	private int timeNeeded = 0 ; // in microseconds

	public Result(){
		
	}
	
	public Result(Operation parent, T data){
		resultOf = parent ;
		operationResult = data ;
	}
	
	/**
	 * @return the resultOf
	 */
	public Operation getResultOf() {
		return resultOf;
	}

	/**
	 * @return the operationResult
	 */
	public T getOperationResult() {
		return operationResult;
	}
	

	/**
	 * @return the timeNeeded
	 */
	public int getTimeNeeded() {
		return timeNeeded;
	}

	/**
	 * @param timeNeeded the timeNeeded to set
	 */
	public void setTimeNeeded(int timeNeeded) {
		this.timeNeeded = timeNeeded;
	}
}
