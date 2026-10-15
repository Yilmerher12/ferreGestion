# FerreGestión

Sistema de gestión para una ferretería de barrio en Bogotá, desarrollado con Java 21, Spring Boot y Maven. Es un proyecto de práctica: lo construyo módulo a módulo mientras aprendo Spring Boot, y todo el código lo escribo yo.

> **Estado:** en construcción. Actualmente en el Bloque 3 de mi ruta de aprendizaje (arquitectura en capas).

## Qué quiere resolver

Una ferretería de barrio necesita controlar su día a día. La meta del proyecto es cubrir:

- Inventario de productos y alertas de stock bajo.
- Ventas.
- Proveedores y clientes.
- Ventas a crédito ("fiado") con seguimiento de cartera, que es la funcionalidad diferencial del proyecto.

Hoy el proyecto solo tiene la base de la arquitectura; las funcionalidades se irán sumando bloque a bloque.

## Tecnologías

- Java 21
- Spring Boot
- Maven (con Maven Wrapper incluido, no hace falta instalar Maven)
- Base de datos real (PostgreSQL o MySQL, aún por elegir; se incorpora en los bloques de persistencia)

## Estructura actual

El código vive en `src/main/java/com/ferregestion/ferreGestion/` y sigue una arquitectura en capas (Controller, Service, Repository):

| Paquete | Contenido actual |
| --- | --- |
| `model` | `Product`: la entidad que representa un producto. |
| `repository` | `ProductRepository`: acceso a productos, por ahora guardados en memoria (sin base de datos). |
| `service` | `CalculateIVA` y `PriceGenerator`: lógica de cálculo de IVA y precios. |
| `controller` | Pendiente: se construirá cuando llegue la capa web. |

Todavía no hay base de datos ni endpoints.

## Cómo ejecutarlo

Requisitos: tener instalado el JDK 21.

En Windows (PowerShell), desde la raíz del repositorio:

```powershell
.\mvnw spring-boot:run
.\mvnw test
```

En Linux o macOS se usa `./mvnw` en lugar de `.\mvnw`.

## Ruta de aprendizaje

El proyecto avanza en paralelo con un plan de 16 bloques de Spring Boot:

| Bloque | Tema | Estado |
| --- | --- | --- |
| 1 | Framework, Spring, Spring Boot, Inversión de Control, Bean, `ApplicationContext` | Cerrado |
| 2 | Ciclo de vida de un Bean, `@Autowired`, `@Configuration` y `@Bean`, scopes | Cerrado |
| 3 | Creación del proyecto y arquitectura en capas | En curso |
| 4 | Persistencia con Spring Data JPA | Pendiente |
| 5 | Conexión a base de datos real | Pendiente |
| 6 | API REST | Pendiente |
| 7 | Validaciones | Pendiente |
| 8 | Manejo global de excepciones | Pendiente |
| 9 | Transacciones y consistencia de datos | Pendiente |
| 10 | Seguridad con Spring Security | Pendiente |
| 11 | Paginación, filtrado y ordenamiento | Pendiente |
| 12 | Testing | Pendiente |
| 13 | Documentación de la API (Swagger/OpenAPI) | Pendiente |
| 14 | Sistema de fiado y cartera | Pendiente |
| 15 | Buenas prácticas y perfiles de configuración | Pendiente |
| 16 | Cierre y preparación para portafolio | Pendiente |

## Cómo trabajo en este repositorio

- **Ramas:** `main` siempre contiene código que compila. Cada bloque o tarea se desarrolla en una rama propia (por ejemplo `feat/product-service`) y se integra a `main` mediante un Pull Request.
- **Commits:** en inglés, con prefijo de tipo (`feat:`, `fix:`, `docs:`, `chore:`), por ejemplo `feat: add product model, in-memory repository and pricing services`.
- **Pruebas:** por ahora se ejecutan de forma local con `.\mvnw test` antes de abrir un Pull Request. La ejecución automática de tests con GitHub Actions se incorporará en el Bloque 12.

## Sobre cómo se construye

Escribo todo el código yo mismo. Uso la IA como mentor y revisor: me explica conceptos y revisa mis cambios, pero no me da el código hecho. El objetivo es entender cada pieza y poder depurarla de forma autónoma.

## Autor

[Yilmerher12](https://github.com/Yilmerher12)
