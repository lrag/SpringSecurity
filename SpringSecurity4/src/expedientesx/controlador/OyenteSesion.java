package expedientesx.controlador;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OyenteSesion implements HttpSessionListener {

    public OyenteSesion() {
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("SESIÓN CREADA");
    }

    public void sessionDestroyed(HttpSessionEvent ev)  { 
    	System.out.println("SESIÓN INVALIDADA");
    }
	
}
