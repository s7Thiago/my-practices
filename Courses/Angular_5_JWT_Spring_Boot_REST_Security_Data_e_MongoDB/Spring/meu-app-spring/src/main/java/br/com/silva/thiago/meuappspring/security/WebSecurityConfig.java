package br.com.silva.thiago.meuappspring.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration // Informa ao Spring que esta é uma classe de configuração
@EnableWebSecurity // Habilita esta classe para configurar o Spring Security
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests() // Desabilitando recurso que prove vários recursos de segurança
				.antMatchers(HttpMethod.GET, "/").permitAll() // Qualquer pessoa pode acessar a rota / sem estar autenticado
				.anyRequest().authenticated() // Qualquer outra rota/uri precisa estar autenticada.
				.and().formLogin().permitAll() // Dá acesso a página do spring security que exige autenticação do usuário.
				.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")); // Define que esta uri desloga do
																																										// sistema
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Definindo como será a autenticação em memória (usuário, login, controle de
		// acesso etc.)
		auth.inMemoryAuthentication() //
				.withUser("thiago") //
				.password("{noop}123") //
				.roles("ADMIN"); // Controle de acesso

	}

	// Serve para que o spring não bloqueie as nossas páginas estáticas
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/style/**");
	}

}
