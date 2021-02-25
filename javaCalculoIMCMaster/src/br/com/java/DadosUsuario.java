package br.com.java;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class DadosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String nome;
		int idade, ano_atual, ano_nascimento, peso;
		String endereco;
		int telefone;
		float imc, altura;
		String valor;
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		valor = JOptionPane.showInputDialog(null, "Digite sua idade:");
		idade = Integer.parseInt(valor.trim());
		Calendar calendario = Calendar.getInstance();
		ano_atual = calendario.get(Calendar.YEAR);
		ano_nascimento = ano_atual - idade;
		endereco = JOptionPane.showInputDialog("Digite seu endereço:");
		valor = JOptionPane.showInputDialog("Digite seu telefone:");
		telefone = Integer.parseInt(valor.trim());
		valor = JOptionPane.showInputDialog("Digite sua altura com ponto:");
		altura = Float.parseFloat(valor.trim());
		valor = JOptionPane.showInputDialog("Digite seu peso:");
		peso = Integer.parseInt(valor.trim());
		
		
		
		imc = peso/(altura * 2);
		
		System.out.printf ("Seu nome " + nome + "\n");
        System.out.printf("Sua idade " + idade + "\n");
        System.out.printf ("Voce nasceu em " + ano_nascimento + "\n");
        System.out.printf ("Voce mora em " + endereco +"\n");
        System.out.printf ("Seu telefone " + telefone + "\n");
        System.out.printf ("Resultado do calculo IMC : " + imc + "\n");
        
        if (imc < 18.5) 
			System.out.println("Você está abaixo do peso ideal, vamos melhorar!");
		 else 
			
			if ((imc < 18.5) && (imc < 24.9)) 
				System.out.println("Você está no peso ideal, continue assim!");
			else 
				
				if ((imc < 25.0) && (imc < 29.9))
					System.out.println("Você está com peso em excesso, vamos melhorar!");
				else
					if((imc < 30.0) && (imc < 34.9))
						System.out.println("Obesidade classe I, tenha cuidado!");
					else 
						if((imc < 35.0) && (imc < 39.9))
							System.out.println("Obesidade classe II, ainda podemos mudar isso!");
						else
							if(imc > 40)
								System.out.println("Obesidade classe III, procure ajuda, nada está perdido!");
        
        System.out.println("Obrigado");
	}

}
