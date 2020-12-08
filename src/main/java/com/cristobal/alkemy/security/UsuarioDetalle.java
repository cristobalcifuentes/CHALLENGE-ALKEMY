package com.cristobal.alkemy.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cristobal.alkemy.models.entity.User;
import com.cristobal.alkemy.models.entity.UserRole;

public class UsuarioDetalle implements UserDetails{
	

	

	
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String rut;
	
	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;
	
    public UsuarioDetalle(int id, String nombre, String rut, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id=id;
    	this.nombre = nombre;
        this.rut = rut;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsuarioDetalle build(User usuario){
    	System.out.println("llego a build de userDetails");
    	System.out.println("usuario que llego a build = " + usuario);
    	System.out.println("id de usuario = " + usuario.getId()) ;
    	Set<UserRole> roles = usuario.getRoles();
    	System.out.println("roles rescatados = " + roles);
    	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>() ;
    	for (UserRole rol: roles) {
    		authorities.add(new SimpleGrantedAuthority(rol.getRole().getRole() ));
    	}
        
        System.out.println("autoritis en build de usurs detail" + authorities);
        UsuarioDetalle usuariodetalle = new UsuarioDetalle(usuario.getId(), usuario.getName(), usuario.getRut(), usuario.getPassword(), authorities);
        System.out.println("usuario detalle construido = " + usuariodetalle);
        return usuariodetalle;
    }
    
//    private List<Role> consultarRoles(int idUser) {
//    	List<Role> roles = roleRepository.rolesPorIdUsuario(idUser) ;
//    	System.out.println("roles rescatados = " + roles);
//    	return roles;
//    }

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
    
    
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UsuarioDetalle [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", password=" + password
				+ ", authorities=" + authorities + "]";
	}


    
    
    
    
    
    
    

}
