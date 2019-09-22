package ac.za.cput.Security;


public class Security extends WebSecurityConfigurerAdapter {

    private static final String Role = "admin";
    private static final String Role2 = "guest";

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("guest")
                .password(encoder().encode("password"))
                .roles(Role2)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(Role2, Role);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/orgman/lookup/**/create/**").hasRole(Role)
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
