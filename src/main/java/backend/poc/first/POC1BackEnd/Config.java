package backend.poc.first.POC1BackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class Config extends WebSecurityConfigurerAdapter 
{	
	@Autowired
	AuthoritiesService service;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		auth.userDetailsService(service).passwordEncoder(getEncode());
		
		auth.inMemoryAuthentication().withUser("razak").
		password(getEncode().encode("mohamed")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("annamalai").
		password(getEncode().encode("sam")).roles("ADMIN");
	}
	@Bean
	public PasswordEncoder getEncode()
	{
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().anyRequest().authenticated();
		http.httpBasic();
		http.formLogin();
		http.csrf().disable();// post,put,delete
		//http.authorizeRequests().anyRequest().permitAll();
	}
	
}
