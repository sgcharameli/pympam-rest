package es.sv.pympam.pympamrest.configuracion;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigTest {

    private static final Logger log = LoggerFactory.getLogger(SecurityConfigTest.class);

    @Test
    public void generarPasswordDeEjemplo() {
        final String passwordEnClaro = "usu1";
        final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        log.info("La pass '{}' encriptada es: '{}'", passwordEnClaro, passwordEncoder.encode(passwordEnClaro));
    }
}
