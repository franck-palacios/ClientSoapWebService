package sv.com.fpalacios.servicio.service.mains;

import sv.com.fpalacios.servicio.service.ClienteService;
import sv.com.fpalacios.servicio.service.ClienteServiceImplService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteServiceImplService implementService = new ClienteServiceImplService();
		ClienteService clienteService = implementService.getClienteServiceImplPort();
		String xml = clienteService.obtenerCliente("0003");
		System.out.println("Xml: "+ xml);
	}

}
