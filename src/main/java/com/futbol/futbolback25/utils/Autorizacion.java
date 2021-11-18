package com.futbol.futbolback25.utils;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class Autorizacion implements Filter {
    
    //Clave para codifica y decodificar
    public static final String KEY="dndsjkfjksddsfdfgfdbf";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       
                //Obtener el path principal 
                HttpServletRequest httpServletRequest=(HttpServletRequest) request;
                // http://localhost:8080/
                
                String url =httpServletRequest.getRequestURI();
                if(url.contains("/api/partidos")||url.contains("/api/usuarios/login")||url.contains("index")){
                    chain.doFilter(request, response); 
                }


        
    }

   

}
