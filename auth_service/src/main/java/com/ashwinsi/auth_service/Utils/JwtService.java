package com.ashwinsi.auth_service.Utils;

import com.ashwinsi.auth_service.DTO.UserJwtData;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

@Component
public class JwtService {

    private final String SECRET_STRING = "your_super_secret_key_that_is_long_enough_for_sha_256";
    private final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(SECRET_STRING.getBytes(StandardCharsets.UTF_8));
    private final long EXPIRATION_TIME_MS = 3600000; // 1 hour

    public String generateUserToken(UserJwtData userJwtData){

    }
}
