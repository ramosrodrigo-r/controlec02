package br.com.rodrigo.controlec02.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SegurancaConfig {


    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilita CSRF (recomendado só para APIs públicas)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/usuarios/**").permitAll()  // Libera endpoint de criação de usuário
                        .anyRequest().authenticated()                 // Exige login para os demais
                )
                .httpBasic(Customizer.withDefaults()); // Habilita autenticação básica (opcional para agora)

        return http.build();
    }
}


