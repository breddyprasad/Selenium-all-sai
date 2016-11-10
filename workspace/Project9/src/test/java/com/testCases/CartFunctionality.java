package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pagefunctions.CreateAccount;
import com.pagefunctions.Login;

public class CartFunctionality {
@Test
public void addToCart() throws IOException{
	
	CreateAccount.createAccountWithValidDetails();
	Login.login();
	
}
}
