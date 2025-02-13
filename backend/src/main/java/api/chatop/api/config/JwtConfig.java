package api.chatop.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.jwk.source.ImmutableSecret;
import com.nimbusds.jose.proc.SecurityContext;

@Configuration
public class JwtConfig {

    @Bean
    public JwtEncoder jwtEncoder() {
        // Replace "secretKey" with your actual secret key
        JWKSource<SecurityContext> jwkSource = new ImmutableSecret<>("secretKey".getBytes());
        return new NimbusJwtEncoder(jwkSource);
    }
}
