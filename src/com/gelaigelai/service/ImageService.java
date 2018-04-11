package com.gelaigelai.service;

import com.gelaigelai.common.Global;
import com.gelaigelai.domain.ImageDAO;

public class ImageService {
private ImageDAO imageDAO=(ImageDAO)Global.getDAO("ImageDAO");

public ImageDAO getImageDAO() {
	return imageDAO;
}

public void setImageDAO(ImageDAO imageDAO) {
	this.imageDAO = imageDAO;
}

}
