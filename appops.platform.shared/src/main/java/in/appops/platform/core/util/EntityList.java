package in.appops.platform.core.util;

import in.appops.platform.core.entity.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class EntityList extends ArrayList<Entity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int startIndex = 0;
	private Long maxResult = null;
	private int pageSize = 0;

	public EntityList() {
	}

	public EntityList(Collection<? extends Entity> c) {
		super(c);
	}

	/**
	 * @return the startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex
	 *            the startIndex to set
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the maxResult
	 */
	public Long getMaxResult() {
		return maxResult;
	}

	/**
	 * @param maxResult
	 *            the maxResult to set
	 */
	public void setMaxResult(Long maxResult) {
		this.maxResult = maxResult;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
