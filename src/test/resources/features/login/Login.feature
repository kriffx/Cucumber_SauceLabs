#encoding: UTF-8
#language: pt

@login
Funcionalidade: Login no sistema Sauce Labs
  @login_sucesso
  Cenário: Login com usuário válido
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "standard_user" e senha "secret_sauce"
    Então valido o sucesso do acesso

  @login_erro
  Cenário: Login sem informar usuário e senha
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "" e senha ""
    Então valido a mensagem de erro nome de usuário é obrigatório

  @login_erro
  Cenário: Login sem informar senha
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "" e senha "secret_sauce"
    Então valido a mensagem de erro nome de usuário é obrigatório

  @login_erro
  Cenário: Login sem informar senha
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "standard_user" e senha ""
    Então valido a mensagem de erro senha é obrigatório

  @login_erro
  Cenário: Login com dados invalidos
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "qwert" e senha "1234567890"
    Então valido a mensagem de erro dados não correspondem a nenhum usuário

  @login_erro
  Cenário: Login com usuário inválido
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "qwert" e senha "secret_sauce"
    Então valido a mensagem de erro dados não correspondem a nenhum usuário

  @login_erro
  Cenário: Login com senha inválida
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "standard_user" e senha "1234567890"
    Então valido a mensagem de erro dados não correspondem a nenhum usuário

  @login_bloqueado
  Cenário: Login com usuário bloqueado
    Dado que acesso o sistema Sauce Labs
    Quando realizo acessom com usuário "locked_out_user" e senha "secret_sauce"
    Então valido a mensagem de erro usuário bloqueado