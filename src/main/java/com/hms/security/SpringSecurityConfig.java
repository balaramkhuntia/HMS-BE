//package com.hms.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.security.SecurityRequirement;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import lombok.AllArgsConstructor;
//
//@Configuration
//@EnableMethodSecurity
//@AllArgsConstructor
//public class SpringSecurityConfig {
//	@Autowired
//	private UserDetailsService userDetailsService;
//
//	@Autowired
//	private JwtAuthenticationEntryPoint authenticationEntryPoint;
//
//	@Autowired
//	private JwtAuthenticationFilter authenticationFilter;
//
//	private static final String[] AUTH_WHITELIST = {
//	        "/v3/api-docs/**",
//	        "/v3/api-docs.yaml",
//	        "/swagger-ui/**",
//	        "/swagger-ui.html",
//	        
//	};
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//
//		authProvider.setUserDetailsService(userDetailsService);
//		authProvider.setPasswordEncoder(passwordEncoder());
//
//		return authProvider;
//	}
//	
//	@Bean
//	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//		return configuration.getAuthenticationManager();
//	}
//	
//	@Bean
//	public static PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		
////		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests((authorize) -> {
////			authorize.requestMatchers("/api/auth/**").permitAll();
////			authorize.requestMatchers("/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs/**").permitAll();
////			authorize.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll();
////			authorize.anyRequest().authenticated();
////		}).httpBasic(Customizer.withDefaults());
////		http.exceptionHandling(exception -> exception.authenticationEntryPoint(authenticationEntryPoint));
//		http.csrf(csrf -> csrf.disable())
//		.exceptionHandling(exception -> exception.authenticationEntryPoint(authenticationEntryPoint))
//		.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.authorizeHttpRequests(auth -> 
//		auth.requestMatchers("/api/auth/**").permitAll() 
//		.requestMatchers("/api/address/**").permitAll()
//		.requestMatchers("/api/ground/**").permitAll()
//		.requestMatchers(AUTH_WHITELIST).permitAll()
//		.anyRequest().authenticated()
//				);
//		
//		http.authenticationProvider(authenticationProvider());
//		
//		http.addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
//		
//		return http.build();
//	}
//	
//	@Bean
//	public OpenAPI openAPI() {
//		return new OpenAPI().addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
//				.components(new Components().addSecuritySchemes("Bearer Authentication", createAPIKeyScheme()));
//	}
//
//	private SecurityScheme createAPIKeyScheme() {
//		return new SecurityScheme().type(SecurityScheme.Type.HTTP).bearerFormat("JWT").scheme("bearer");
//	}
////	@Bean
////    public SecurityWebFilterChain securityWebFilterChain(final ServerHttpSecurity http) {
////        http
////            .authorizeExchange()
////                .pathMatchers("/actuator/**", "/webjars/swagger-ui/**", "/swagger-ui.html", "/v3/api-docs/**").permitAll()
////                .anyExchange().authenticated()
////                .and()
////            .oauth2ResourceServer().jwt();
////
////        return http.build();
////    }
//
////    @Bean
////    public UserDetailsService userDetailsService(){
////
////        UserDetails ramesh = User.builder()
////                .username("ramesh")
////                .password(passwordEncoder().encode("password"))
////                .roles("USER")
////                .build();
////
////        UserDetails admin = User.builder()
////                .username("admin")
////                .password(passwordEncoder().encode("admin"))
////                .roles("ADMIN")
////                .build();
////
////        return new InMemoryUserDetailsManager(ramesh, admin);
////    }
//}