package com.webencyclop.demo.security;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static String username = "用户名_";

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
//	@Qualifier("mysqlDataSource")
	@Resource(name = "sqlserverDatasource")
	private DataSource dataSource;


	@Value("${spring.queries.users-query}")
	private String usersQuery;

	@Value("${spring.queries.roles-query}")
	private String rolesQuery;

	public void getusername() {

//		this.username = ((UsernamePasswordAuthenticationFilter) FormLoginConfigurer.getAuthenticationFilter()).getUsernameParameter();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder amb) throws Exception {
		amb.jdbcAuthentication().usersByUsernameQuery(usersQuery).authoritiesByUsernameQuery(rolesQuery).
				dataSource(dataSource).passwordEncoder(passwordEncoder);
//		amb.jdbcAuthentication().usersByUsernameQuery(usersQuery).dataSource(dataSource).passwordEncoder(passwordEncoder)
//				.authoritiesByUsernameQuery(rolesQuery).dataSource(dataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				// URLs matching for access rights
				.antMatchers("/").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/register").permitAll()
				.antMatchers("/home/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER")
				.antMatchers("/employee/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER") //.hasAnyAuthority("EMPLOYEE")
				.antMatchers("/superior/**").hasAnyAuthority("SUPER_USER", "ADMIN_USER", "SITE_USER") //.hasAnyAuthority("SUPERIOR")

//				.anyRequest().authenticated()

				.and()
				.csrf().disable().formLogin()

				.loginPage("/login")
				.failureUrl("/login?error=true")
				.defaultSuccessUrl("/home")
				.usernameParameter("username") //////
				.passwordParameter("password")

				.and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").and()
				.exceptionHandling()
				.accessDeniedPage("/access-denied");

	}

	@Override
	public void configure(WebSecurity web) throws Exception {

		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");

	}

}
