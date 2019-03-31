package expedientesx.util;

import java.util.Calendar;
import java.util.Collection;

import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;

public class HorarioVoter implements AccessDecisionVoter<Object> {

	@Override
	public boolean supports(ConfigAttribute configAttribute) {
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public int vote(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) {
		int voto=AccessDecisionVoter.ACCESS_DENIED;
		int minutoActual = Calendar.getInstance().get(Calendar.MINUTE);
		
		if (minutoActual%2==0){
			voto=AccessDecisionVoter.ACCESS_GRANTED;
		}
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("Votando: "+voto +" para el minuto "+minutoActual);
		return voto;
	}

}
