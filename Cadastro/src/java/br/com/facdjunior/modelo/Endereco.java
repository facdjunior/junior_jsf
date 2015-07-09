
package br.com.facdjunior.modelo;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Francisco Junior 09/07/2015
 */
@Embeddable
public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	@ManyToOne
	private Bairro bairro;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	@Override
	public String toString() {
		return "Endereco ["
				+ (logradouro != null ? "logradouro=" + logradouro + ", " : "")
				+ (numero != null ? "numero=" + numero + ", " : "")
				+ (complemento != null ? "complemento=" + complemento + ", "
						: "") + (cep != null ? "cep=" + cep + ", " : "")
				+ (bairro != null ? "bairro=" + bairro : "") + "]";
	}
	
}
