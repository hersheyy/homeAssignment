package com.sho.hire.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Hersh Naroliwalla
 *
 */
public class ReplaceLastnameFirstname {

	public static final Pattern SPACE_PATTERN = Pattern.compile("\\s");

	public ReplaceLastnameFirstname() {
	}

	/**
	 * The method will perform a left-to-right string replacement, followed by
	 * reversing the resultant strings *words*. ie. (“I like cats”, “cats”, “dogs”)
	 * -> “dogs like I”
	 * 
	 * 
	 * 
	 * @return String which is reversed and replaced
	 */

	public String escapeReverser(String haystack, String needle, String replacement) throws Exception {

		// sb has the reversed String.
		StringBuilder sb = null;
		int itemsReplaced = 0;

		try {

			if (!isInputEmpty(haystack, needle, replacement)) {

				// check if there is a space present
				Matcher matcher = SPACE_PATTERN.matcher(haystack);
				boolean found = matcher.find();

				if (found) {
					/*
					 * Single/Multiple spaces are present. Split the text on space and then treat
					 * individual word for reversal / replacement
					 */

					// Splitting on spaces
					String[] splitArr = haystack.split("\\s+");

					// Reverse String
					sb = new StringBuilder();
					for (int i = splitArr.length - 1; i >= 0; i--) {
						if(splitArr[i].contains(needle)) {
							itemsReplaced++;
						}
						sb.append(splitArr[i].replaceAll(needle, replacement) + " ");
					}
					if(itemsReplaced == 0) {
						throw new Exception("Nothing to replace. Please correct input!");
					}
				} else {
					// reverse no space string using stringBuilder
					sb = new StringBuilder(haystack);
					sb.reverse();
					sb = new StringBuilder(replaceWord(sb.toString(), needle, replacement));

				}

			} else {
				throw new Exception("one or more inputs are empty / null. Please correct");
			}
			
			

		} catch (Exception e) {

			throw e;
		}

		return sb.toString().trim();
	}

	private String replaceWord(String haystack, String needle, String replacement) throws Exception {
		
		if(haystack.indexOf(needle) < 0) {
			throw new Exception("Nothing to replace. Please correct input!");
		}
		return haystack.replaceAll(needle, replacement);
	}

	private boolean isInputEmpty(String haystack, String needle, String replacement) {
		if (null == StringUtils.trimToNull(haystack) || null == StringUtils.trimToNull(needle)
				|| null == StringUtils.trimToNull(replacement)) {
			return true;
		}
		return false;
	}

}
