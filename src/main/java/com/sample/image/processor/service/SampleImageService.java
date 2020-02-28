package com.sample.image.processor.service;

import java.awt.image.BufferedImage;

/**
 * 
 * @author sanjibpramanick
 *
 */
public interface SampleImageService {

	/**
	 * reads the image by the given path and returns the Object
	 * 
	 * @param filePath
	 * @return BufferedImage
	 */
	public BufferedImage readImage(String filePath);

	public void writeImage(BufferedImage image);

}
