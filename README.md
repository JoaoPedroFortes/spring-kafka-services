# Pré-requisitos
- **jdk 17.0.2**
- **kafka 2.13-3.70**

## Tecnologias Utilizadas

-  Java 17
-  Spring boot
-  Spring kafka
-  JPA repository
-  H2


# Sobre
## spring-kafka-services
Repositório criado para testar comunicações entre dois serviços spring, utilizando kafka para comunicação

Foram criados dois microserviços utilizando spring-boot.
 ### fortes-kafka-producer
 
   O micro-serviço recebe um objeto do tipo MessageDTO através de uma chamada http na API rest e adiciona-o ao tópico **"message.request.topic.v1"**.
  
   
![producer](https://github.com/JoaoPedroFortes/spring-kafka-services/assets/63886338/c63feb52-2bc8-4140-a50a-9b56a6a0fd68)

 MessageDTO pode ser uma nova mensagem ou uma resposta para uma mensagem já existente na base. Basta somente, para o segundo cenário, informar o atributo **"originMessageId"**
 ### fortes-kafka-consumer
   
   O micro-serviço atua como consumidor do tópico **"message.request.topic.v1"**, e a cada nova mensagem, persiste a mesma em um banco de memória h2 que pode ser acessado através do link
   **localhost:8080/h2-console**

  Também é possivel recuperar uma lista de mensagens postadas por um usuário e suas respectivas respostas através do endpoint "/user/{id}/messages:
  
  ![post messages](https://github.com/JoaoPedroFortes/spring-kafka-services/assets/63886338/1f246833-45f6-494a-a4d4-a7ae0a3899cd)


