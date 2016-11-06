package br.com.brunotonia.soap;

import br.com.brunotonia.soap.vo.Carro;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CarroServidor {

    @WebMethod
    Carro buscar(Integer id);

    @WebMethod
    boolean adicionar(Carro carro);
    
    @WebMethod
    Carro[] listar() throws Exception;

}
