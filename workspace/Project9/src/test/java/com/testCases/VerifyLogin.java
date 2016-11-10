package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pagefunctions.Login;

public class VerifyLogin {

@Test
public void loginWithValidUsers() throws IOException{
	Login.login();
}
}
