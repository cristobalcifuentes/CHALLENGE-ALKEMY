package com.cristobal.alkemy.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cristobal.alkemy.models.entity.User;

public class UsuarioDetalle implements UserDetails{
	
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	
	private String rut;
	
	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;
	
    public UsuarioDetalle(String nombre, String rut, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.rut = rut;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsuarioDetalle build(User usuario){
        List<GrantedAuthority> authorities =
                usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                		.getRole().getRole())).collect(Collectors.toList());
        
        System.out.println("autoritis en build de usurs detail" + authorities);
        return new UsuarioDetalle(usuario.getName(), usuario.getRut(), usuario.getPassword(), authorities);
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		
		return rut;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}
	
    public String getNombre() {
        return nombre;
    }
    
    
    
    
    

}
