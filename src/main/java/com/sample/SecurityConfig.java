package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("VarunKumar").password("$2a$12$pHTT8kN4jQBbKzpcuKQL1uRI487o/dB3wrr8y4qoJeyTvFFEPUtYa").roles("student").
		and().withUser("Varun").password("$2a$12$BalSe8KE/mslAV4ffB24hOEzlCsZGE1LLWedtoFPjZwF4jbPhsH5q").roles("trainer").
		and().withUser("VarunM").password("$2a$12$tk1/D.t6xVA9sE8HAdXVt.64l2.eH3JwFR6WtudjY1r1/0GXWeIii").roles("manager");
	}

//	@Bean
//	public PasswordEncoder getPassword() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder getpass() {
		return new BCryptPasswordEncoder(12);
	}
	
//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/getManager").hasRole("manager");
//		http.authorizeRequests().antMatchers("/getTeacher").hasAnyRole("trainer","manager");
//		http.authorizeRequests().antMatchers("/getStudent").permitAll().and().formLogin();
//		
//	}
}
