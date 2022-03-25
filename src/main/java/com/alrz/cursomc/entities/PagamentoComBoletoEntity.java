package com.alrz.cursomc.entities;

import com.alrz.cursomc.entities.enums.EstadoPagamento;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PAGAMENTOCOMBOLETO")
public class PagamentoComBoletoEntity extends PagamentoEntity{
    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoletoEntity() {}

    public PagamentoComBoletoEntity(Long id, EstadoPagamento estado, PedidoEntity pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}