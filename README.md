# LiterAlura - Catálogo de Libros  

Bienvenido al emocionante desafío de programación **LiterAlura**, donde crearás tu propio catálogo de libros. En este proyecto, aprenderás a interactuar con una API de libros, manipular datos JSON, almacenarlos en una base de datos y desarrollar una aplicación que permita a los usuarios explorar libros y autores de interés desde la consola.

---

## 📚 Objetivo del Proyecto  

El objetivo principal es desarrollar un **Catálogo de Libros** interactivo que:  
- Permita realizar búsquedas en una API específica para obtener información sobre libros.  
- Proporcione al usuario al menos **5 opciones de interacción** desde la consola.  
- Analice y almacene los datos obtenidos en una base de datos.  
- Filtre y muestre libros y autores según el interés del usuario.  

---

## 🛠️ Pasos del Desarrollo  

### 1. Configuración del Ambiente Java  
Asegúrate de tener configurado lo siguiente en tu entorno de desarrollo:  
- **Java JDK 11+**  
- **Maven** o **Gradle** para la gestión de dependencias.  
- IDE de tu elección (Eclipse, IntelliJ IDEA, etc.).  

### 2. Creación del Proyecto  
Crea un nuevo proyecto en tu IDE con una estructura estándar de Maven/Gradle.  

### 3. Consumo de la API  
Integra la API proporcionada para realizar solicitudes y obtener datos de libros.  
- Utiliza bibliotecas como **OkHttp** o **RestTemplate** para realizar solicitudes HTTP.  

### 4. Análisis de la Respuesta JSON  
- Procesa la respuesta JSON obtenida de la API utilizando bibliotecas como **Jackson** o **Gson**.  
- Convierte los datos en objetos Java para facilitar su manipulación.  

### 5. Inserción y Consulta en la Base de Datos  
- Configura una base de datos relacional (como **H2**, **MySQL** o **PostgreSQL**) para almacenar los libros y autores.  
- Utiliza **JPA** y **Hibernate** para mapear las entidades y realizar consultas.  

### 6. Exhibición de Resultados a los Usuarios  
- Diseña un menú interactivo en la consola con al menos **5 opciones** como:  
  - Buscar libros por título.  
  - Listar todos los libros disponibles.  
  - Filtrar libros por autor.  
  - Mostrar detalles de un libro específico.  
  - Salir de la aplicación.  

---
