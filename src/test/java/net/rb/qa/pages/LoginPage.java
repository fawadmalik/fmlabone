package net.rb.qa.pages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import net.rb.aap.sfpg.Adriver;

@NoArgsConstructor @Getter
public class LoginPage {
	protected Adriver adriver;
	
	public LoginPage(Adriver adriver) {
		this.adriver = adriver;
		System.out.println(adriver.getName());
	}
}
