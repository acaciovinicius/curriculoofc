# Use uma imagem base apropriada
FROM maven:3.8.6-openjdk-11 AS build

# Defina o diretório de trabalho
WORKDIR /app

# Copie o conteúdo da pasta correta
COPY ./app-curriculo-main/curriculo .

# Execute o Maven
RUN mvn clean package -DskipTests

