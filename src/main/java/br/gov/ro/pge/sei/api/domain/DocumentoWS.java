package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoWS", propOrder = {
    "tipo",
    "idProcedimento",
    "protocoloProcedimento",
    "idSerie",
    "numero",
    "data",
    "descricao",
    "idTipoConferencia",
    "remetente",
    "interessados",
    "destinatarios",
    "observacao",
    "nomeArquivo",
    "nivelAcesso",
    "idHipoteseLegal",
    "conteudo",
    "conteudoMTOM",
    "idArquivo",
    "campos",
    "sinBloqueado"
})
public class DocumentoWS {
	
	@XmlElement(required = true)
	private TipoDocumentoWS tipo;
	
	@XmlElement(required = false)
	private Long idProcedimento;
	
	@XmlElement(required = false)
	private String protocoloProcedimento;
	
	@XmlElement(required = true)
	private Long idSerie;
	
	@XmlElement(required = false)
	private String numero;
	
	@XmlElement(required = false)
	private Date data;
	
	@XmlElement(required = false)
	private String descricao;
	
	@XmlElement(required = false)
	private Long idTipoConferencia;
	
	@XmlElement(required = false)
	private RemetenteWS remetente;
	
	@XmlElement(required = false)
	private ArrayOfInteressadoWS interessados;
	
	@XmlElement(required = false)
	private ArrayOfDestinatarioWS destinatarios;
	
	@XmlElement(required = false)
	private String observacao;
	
	@XmlElement(required = false)
	private String nomeArquivo;
	
	@XmlElement(required = false)
	private NivelAcessoWS nivelAcesso;
	
	@XmlElement(required = false)
	private Long idHipoteseLegal;
	
	@XmlElement(required = false)
	private String conteudo;
	
	@XmlElement(required = false)
	private byte[] conteudoMTOM;
	
	@XmlElement(required = false)
	private Long idArquivo;
	
	@XmlElement(required = false)
	private ArrayOfCampoWS campos;
	
	@XmlElement(required = false)
	private SinBloqueadoWS sinBloqueado;

	/**
	 * @return the tipo
	 */
	public TipoDocumentoWS getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(TipoDocumentoWS tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the idProcedimento
	 */
	public Long getIdProcedimento() {
		return idProcedimento;
	}

	/**
	 * @param idProcedimento
	 *            the idProcedimento to set
	 */
	public void setIdProcedimento(Long idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	/**
	 * @return the protocoloProcedimento
	 */
	public String getProtocoloProcedimento() {
		return protocoloProcedimento;
	}

	/**
	 * @param protocoloProcedimento
	 *            the protocoloProcedimento to set
	 */
	public void setProtocoloProcedimento(String protocoloProcedimento) {
		this.protocoloProcedimento = protocoloProcedimento;
	}

	/**
	 * @return the idSerie
	 */
	public Long getIdSerie() {
		return idSerie;
	}

	/**
	 * @param idSerie
	 *            the idSerie to set
	 */
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the idTipoConferencia
	 */
	public Long getIdTipoConferencia() {
		return idTipoConferencia;
	}

	/**
	 * @param idTipoConferencia
	 *            the idTipoConferencia to set
	 */
	public void setIdTipoConferencia(Long idTipoConferencia) {
		this.idTipoConferencia = idTipoConferencia;
	}

	/**
	 * @return the remetente
	 */
	public RemetenteWS getRemetente() {
		return remetente;
	}

	/**
	 * @param remetente
	 *            the remetente to set
	 */
	public void setRemetente(RemetenteWS remetente) {
		this.remetente = remetente;
	}

	/**
	 * @return the interessados
	 */
	public ArrayOfInteressadoWS getInteressados() {
		return interessados;
	}

	/**
	 * @param interessados
	 *            the interessados to set
	 */
	public void setInteressados(ArrayOfInteressadoWS interessados) {
		this.interessados = interessados;
	}

	/**
	 * @return the destinatarios
	 */
	public ArrayOfDestinatarioWS getDestinatarios() {
		return destinatarios;
	}

	/**
	 * @param destinatarios
	 *            the destinatarios to set
	 */
	public void setDestinatarios(ArrayOfDestinatarioWS destinatarios) {
		this.destinatarios = destinatarios;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the nomeArquivo
	 */
	public String getNomeArquivo() {
		return nomeArquivo;
	}

	/**
	 * @param nomeArquivo
	 *            the nomeArquivo to set
	 */
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	/**
	 * @return the nivelAcesso
	 */
	public NivelAcessoWS getNivelAcesso() {
		return nivelAcesso;
	}

	/**
	 * @param nivelAcesso
	 *            the nivelAcesso to set
	 */
	public void setNivelAcesso(NivelAcessoWS nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	/**
	 * @return the idHipoteseLegal
	 */
	public Long getIdHipoteseLegal() {
		return idHipoteseLegal;
	}

	/**
	 * @param idHipoteseLegal
	 *            the idHipoteseLegal to set
	 */
	public void setIdHipoteseLegal(Long idHipoteseLegal) {
		this.idHipoteseLegal = idHipoteseLegal;
	}

	/**
	 * @return the conteudoBase64
	 */
	public String getConteudo() {
		return conteudo;
	}

	/**
	 * @param conteudoBase64
	 *            the conteudoBase64 to set
	 */
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	/**
	 * @return the conteudoMTOM
	 */
	public byte[] getConteudoMTOM() {
		return conteudoMTOM;
	}

	/**
	 * @param conteudoMTOM
	 *            the conteudoMTOM to set
	 */
	public void setConteudoMTOM(byte[] conteudoMTOM) {
		this.conteudoMTOM = conteudoMTOM;
	}

	/**
	 * @return the idArquivo
	 */
	public Long getIdArquivo() {
		return idArquivo;
	}

	/**
	 * @param idArquivo
	 *            the idArquivo to set
	 */
	public void setIdArquivo(Long idArquivo) {
		this.idArquivo = idArquivo;
	}

	/**
	 * @return the campos
	 */
	public ArrayOfCampoWS getCampos() {
		return campos;
	}

	/**
	 * @param campos
	 *            the campos to set
	 */
	public void setCampos(ArrayOfCampoWS campos) {
		this.campos = campos;
	}

	/**
	 * @return the sinBloqueado
	 */
	public SinBloqueadoWS getSinBloqueado() {
		return sinBloqueado;
	}

	/**
	 * @param sinBloqueado
	 *            the sinBloqueado to set
	 */
	public void setSinBloqueado(SinBloqueadoWS sinBloqueado) {
		this.sinBloqueado = sinBloqueado;
	}

}
