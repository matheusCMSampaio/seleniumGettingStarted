# language: pt

  Funcionalidade: Login

    @LoginValido @SmokeTest
    Cenário: Login com credenciais validas
      Dado que estou na tela de login
      Quando entro com credenciais validas
      Entao vejo a tela Select Flight

      @LoginInvalido
    Cenário: Login com Username invalidas
      Dado que estou na tela de login
      Quando entro com username invalidas
      Entao vejo a mensagem de erro

        @LoginInvalido
    Cenário: Login com password invalidas
      Dado que estou na tela de login
      Quando entro com password invalidas
      Entao vejo a mensagem de erro

    Cenário: Realizar o Sign Off
      Dado que estou logado
      Quando clico no botao sign off
      Entao vejo a mensagem de Signed out