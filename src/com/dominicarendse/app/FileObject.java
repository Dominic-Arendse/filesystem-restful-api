package com.dominicarendse.app;

import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fileObject") 
public class FileObject {
	private static final long serialVersionUID = 1L;
	
	private String path;
	private long datetimeLastUpdated; 
	private boolean isDirectory; 
	private double size;
	
	/*
	 * Default class constructor.
	 */
	public FileObject() {
	}
	
	/**
	 * Creates an instance of the class.
	 * 
	 * @param String path
	 * @param long datetimeLastUpdated
	 * @param boolean isDirectory
	 * @param double size
	 * 
	 * @return void
	 */
	public FileObject(String path, long datetimeLastUpdated, boolean isDirectory, double size) {
		this.path = path;
		this.datetimeLastUpdated = datetimeLastUpdated;
		this.isDirectory = isDirectory;
		this.size = size;
	}
	
	/**
	 * Retrieves the filesystem object path.
	 * 
	 * @return String
	 */
	public String getPath() {
		return this.path;
	}
	
	/**
	 * Sets the fiilesystem object path.
	 * 
	 * @param String path
	 * 
	 * @return void
	 */
	@XmlElement
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * Retrieves the last updated date and time of the filesystem object.
	 * 
	 * @return long
	 */
	public long getDatetimeLastUpdated() {
		return this.datetimeLastUpdated;
	}
	
	/**
	 * Sets the last updated date and time of the filesystem object.
	 * 
	 * @param long datetimeLastUpdated
	 * 
	 * @return void
	 */
	@XmlElement
	public void setDatetimeLastUpdated(long datetimeLastUpdated) {
		this.datetimeLastUpdated = datetimeLastUpdated;
	}
	
	/**
	 * Retrieves the last updated date and time of the filesystem object in a formatted string.
	 * 
	 * @return string
	 */
	public String getDatetimeLastUpdatedFormatted() {
		Date date = new Date(this.datetimeLastUpdated);
	    Format format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    
	    return format.format(date);
	}
	
	/**
	 * Retrieves whether the filesystem object is a directory or (a file) not.
	 * 
	 * @return boolean
	 */
	public boolean getIsDirectory() {
		return this.isDirectory;
	}
	
	/**
	 * Sets whether the filesystem object is a directory or (a file) not.
	 * 
	 * @param boolean isDirectory
	 * 
	 * @return void
	 */
	@XmlElement
	public void setIsDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}
	
	/**
	 * Retrieves the size of the filesystem object.
	 * 
	 * @return double
	 */
	public double getSize() {
		return this.size;
	}
	
	/**
	 * Sets the size of the filesystem object.
	 * 
	 * @param double size
	 * 
	 * @return void
	 */
	@XmlElement
	public void setSize(double size) {
		this.size = size;
	}
}
