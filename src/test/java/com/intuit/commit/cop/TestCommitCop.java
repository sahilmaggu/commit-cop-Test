package com.intuit.commit.cop;

import junit.framework.Assert;

import org.junit.Test;

// Test comment

public class TestCommitCop {

	
	@Test
	public void testwelcome(){
		String pawan = "commitcop";
		String message = CommitCop.welcome();
		Assert.assertEquals("Hello World Sahil-6", message);
	}
}
