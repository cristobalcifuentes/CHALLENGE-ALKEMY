package com.cristobal.alkemy.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetalleService userDetail;
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder builder) throws Exception {

		builder.userDetailsService(userDetail)
		.passwordEncoder(passwordEncoder())
		;

		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.cors().and().csrf().disable()
		.sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
		.and()
		.authorizeRequests()
		.antMatchers("/admin/**").hasAuthority("administrator")
        .antMatchers("/alumn/**").hasAuthority("student")
		.anyRequest().permitAll()
		.and()
		.formLogin().loginPage("/login").permitAll()
		.defaultSuccessUrl("/index")
		.usernameParameter("rut")
		.passwordParameter("password")
		.failureUrl("/")
		.and()
        .logout()
        .logoutUrl("/logout")
            .permitAll()
            .logoutSuccessUrl("/")

         	
		;
		
	}
	
	
	
	

	
	
	
	
	
	
	

}
