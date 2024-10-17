package diome.java.basico.aula01;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import diome.edu.primeirasemana.loester.Dog;

public class Aula01 {

	public static void main(String[] args) {
		
		// CONSTANTES
		final String BR = "Brasil";
		final double PI = 3.14;
		final int ESTADOS_BRASILEIROS = 27;
		final int ANO_2000 = 2000;
		
		
		// VARIAVEIS
		
		// não usar mais date
		Date dataNascimento = new Date(2025, 01, 01);
		
		LocalDate dataNascimentoV2 = LocalDate.of(2024, 1, 1);
		
		
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333;
		long cpf = 7897897981321321L;
		float pi = 3.14F;
		double salario = 1275.33;
		
	
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;

		// cast
		short numeroCurto2 = (short) numeroNormal;
			
		
		int numero1 = 1;
		int numeroUm = 1;
		int longo = 1;
		int idadeMaria = 23;
		int anoFabricacao = 2022;
		
		boolean verdadeiro = false;
		boolean doadoOrgao = false;
		boolean doadorSangue = true;
		
		double peso = 80.0;
		double altura = 1.62;		
		double salMedio = 1500.53;
		
		String meuNome = "Loester";
		String email = "Loester@escola.com";
		
		
		
		// ARRAY
		String [] emails = {"Loester@escola.com", "Maria@escola.com"};
		
		// LIST
		List<String> emailsV2 = new ArrayList<String>();
		emailsV2.add("Loester@escola.com");
		emailsV2.add("Maria@escola.com");
		
		// HASHMAP
		HashMap<String, String> emailMap = new HashMap<>();
 
        emailMap.put("Loester", "Loester@escola.com");
        emailMap.put("Maria", "Maria@escola.com");


        System.out.println("Emails cadastrados:");
        for (String name : emailMap.keySet()) {
            System.out.println("Nome: " + name + ", Email: " + emailMap.get(name));
        }
		
		anoFabricacao = 2025;
		verdadeiro = true;
		
		Dog myPet = new Dog("Lilica");
		
		
		// CHAMADA DA FUNÇÃO
		int valorUm = 7;
		int valorDois = 11;
		int resultado = somar(valorUm, valorDois);
		
		System.out.printf("\nResultado da soma de %d + %d = %d \n"
				, valorUm
				, valorDois
				, resultado);
		
		
		// CHAMADA DA FUNÇÃO
		String cepSemFormatacao = "89010971";
		String cepFormatado = "";
		
		cepFormatado = formatCep(cepSemFormatacao);
		
		System.out.printf("\nCep sem formatação %s -> Cep Formatado %s \n"
				, cepSemFormatacao
				, cepFormatado
				);
		
		
		// CHAMADA DA FUNÇÃO
		String nome = "Loester";
		String sobreNome = "Botelho";
		String nomeCompleto =  nomeCompletoV2(nome, sobreNome );
		
		System.out.printf("\nNome Completo : %s", nomeCompleto);
		
		
	}
	
	public static int somar (int numeroUm , int numeroDois) {
		return numeroDois + numeroDois;
	}

    public static String formatCep(String cep) {
    	
        if (cep == null || cep.length() != 8 || !cep.matches("\\d{8}")) {
        	
            throw new IllegalArgumentException("CEP inválido. Deve conter 8 dígitos.");
            
        }
        
        return cep.substring(0, 5) + "-" + cep.substring(5);
    }	
    
    public static String nomeCompletoV1(String primeiroNome, String segundoNome) {
    	return String.format("%s %s"
    					, primeiroNome
    					, segundoNome);    			
    }
    
    public static String nomeCompletoV2(String primeiroNome, String segundoNome) {
    	return primeiroNome.concat(" ").concat(segundoNome);	
    }    
    
}
