package com.dominicarendse.routes;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dominicarendse.app.FileObject;
import com.dominicarendse.app.Http.Controllers.REST.FilesystemController;

@Path("/Filesystem")
public class Filesystem {
	/**
	 * An instance of the Filesystem Controller which handles the requests.
	 *
	 * @variable FilesystemController FilesystemController
	 */
	FilesystemController FilesystemController = new FilesystemController();
	
	/**
	 * Retrieves the filesystem's root directory information.
	 *
	 * @throw IOException if the directory or file instance cannot be found.
	 *
	 * @return List<?>
	 */
	@GET
	@Path("/root")
	@Produces(MediaType.APPLICATION_XML)
	public List<FileObject> root() throws IOException {
		return FilesystemController.root();
	}
}
