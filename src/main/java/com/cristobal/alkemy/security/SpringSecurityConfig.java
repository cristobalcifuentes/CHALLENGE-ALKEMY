package com.cristobal.alkemy.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetalleService userDetail;
	
	@Autowired
	private DataSource dataSource;
	
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
		//.antMatchers("/admin/**").hasAnyRole("administrator")
        //.antMatchers("/alumn/**").hasRole("student")
		.anyRequest().permitAll()
		.and()
		.formLogin().loginPage("/login").permitAll()
		.defaultSuccessUrl("/index")
		.usernameParameter("rut")
		.passwordParameter("password")
		.and()
        .logout()
        .logoutUrl("/logout")
            .permitAll()
            .logoutSuccessUrl("/")

         	
		;
		
	}
	

	
	
	
	
	
	
	

}
