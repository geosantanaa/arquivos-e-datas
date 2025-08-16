# Projeto Manipulação de Arquivos e Datas em Java

Bem-vindo ao projeto de manipulação de arquivos e datas! Este é um exemplo simples, mas prático, de como ler e escrever em arquivos de texto (`.txt`) e, em seguida, como formatar e trabalhar com datas e horários usando a **API de Data e Hora de Java 8+ (`java.time`)**.

---

## 📖 Sobre o Projeto

O projeto é composto por duas classes principais:

* **`ArquivoEdatas.java`**: Esta classe demonstra como ler e escrever dados (neste caso, uma data e um horário) em um arquivo de texto. Ela solicita a entrada do usuário através de janelas de diálogo do `JOptionPane`, armazena os dados em um arquivo e, em seguida, realiza a leitura e formatação dos mesmos, mostrando a conversão de `String` para `LocalDateTime`.
* **`FormatandoDatas.java`**: Esta classe se concentra na flexibilidade da formatação de datas. Ela lê datas de um arquivo, identifica a posição do mês na string da data e aplica diferentes padrões de formatação (`dd/MM/yyyy`, `MM/dd/yyyy`, etc.) para converter a string em um objeto `LocalDate`. Isso mostra a robustez da API `java.time` para lidar com múltiplos formatos de entrada de forma dinâmica.

### Funcionalidades Principais

* **Manipulação de Arquivos:** Escreve e lê de arquivos de texto usando `PrintStream` e `Scanner`.
* **API de Data e Hora (`java.time`):** Utiliza classes como `LocalDate`, `LocalDateTime` e `DateTimeFormatter` para parsear, formatar e manipular datas e horários de maneira moderna e segura.
* **Formatação Flexível:** Suporta múltiplos padrões de data (por exemplo, `dd/MM/yyyy` e `MM/dd/yyyy`) e converte-os para um formato padrão de saída.
* **Interação com o Usuário:** Usa `JOptionPane` para obter dados de entrada de forma simples.

---

## 🚀 Tecnologias Utilizadas

* **Java:** Linguagem de programação.
* **API `java.io`:** Para a manipulação de arquivos (classes `FileInputStream`, `PrintStream`, `Scanner`).
* **API `java.time`:** Para a manipulação de datas e horários.
* **`javax.swing.JOptionPane`:** Para interação com o usuário via janelas de diálogo.

---

## ⚙️ Como Rodar a Aplicação

Siga os passos abaixo para compilar e executar o projeto:

1.  **Pré-requisitos:** Certifique-se de ter o **JDK** (versão 8 ou superior) instalado em sua máquina.
2.  **Clone o repositório:**
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd [NOME_DO_SEU_PROJETO]
    ```
3.  **Compilar as classes:**
    Abra um terminal na pasta raiz do projeto e compile os arquivos `.java`.
    ```bash
    javac -cp . -d . ArquivoEdatas/ArquivoEdatas.java ArquivoEdatas/FormatandoDatas.java
    ```
4.  **Executar a aplicação:**
    Execute a classe que deseja testar.
    ```bash
    java ArquivoEdatas.ArquivoEdatas
    ```
    ou
    ```bash
    java ArquivoEdatas.FormatandoDatas
    ```
    As janelas de diálogo aparecerão para solicitar as informações. Os resultados serão exibidos no console.