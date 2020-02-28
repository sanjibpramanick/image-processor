package com.sample.image.processor.service.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.image.processor.service.SampleImageService;

/**
 * 
 * @author sanjibpramanick
 *
 */
@Service
public class SampleImageServiceImpl implements SampleImageService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleImageServiceImpl.class);

	@Override
	public BufferedImage readImage(String filePath) {
		try {
			File inputFile = new File(filePath);
			BufferedImage image = ImageIO.read(inputFile);
			LOGGER.info("Reading complete: {}", filePath);
			return image;
		} catch (IOException e) {
			LOGGER.error("Error Occurred: {} " + e.getMessage());
		}
		return null;
	}

	@Override
	public void writeImage(BufferedImage image) {
		// TODO Auto-generated method stub

	}

}
