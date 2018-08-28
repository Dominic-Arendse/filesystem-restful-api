package com.dominicarendse.app.Http.Controllers.REST;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dominicarendse.app.FileObject;

public class FilesystemController {
	/**
	 * The filesystem's root path (modify to match your OS).
	 *
	 * @variable String rootPath
	 */
	private String rootPath = "\\";
	
	/*
	 * Default class constructor.
	 */
	public FilesystemController() {
	}
	
	/**
	 * Retrieves the filesystem's root directory information.
	 *
	 * @throw IOException if the directory or file instance cannot be found.
	 *
	 * @return List<?>
	 */
	public List<FileObject> root() throws IOException {
		return getListing(this.rootPath);
	}
	
	/**
	 * Retrieves the file/directory listing information.
	 *
	 * @param String filePath
	 *
	 * @throw IOException if the directory or file instance cannot be found.
	 *
	 * @return List<?>
	 */
	public List<FileObject> getListing(String filePath) throws IOException {
		// Directory listing.
		List<FileObject> list = new ArrayList<FileObject>();
		
		// The starting directory.
		File f = new File(filePath);
		
		// Only proceeds to build a list of the current directory/file if it exists.
		if (f.exists()) {
			// Retrieves the list of files in the root directory.
			File[] files = f.listFiles();
			for (File file : files) {
				String path = file.getCanonicalPath();
				long datetimteLastModified = file.lastModified();
				double size = file.length(); // Size in bytes
				if (file.isDirectory()) {
					list.add(new FileObject(path, datetimteLastModified, true, size));
				} else {
					list.add(new FileObject(path, datetimteLastModified, false, size));
				}
			}
		}
		
		return list;
	}
}
