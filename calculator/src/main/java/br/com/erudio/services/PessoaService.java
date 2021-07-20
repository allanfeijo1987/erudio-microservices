package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Pessoa;

@Service
public class PessoaService {

	private final AtomicLong counter = new AtomicLong();

	public Pessoa findById(String id) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(counter.incrementAndGet());
		pessoa.setFistName("Allan");
		pessoa.setLastName("Ribeiro Feijó");
		pessoa.setAddress("Rua Cuiabá");
		pessoa.setGender("Masculino");
		return pessoa;
	}

	public List<Pessoa> findAll() {
		List<Pessoa> pessoas = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Pessoa pessoa = mockPessoa(i);
			pessoas.add(pessoa);
		}
		return pessoas;
	}

	public Pessoa criar(Pessoa pessoa) {
		return pessoa;
	}

	public Pessoa alterar(Pessoa pessoa) {
		return pessoa;
	}

	public void deletar(String id) {
		
	}

	private Pessoa mockPessoa(int i) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(counter.incrementAndGet());
		pessoa.setFistName("Fulano " + i);
		pessoa.setLastName("jose " + i);
		pessoa.setAddress("Rua Cuiabá " + i);
		pessoa.setGender("Masculino " + i);
		return pessoa;
	}
}
