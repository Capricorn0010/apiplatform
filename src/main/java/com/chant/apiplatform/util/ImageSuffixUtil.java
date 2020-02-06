package com.chant.apiplatform.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ImageSuffixUtil {

	private static final Set<String> imageSuffixSet;

	static {
		imageSuffixSet = new HashSet<>(Arrays.asList("bmp", "jpg", "png", "tif", "gif", "pcx", "tga", "exif", "fpx", "svg", "psd", "cdr", "pcd", "dxf", "ufo", "eps", "ai", "raw", "wmf", "webp"));
	}

	public static Boolean isImage(String fileName) {

		if (StringUtils.isBlank(fileName)) {
			return false;
		}
		String[] fileNameSplit = fileName.split(Pattern.quote("."));
		return imageSuffixSet.contains(fileNameSplit[fileNameSplit.length - 1].toLowerCase());
	}


}
