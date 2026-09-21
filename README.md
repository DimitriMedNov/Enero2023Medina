# Login con Hibernate

Aplicación de escritorio en Java que practica el mapeo objeto-relacional con **Hibernate**. Proyecto de la Universidad Anáhuac Mayab.

## Qué hace

Inicio de sesión y cambio de contraseña sobre una base de datos, con la interfaz en Swing.

Lo que se practica aquí es la separación por capas: la vista no sabe SQL, habla con un servicio; el servicio no sabe de la base, habla con un DAO; y el DAO es el único que conoce Hibernate. Por eso la misma aplicación corre contra **MySQL o SQLite** cambiando nada más el archivo de configuración.

| Capa | Archivos |
|---|---|
| Vista | `LoginForm`, `ChangePasswordForm` |
| Servicio | `UsuarioServicio` |
| Acceso a datos | `IUserDAO`, `UserDAO` |
| Entidad | `Usuario` |
| Configuración | `hibernate.cfg.xml` |

## Stack

Java · Hibernate · Swing · MySQL · SQLite · Maven

> `enero2023` es una versión anterior de esta misma aplicación.
