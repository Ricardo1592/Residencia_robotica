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

    @Update()
    void atualizar(Conta c);

    @Delete()
    void remover(Conta c);

    //TODO incluir métodos para atualizar conta e remover conta

    // Criei esse método só pra testar antes de usar o objeto livedata
    @Query("SELECT * FROM contas ORDER BY numero ASC")
    List<Conta> todasContas();
    @Query("SELECT * FROM contas ORDER BY numero ASC")
    LiveData<List<Conta>> contas();

    //TODO incluir métodos para buscar pelo (1) número da conta, (2) pelo nome e (3) pelo CPF do Cliente

}
