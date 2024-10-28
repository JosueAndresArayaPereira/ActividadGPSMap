# Security Tips Implementados en la Aplicación

## 1. Protección contra Inyección SQL
Se utiliza **Prepared Statements** en todas las consultas a bases de datos para evitar ataques de inyección SQL. Las consultas preparadas aseguran que los datos proporcionados por el usuario no se ejecuten como parte del código SQL, evitando la manipulación maliciosa.

## 2. Autenticación Segura
La autenticación de usuarios se realiza usando **JSON Web Tokens (JWT)** o **OAuth**, y las contraseñas se cifran con algoritmos seguros como `bcrypt`, lo que asegura que las credenciales estén protegidas tanto en tránsito como en almacenamiento.

## 3. Autorización Basada en Roles
Se ha implementado un sistema de autorización basado en roles, donde solo los usuarios con privilegios específicos pueden acceder a ciertas funcionalidades. Esto asegura que solo personas autorizadas puedan realizar acciones críticas.

## 4. Uso de HTTPS para Comunicaciones Seguras
Toda la comunicación entre la aplicación y los servidores utiliza **HTTPS**, lo que garantiza que los datos en tránsito estén cifrados y protegidos contra ataques de intermediarios (MITM).

## 5. Validación y Sanitización de Entradas de Usuario
Todas las entradas del usuario son validadas y sanitizadas antes de ser procesadas. Esto incluye cualquier entrada desde formularios, parámetros de URL y solicitudes HTTP.

## 6. Almacenamiento Seguro de Datos Sensibles
Los datos sensibles, como contraseñas y tokens de sesión, se almacenan de manera segura utilizando algoritmos de cifrado robustos. Además, se asegura que los datos sensibles en tránsito también estén cifrados.

## 7. Protección contra Ataques de Fuerza Bruta
Se implementan límites de intentos de inicio de sesión y tiempos de bloqueo tras múltiples fallos, para prevenir ataques de fuerza bruta.

## 8. Gestión Segura de Sesiones
Las sesiones de los usuarios están protegidas mediante el uso de cookies seguras (con las flags `HttpOnly` y `Secure`) y tokens de sesión que se invalidan después de un tiempo de inactividad o tras el cierre de sesión.

## 9. Actualización de Dependencias
Se monitorean y actualizan regularmente las bibliotecas y dependencias de la aplicación para evitar vulnerabilidades conocidas en versiones antiguas.

## 10. Registro y Monitoreo de Eventos de Seguridad
Se implementa un sistema de registro y monitoreo de eventos de seguridad para identificar y responder a actividades sospechosas en la aplicación.
