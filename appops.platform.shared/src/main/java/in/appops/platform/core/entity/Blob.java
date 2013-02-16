/**
 * 
 */
package in.appops.platform.core.entity;

import com.google.common.annotations.GwtCompatible;

/**
 * @author Debasish Padhy Created it on 16-Aug-2012
 *
 */
@SuppressWarnings("serial")
@GwtCompatible
public class Blob extends Property {

	/**
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * @param mimeType the mimeType to set 
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * @return the sizeInBytes defaults to 0 
	 */
	public long getSizeInBytes() {
		return sizeInBytes;
	}

	/**
	 * @param sizeInBytes the sizeInBytes to set
	 */
	public void setSizeInBytes(long sizeInBytes) {
		this.sizeInBytes = sizeInBytes;
	}

	/**
	 * @return the download Url .. directly usable url in a hyperlink for a download
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl the downloadUrl to set
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * @param blobId the blobId to set
	 */
	public void setBlobId(Key blobId) {
		this.blobId = blobId;
	}

	private Key blobId = null ;
	private String mimeType = null ;
	
	private long sizeInBytes = 0 ; 
	private String downloadUrl = null ;
	
	public Key getBlobId(){
		return blobId ;
	}
	
}
