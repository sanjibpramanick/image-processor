package com.sample.image.processor.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author sanjibpramanick
 *
 */
public class ImageProcessorUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ImageProcessorUtil.class);

	/**
	 * returns the json mapper for json data processing
	 * 
	 * @return
	 */
	public static ObjectMapper getJsonMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return objectMapper;
	}

	/**
	 * converts the BufferedImage object into byte[]
	 * 
	 * @param image
	 * @return byte[]
	 */
	public static byte[] convertBufferedImageToByteArray(BufferedImage image, String imageType) {
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();) {
			ImageIO.write(image, imageType, baos);
			baos.flush();
			byte[] imageInByte = baos.toByteArray();
			return imageInByte;
		} catch (Exception e) {
			LOGGER.error("Exception Occurred: {}", e.getMessage());
		}
		return null;
	}

}
