package com.sho.hire.hw.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.sho.hire.hw.ReplaceLastnameFirstname;
import com.sho.hire.hw.ReverseAndReplace;

@RunWith(value = Parameterized.class)
public class ReverseAndReplaceTest {
	
	private static Logger LOGGER = Logger.getLogger(ReverseAndReplace.class.getName());

	public String haystack;
	
	public String needle;
	
	public String replacement;
	
	
	
	public ReverseAndReplaceTest(String haystack, String needle, String replacement) {
		super();
		this.haystack = haystack;
		this.needle = needle;
		this.replacement = replacement;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"I Like Cats.","Cats","Dogs"},
                {"hersh","e","E"},
                {"AAA AAB BAA","AA","a"},
                {"I Work.","Work","Play"},
                {"Tests are the best!","best!","just ok."},
                {"Tests are the best!","","   "},
                {" ","","  test "},
                {"lkasjaskjd jasjdasijd lskajdlasjd","Hersh","Test"},
        });
    }
	
	@Test
    public void testEscapeReverser() throws Exception {
        //(new ReplaceLastnameFirstname().escapeReverser(haystack, needle, replacement).(true));
		String response = new ReplaceLastnameFirstname().escapeReverser(haystack, needle, replacement);
		LOGGER.info(response);
		Assert.assertNotNull(response);
	}
}
