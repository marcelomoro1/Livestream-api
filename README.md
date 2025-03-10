#  API de Livestreams

API desenvolvida em **Java com Spring Boot** para gerenciar transmissões ao vivo.

##  Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Atualmente sem banco de dados (em memória na implementação atual)

---

##  Como Rodar o Projeto

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Configure o projeto no seu IDE (IntelliJ, Eclipse, VS Code).**

3. **Execute a aplicação:**  
   - No terminal, use:
     ```sh
     mvn spring-boot:run
     ```

4. **Acesse a API em:**  
   - [`http://localhost:8080`](http://localhost:8080)  

---

##  Endpoints da API

###  **Listar todas as livestreams**
`GET /streams`  
Retorna uma lista de todas as transmissões cadastradas.

####  Exemplo de resposta:
```json
[
  {
    "id": "b4c9b5d8-9f3a-4f5e-872d-f7d2a7d45b6f",
    "title": "Live do Baiano",
    "description": "Uma transmissão ao vivo do streamer Baiano",
    "url": "https://www.twitch.tv/baiano",
    "startTime": "2025-03-09T10:09:00",
    "endTime": "2025-03-09T11:09:00"
  }
]
```

---

###  **Buscar uma livestream pelo ID**
`GET /streams/{id}`  
Retorna uma livestream específica pelo seu ID.

####  Exemplo de resposta:
```json
{
  "id": "b4c9b5d8-9f3a-4f5e-872d-f7d2a7d45b6f",
  "title": "Live do Baiano",
  "description": "Uma transmissão ao vivo do streamer Baiano",
  "url": "https://www.twitch.tv/baiano",
  "startTime": "2025-03-09T10:09:00",
  "endTime": "2025-03-09T11:09:00"
}
```

---

###  **Criar uma nova livestream**
`POST /streams/add`  
Adiciona uma nova transmissão ao vivo.

####  Exemplo de requisição:
```json
{
  "title": "Live do Gaules",
  "description": "Transmissão do Major de CS",
  "url": "https://www.twitch.tv/gaules",
  "startTime": "2025-04-01T15:00:00",
  "endTime": "2025-04-01T18:00:00"
}
```

####  Exemplo de resposta (201 Created):
```json
{
  "id": "e8a9f5d1-7b2a-4c6d-9e3b-fd8e2a1c6f4a",
  "title": "Live do Gaules",
  "description": "Transmissão do Major de CS",
  "url": "https://www.twitch.tv/gaules",
  "startTime": "2025-04-01T15:00:00",
  "endTime": "2025-04-01T18:00:00"
}
```

---

### **Atualizar uma livestream pelo ID**
`PUT /streams/{id}`  
Atualiza uma livestream existente.

####  Exemplo de requisição:
```json
{
  "title": "Live do Baiano (Atualizada)",
  "description": "Nova descrição",
  "url": "https://www.twitch.tv/baiano",
  "startTime": "2025-03-10T10:00:00",
  "endTime": "2025-03-10T11:30:00"
}
```

####  Resposta (204 No Content):
Nada é retornado, pois a atualização foi bem-sucedida.

---

###  **Excluir uma livestream pelo ID**
`DELETE /streams/{id}`  
Remove uma transmissão da lista.

####  Resposta (204 No Content):
Nada é retornado, pois a exclusão foi bem-sucedida.

---

##  Como Contribuir

1. **Fork** este repositório.
2. **Crie uma branch:**  
   ```sh
   git checkout -b minha-feature
   ```
3. **Faça suas alterações e commit:**  
   ```sh
   git commit -m "Adicionando nova funcionalidade"
   ```
4. **Envie para o repositório remoto:**  
   ```sh
   git push origin minha-feature
   ```
5. **Crie um Pull Request.**

---
