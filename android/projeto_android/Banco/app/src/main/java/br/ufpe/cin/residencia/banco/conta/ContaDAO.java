package br.ufpe.cin.residencia.banco.conta;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Ver anotações TODO no código
@Dao
public interface ContaDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void adicionar(Conta c);

    //TODO incluir métodos para atualizar conta e remover conta

    // Método adicionado para fazer a atualização de uma conta
    @Update(onConflict = OnConflictStrategy.REPLACE)
    void atualizar(Conta c);

    // Método adicionado para fazer a remoção de uma conta
    @Delete
    void remover(Conta c);

    @Query("SELECT * FROM contas ORDER BY numero ASC")
    LiveData<List<Conta>> contas();

    //TODO incluir métodos para buscar pelo (1) número da conta, (2) pelo nome e (3) pelo CPF do Cliente


    // Método adicionado para buscar uma conta pelo número dela
    @Query("SELECT * FROM contas WHERE numero = :conta")
    Conta buscarPelaConta(String conta);

    // Método adicionado para buscar uma conta pelo cpf
    @Query("SELECT * FROM contas WHERE cpfCliente = :cpf")
    List<Conta> buscarPeloCPF(String cpf);

    // Método adicionado para buscar uma conta pelo nome
    @Query("SELECT * FROM contas WHERE nomeCliente = :nome")
    List<Conta> buscarPeloNome(String nome);

}
