```markdown
# 🏛️ Proyecto de Librería con Spring Boot, JPA y PostgreSQL

Este proyecto es un sistema de gestión para una librería, desarrollado como parte del examen corto #2 de la asignatura **Desarrollo de Aplicaciones Web** en la Universidad de El Salvador. Implementa un modelo de negocio completo usando Spring Boot, Spring Data JPA y PostgreSQL.

## 📌 Requisitos Cumplidos

✅ **Entidades JPA correctamente modeladas**  
✅ **Relaciones ManyToMany y OneToMany implementadas**  
✅ **Configuración automática de PostgreSQL**  
✅ **Generación de tablas con `spring.jpa.hibernate.ddl-auto=create`**  
✅ **Proyecto funcional y subido a GitHub**  

## 🛠️ Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.2.x**
- **Spring Data JPA (Hibernate)**
- **PostgreSQL**
- **Maven**

## 📂 Estructura del Proyecto

```
```
src/
├── main/
│   ├── java/com/example/libreria/
│   │   ├── model/          # Entidades JPA
│   │   │   ├── Autor.java
│   │   │   ├── Cliente.java
│   │   │   ├── Libro.java
│   │   │   ├── Venta.java
│   │   │   ├── DetalleVenta.java
│   │   ├── repository/     # Repositorios JPA
│   │   ├── LibreriaApplication.java
│   ├── resources/
│   │   ├── application.properties
```
## 🔌 Configuración de PostgreSQL
```

## 🔌 Configuración de PostgreSQL

Edita `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/libreria_db
spring.datasource.username=postgres
spring.datasource.password=tu_contraseña

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
```

## 🚀 Cómo Ejecutar el Proyecto

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/springboot-libreria.git
   ```

2. **Asegúrate de tener PostgreSQL instalado y crea la base de datos**:
   ```sql
   CREATE DATABASE libreria_db;
   ```

3. **Ejecuta la aplicación**:
   ```bash
   mvn spring-boot:run
   ```

4. **Verifica que las tablas se crearon** en tu base de datos PostgreSQL.

## 📊 Diagrama de Entidades (Relaciones JPA)

```
Libro ────┐
          │ ManyToMany
Autor ────┘

Cliente ──── OneToMany ────> Venta ──── OneToMany ────> DetalleVenta
                                               │
                                               └── ManyToOne ────> Libro
```

## 📝 Licencia

Este proyecto está bajo la licencia MIT. 

---

**🎓 Universidad de El Salvador**  
**📚 Facultad Multidisciplinaria de Occidente**  
**💻 Desarrollo de Aplicaciones Web -2025**
```

