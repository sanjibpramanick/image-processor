package com.sample.image.processor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.image.processor.service.SampleImageService;
import com.sample.image.processor.util.ImageProcessorUtil;

/**
 * 
 * @author sanjibpramanick
 *
 */
@Controller
@RequestMapping("/sample")
public class SampleImageController {

	@Autowired
	private SampleImageService imageService;

	@GetMapping(value = "/image", produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody byte[] getSampleImage() {
		return ImageProcessorUtil.convertBufferedImageToByteArray(imageService.readImage("0.png"), "png");
	}

}
