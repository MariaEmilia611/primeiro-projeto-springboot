package br.com.mariaemilia.primeiro_projeto_springboot.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {
    
    public String chamarMeuComponent() {
        return "Chamando do Meu Component";
    }
    
}
