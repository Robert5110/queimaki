package com.rapi.rapi.models.User;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rapi.rapi.models.Address.AddressEntity;
import com.rapi.rapi.models.CollectRequest.CollectrequestEntity;
import com.rapi.rapi.models.Contact.ContactEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "usuario")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser; 

    @Column(name = "nome_user")
    private String nomeUser; 

    @Column(name = "email_user")
    private String emailUser; 

    @Column(name = "senha_user")
    private String senhaUser; 

    @Column(name = "confirma_senha")
    private String confirmaSenha; 


    @ManyToMany
    private List<CollectrequestEntity> collectrequest;

}